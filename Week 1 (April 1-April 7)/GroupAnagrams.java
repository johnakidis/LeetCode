class Solution {
    public boolean match(String word,String word_2){
        if(word.length()!=word_2.length())
            return false;
        if(word.equals(word_2))
            return true;
        for(int i=0;i<word.length();i++){
            int pos;
            pos=word_2.indexOf(word.charAt(i));
            if(pos==-1)
                return false;
            if(pos==0){
                word_2=word_2.substring(1);
                continue;
            }
            if(pos==word_2.length()-1){
                word_2=word_2.substring(0,pos);
                continue;
            }
            word_2=word_2.substring(0,pos)+word_2.substring(pos+1);
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<List<String>>();
        HashMap<Integer,Integer> checked=new HashMap<Integer,Integer>();
        for(int i=0;i<strs.length;i++){
            if(checked.containsKey(i))
                continue;
            String word=strs[i];
            ArrayList<String>temp=new ArrayList<String>();
            temp.add(word);
            checked.put(i,i);
            for(int j=i+1;j<strs.length;j++){
                if(checked.containsKey(j))
                    continue;
                String word_2=strs[j];
                if((match(word,word_2))&&(match(word_2,word))){
                    temp.add(word_2);
                    checked.put(j,j);
                }   
            }
            res.add(temp);
        }
        return res;
    }
}