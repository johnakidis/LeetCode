class Solution {
    public String backs(String S){
        int s=0;
        while((s=S.indexOf('#'))!=-1){
            if(s==0){
                S=S.substring(1,S.length());
                continue;
            }
            if(s==1){
                S=S.substring(2,S.length());
                continue;
            }
            S=S.substring(0,s-1)+S.substring(s+1,S.length());
        }
        return S;
    }
    public boolean backspaceCompare(String S, String T) {
        S=backs(S);
        T=backs(T);
        if(S.equals(T))
            return true;
        return false;
    }
}