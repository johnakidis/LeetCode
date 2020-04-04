class Solution {
    public int sum(int n){
        int sum=0,digit=0;
        while(n>0){
            digit=n%10;
            n=n/10;
            sum+=digit*digit;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        ArrayList<Integer> dubl=new ArrayList<Integer>();
        while(n!=1){
            dubl.add(n);
            n=sum(n);
            if(dubl.contains(n))
                return false;
        }
        return true;
    }
}