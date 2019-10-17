
    import java.io.*;
    import java.util.*;
    import java.text.*; 
    import java.lang.*;
    import java.math.*;
 
public class Main{
/*********************************************Constants******************************************/
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long mod=(long)1e9+7;
    static long mod1=998244353;
    static boolean sieve[];
    static ArrayList<Integer> primes;
    static ArrayList<Long> factorial;
    static HashSet<Pair> graph[];
    static boolean oj = System.getProperty("ONLINE_JUDGE") != null;
/****************************************Solutions Begins***************************************/
    static int first[],height[];
    static ArrayList<Integer> euler;
    static class segmentTree{
        int n=0;
        int[] lo,hi;
        int[] value;
        segmentTree(int n){
            this.n=n;
            lo=new int[4*n+1];
            hi=new int[4*n+1];
            value=new int[4*n+1];
            init(1,1,n);
        } 
        void init(int i,int left,int right){
            lo[i]=left;
            hi[i]=right;
            if(left==right){
                return;
            }
            int mid=(left+right)/2;
            init(2*i,left,mid);
            init(2*i+1,mid+1,right);
        }
        void update(int left,int right,int val){
            update(1,left,right,val);
        }
        
        int query(int left,int right){
            return query(1,left,right);
        }
        void update(int i,int left,int right,int val){
            if(left>hi[i]||right<lo[i]){
                return ;
            }
            if(lo[i]==hi[i]){
                value[i]=val;
                return ;
            }
            update(2*i,left,right,val);
            update(2*i+1,left,right,val);
            int l=value[2*i];
            int r=value[2*i+1];
            int ans=0;
            if(l==-1&&r==-1){
                ans=-1;
            }
            else if(l==-1){
                ans=r;
            }
            else if(r==-1){
                ans=l;
            }
            else{
                if(height[l]>=height[r]){
                    ans=r;
                }
                else{
                    ans=l;
                }
            }
            value[i]=ans;
            return;
        }
        int query(int i,int left,int right){
            if(left>hi[i]||right<lo[i]){
                return -1;
            }
            if(lo[i]>=left&&hi[i]<=right){
                return value[i];
            }
            int l=query(2*i,left,right);
            int r=query(2*i+1,left,right);
            int ans=0;
            if(l==-1&&r==-1){
                ans=-1;
            }
            else if(l==-1){
                ans=r;
            }
            else if(r==-1){
                ans=l;
            }
            else{
                if(height[l]>=height[r]){
                    ans=r;
                }
                else{
                    ans=l;
                }
            }
            return ans;
        }
    }
    static void dfs(int start,int par,int h){
        first[start]=euler.size();
        height[start]=h;
        euler.add(start);
        for(Pair p:graph[start]){
            if(p.u!=par){
                dfs(p.u,start,h+1);
                euler.add(start);
            }
        }
    }
    public static void main (String[] args) throws Exception {
        String st[]=br.readLine().split(" ");
        int n=Integer.parseInt(st[0]);
        Makegraph(n+1);
        for(int i=0;i<n-1;i++){
            st=br.readLine().split(" ");
            int a=Integer.parseInt(st[0]);
            int b=Integer.parseInt(st[1]);
            addEdge(a,b,1);
            addEdge(b,a,1);
        }
        first=new int[n+1];
        height=new int[n+1];
        euler=new ArrayList<>();
        dfs(1,1,1);
        segmentTree seg=new segmentTree(euler.size());
        // debug(first);
        // debug(height);
        // debug(euler);
        // debug(seg.lo);
        // debug(seg.hi);
        for(int i=1;i<=euler.size();i++){
            seg.update(i,i,euler.get(i-1));
           // debug(seg.value);
        }
        // debug(seg.value);
        st=br.readLine().split(" ");
        int q=Integer.parseInt(st[0]);  
        while(q-->0){
            st=br.readLine().split(" ");
            int r=Integer.parseInt(st[0]);
            int u=Integer.parseInt(st[1]);
            int v=Integer.parseInt(st[2]);
            int fr=first[r];
            int fu=first[u];
            int fv=first[v];
            int ss=Math.min(fu,fv)+1;
            int ee=Math.max(fu,fv)+1;
            int uv=seg.query(ss,ee);
            ss=Math.min(fu,fr)+1;
            ee=Math.max(fu,fr)+1;
            int ru=seg.query(ss,ee);
            ss=Math.min(fv,fr)+1;
            ee=Math.max(fv,fr)+1;
            int rv=seg.query(ss,ee);
            int ans=0;
           // debug(uv,ru,rv);
            if(ru==rv){
                out.println(uv);
                continue;
            }
            if(ru==uv){
                out.println(rv);
                continue;
            }
            if(rv==uv){
                out.println(ru);
                continue;
            }
        }
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
/****************************************Template Begins************************************************/
    static String[] nl() throws Exception{
        return br.readLine().split(" ");
    }
    static String[] nls() throws Exception{
        return br.readLine().split("");
    }
    static int pi(String str) {
        return Integer.parseInt(str);
    }
    static long pl(String str){
        return Long.parseLong(str);
    }
    static double pd(String str){
        return Double.parseDouble(str);
    }
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.00000000000000000"); 
        out.println(ft.format(d));
    }
/**************************************Bit Manipulation**************************************************/
    static void printMask(long mask){
        System.out.println(Long.toBinaryString(mask));
    }
    static int countBit(int mask){
        int ans=0;
        while(mask!=0){
            if(mask%2==1){
                ans++;
            }
            mask/=2;
        }
        return ans;
    }
/******************************************Graph*********************************************************/
    static void Makegraph(int n){
        graph=new HashSet[n];
        for(int i=0;i<n;i++){
            graph[i]=new HashSet<>();
        }
    }
    static void addEdge(int a,int b,int c){
        graph[a].add(new Pair(b,c));
    }    
/*********************************************PAIR********************************************************/
    static class PairComp implements Comparator<Pair>{
        public int compare(Pair p1,Pair p2){
            if(p1.u!=p2.u){
                return p1.u-p2.u;
            }
            else{
                return p1.u-p2.u;
            }
        }
    }
    static class Pair implements Comparable<Pair> {
        int u;
        int v;
        int index=-1;
        public Pair(int u, int v) {
            this.u = u;
            this.v = v;
        }
 
