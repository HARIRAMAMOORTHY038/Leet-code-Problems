class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a=coordinates.charAt(1);
        int n=(int)a-'0';
        int let=(int)coordinates.charAt(0);
        if((let%2==0&&n%2!=0)||(let%2!=0&&n%2==0))return true;
        else return false;
    }
}