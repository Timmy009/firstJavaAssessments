//package chapterSeven;
//
//import java.security.SecureRandom;
//
//
//
//public class LetterGame {
//
//    public String generateWord() {
//        SecureRandom random = new SecureRandom();
//        String [] words = { {"p"}, {}
//                , "book", "school", "teacher", "best", "white", "red", "java", "blue", "come", "jump"};
//        int randomNumber = random.nextInt(12);
//        String generatedWord = "";
//
//        for (int count = 0; count < words.length; count++) {
//            if (randomNumber == count) {
//                generatedWord = words[count];
//            }
//
//        }
//       return generatedWord;
//    }
//
//    public Object displayWords () {
//        String stars = "";
//        for (int count = 0; count < generateWord().length() ; count++) {
//               stars = "*";
//        }
//            return stars;
//    }
//
//
//
//    public void game (char answer) {
//        for (int count = 0; count < generateWord().length(); count++) {
//           if (generateWord().charAt(count) == answer) {
//          displayWords()  = answer;
//           }
//            System.out.println(displayWords());
//        }
//
//    }
//
//    }
////    public void game (String answer) {
////        int countTwo = 0;
////        while (starEquivalent.charAt(countTwo) == convertToAsterick().charAt(countTwo)) {
////        System.out.println("Enter a letter in word " + convertToAsterick());
////
////        for (int count = 0; count < generateWord().length(); count++) {
////            starEquivalent = "*";
////            if (generateWord().charAt(count) == answer.charAt(0)) {
////                starEquivalent = String.valueOf(answer);
////            }
////            System.out.print("Enter a letter in word " + convertToAsterick());
////        }
////
////    }
////    }
//
