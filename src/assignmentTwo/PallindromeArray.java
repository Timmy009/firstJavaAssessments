package assignmentTwo;

public class PallindromeArray {


    public String paalindrome(String input) {
        String reversedInput = "";
        for (int count = input.length(); count > 0; count--) {
            reversedInput += input.charAt(count-1);

        }
        if (reversedInput.equals(input)) {
            return "It is a pallindrome";
        }
        else { return "It is not a pallindrome";}
    }
}
