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
    public static int countSubStrings(String word, String subString){
        if(word.length() < subString.length()){ //base case: word is too short
            return 0;
        }
        if (word.substring(0, subString.length()).equals(subString)){
            return 1 + countSubStrings(word.substring(1), subString);
        }
        else{
            return countSubStrings(word.substring(1), subString);
        }
    }
}