        public int hashCode() {
            int hu = (int) (u ^ (u >>> 32));
            int hv = (int) (v ^ (v >>> 32));
            return 31 * hu + hv;
        }
 
        public boolean equals(Object o) {
            Pair other = (Pair) o;
            return u == other.u && v == other.v;
        }
 
        public int compareTo(Pair other) {
            if(index!=other.index)
                return Long.compare(index, other.index);
            return Long.compare(v, other.v)!=0?Long.compare(v, other.v):Long.compare(u, other.u);
        }
 
        public String toString() {
            return "[u=" + u + ", v=" + v + "]";
        }
    }
/******************************************Long Pair*************************************************/
    static class PairCompL implements Comparator<Pairl>{
        public int compare(Pairl p1,Pairl p2){
            long aa=p2.v-p1.v;
            if(aa<0){
                return -1;
            }
            else if(aa>0){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    static class Pairl implements Comparable<Pairl> {
            long u;
            long v;
            int index=-1;
            public Pairl(long u, long v) {
                this.u = u;
                this.v = v;
            }
    
            public int hashCode() {
                int hu = (int) (u ^ (u >>> 32));
                int hv = (int) (v ^ (v >>> 32));
                return 31 * hu + hv;
            }
    
            public boolean equals(Object o) {
                Pair other = (Pair) o;
                return u == other.u && v == other.v;
            }
    
            public int compareTo(Pairl other) {
                if(index!=other.index)
                    return Long.compare(index, other.index);
                return Long.compare(v, other.v)!=0?Long.compare(v, other.v):Long.compare(u, other.u);
            }
    
            public String toString() {
                return "[u=" + u + ", v=" + v + "]";
            }
        }
/*****************************************DEBUG***********************************************************/
    public static void debug(Object... o) {
        if(!oj)
        System.out.println(Arrays.deepToString(o));
    }
/************************************MODULAR EXPONENTIATION***********************************************/
    static long modulo(long a,long b,long c) {
        long x=1;
        long y=a;
        while(b > 0){
            if(b%2 == 1){
                x=(x*y)%c;
            }
            y = (y*y)%c; // squaring the base
            b /= 2;
        }
        return  x%c;
    }
/********************************************GCD**********************************************************/
    static long gcd(long x, long y)
    {
        if(x==0)
            return y;
        if(y==0)
            return x;
        long r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
/******************************************SIEVE**********************************************************/
    static void sieveMake(int n){
        sieve=new boolean[n];
        Arrays.fill(sieve,true);
        sieve[0]=false;
        sieve[1]=false;
        for(int i=2;i*i<n;i++){
            if(sieve[i]){
                for(int j=i*i;j<n;j+=i){
                    sieve[j]=false;
                }
            }
        }
        primes=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(sieve[i]){
                primes.add(i);
            }
        }        
    }
/********************************************End***********************************************************/
}