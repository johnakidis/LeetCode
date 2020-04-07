class Solution {
    public int countElements(int[] arr) {
        int l=arr.length;
        int c=0;
        HashMap<Integer,Integer> all=new HashMap<Integer,Integer>();
        for(int i=0;i<l;i++){
            all.put(arr[i],1);
        }
        for(int i=0;i<l;i++){
            if(all.containsKey(arr[i]+1))
                c++;
        }
        return c;
    }
}