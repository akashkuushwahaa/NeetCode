//https://neetcode.io/problems/is-palindrome/question?list=neetcode150
package solutions.twoPointers;

public class PalindromeMain {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        PalindromeSolution sol = new PalindromeSolution();
        boolean result = sol.isPalindrome(s);

        System.out.println("Is Palindrome: " + result);
    }
}

class PalindromeSolution {

    public boolean isPalindrome(String s) {

        StringBuilder newStr = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }

        return newStr.toString().equals(newStr.reverse().toString());
    }
}
