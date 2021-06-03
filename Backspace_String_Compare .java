class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = "", t1 = "";
        int cnt=0;
        int i=s.length()-1, j=t.length()-1;
        for(; i>=0 || j>=0 ;) {
            cnt=0;
            while(i>=0){
                if(s.charAt(i)=='#') {
                    ++cnt;
                    --i;
                    continue;
                } else if(cnt!=0) {
                    --cnt;
                    --i;
                    continue;
                } else break;
                
            }
            
            cnt=0;
            while(j>=0){
                if(t.charAt(j)=='#') {
                    ++cnt;
                    --j;
                    continue;
                } else if(cnt!=0) {
                    --cnt;
                    --j;
                    continue;
                } else break;
            }
            
            if(i>=0 && j>=0 && s.charAt(i)==t.charAt(j)) {
                --i; --j;
                continue;
            }    
            else
                break;
        }
       
        if(i==j && i==-1)
            return true;
        else
            return false;

    }
}
