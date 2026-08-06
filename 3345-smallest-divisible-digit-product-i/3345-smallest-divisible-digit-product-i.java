class Solution {
    public int smallestNumber(int n, int t) {
       for(int i=0;i<t;i++){
        int ans=n;
        int pro=1;
        while(ans!=0){
            pro=pro*(ans%10);
            ans=ans/10;
        }
        if(pro%t==0) break;
        n=n+1;
       }
       return n;
    }
}