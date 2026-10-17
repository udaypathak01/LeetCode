class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
       
        while(true){
        int sum=0;
            while(n!=0){
            int a=n%10;
            sum+=a*a;
            n/=10;
        }
        if(sum==1)return true;
        n=sum;
        if(set.contains(n))return false;
        set.add(n);
        }
       
        
    }
}