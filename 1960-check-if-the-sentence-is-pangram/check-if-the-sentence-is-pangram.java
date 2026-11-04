class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> let=new HashSet<>();
        for(int i=0;i<sentence.length();i++)
        {
            let.add(sentence.charAt(i));
        }
        if(let.size()==26) return true;
        else return false;
    }
}