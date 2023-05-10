package assignmentTwo;

public class NumberArray {

    public String [] numberArray (int number) {
        String numberString = String.valueOf(number);
        String[] arrays = new String[numberString.length()];
        for (int count = 0; count < numberString.length(); count++) {
           arrays[count] = String.valueOf(numberString.charAt(count));
        }
        return arrays;

    }
}
