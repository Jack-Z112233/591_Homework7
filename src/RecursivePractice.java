public class RecursivePractice {
    //first easy question:
    public static int multiplyOdds(int n){
        if (n <= 0){ //exception that n must be positive
            throw new IllegalArgumentException("n should be greater than 0");
        }
        if (n == 1){ //base case
            return 1;
        }
        return (2*n-1)*multiplyOdds(n-1);
    }
    //second easy question:
    public static int countSubstrings(String word, String subString){
        if(word.length() < subString.length()){ //base case: word is too short
            return 0;
        }
        if (word.substring(0, subString.length()).equals(subString)){ //recursive case
            return 1 + countSubstrings(word.substring(1), subString);
        }
        else{
            return countSubstrings(word.substring(1), subString);
        }
    }
    public static int digitMatch(int x, int y){
        if (x == 0 || y == 0){ //base case
            return 0;
        }
        int lastDigitX = x % 10;
        int lastDigitY = y % 10;
        if (lastDigitX == lastDigitY){
            return 1+ digitMatch(x / 10, y / 10);
        }
        else{
            return digitMatch(x / 10, y / 10);
        }
    }
    public static double permutation(int n, int r){
        if(n < r || n < 0 || r < 0){
            throw new IllegalArgumentException("n or r invalid, n needs to < r and both greater than 0");
        }
        if (r == 0){
            return 1;
        }
        return n *permutation(n-1, r-1);
    }
}
