package chapterSix;

public class Exercise6_23 {
        public static String pallindrome (String number){
            StringBuilder reverse = new StringBuilder();
            int count = 4;
            while (count >= 0) {
                reverse.append(number.charAt(count));
                count--;
            }
            if (number.contentEquals(reverse)) {return "It is a pallindrome";}
            else {return "It is not a pallindrome";}
        }
    }
