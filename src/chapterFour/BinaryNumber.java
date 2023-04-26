package chapterFour;

public class BinaryNumber {
    public int calculateDecimal(String binary) {
        int binaryNumber;
        int decimal = 0;
        char binaryDigit;
        int countTwo = 1;
        int count = 0;
        while (count < binary.length()) {
            binaryDigit = binary.charAt(count);
            binaryNumber = Character.getNumericValue(binaryDigit);
            decimal = decimal + binaryNumber * countTwo;
            countTwo = countTwo * 2;
            count++;}
            return decimal;
        }
}