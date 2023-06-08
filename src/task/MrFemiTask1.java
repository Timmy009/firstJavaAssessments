package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MrFemiTask1 {




    public String rev(String inp) {
        List<String > arrs = new ArrayList<>();
       String res = "";

        for (String x : inp.split(" ")) {
                arrs.add(x);

            }

        for (int count = arrs.size()-1; count >= 0; count--) {
          res += arrs.get(count) + " ";
        }
        System.out.println(res);
        return res;
    }


    public String validate (String inp) {
        String value = "";
        for (int count = 0; count < inp.length(); count++) {
            if (value == "valid") {
                break;
            }
            if (value == "invalid") {
                break;
            }
            if (inp.charAt(count) == '<') {
                throw new InvalidException("THIS IS INVALID");
            }
            if (inp.charAt(count) == '>') {
                throw new InvalidException("THIS IS INVALID");
            }
            if (inp.charAt(count) == '(') {
               for (int countTwo = 0; countTwo < inp.length(); countTwo++) {
                   if (inp.charAt(countTwo) != ')') {
                      value = "invalid";
                   }
                   if (inp.charAt(countTwo) == ')') {
                       value = "valid";
                   }
               }

            }

            if (inp.charAt(count) == '{') {
                for (int countTwo = 0; countTwo < inp.length(); countTwo++) {
                    if (inp.charAt(countTwo) != '}') {
                        value = "invalid";
                    }
                    if (inp.charAt(countTwo) == '}') {
                        value = "valid";
                    }
                }

            }


            if (inp.charAt(count) == '[') {
                for (int countTwo = 0; countTwo < inp.length(); countTwo++) {

                     if (inp.charAt(countTwo) == ']') {
                     value = "valid";

                    }

                    if (inp.charAt(countTwo) != ']') {
                        value = "invalid";

                    }

                    }

                }


            if (inp.charAt(count) == ')') {
                for (int countTwo = 0; countTwo < inp.length(); countTwo++) {
                    if (inp.charAt(countTwo) == '(') {
                        value = "valid";
                    }
                    if (inp.charAt(countTwo) != '(') {
                        value = "invalid";
                    }
                }

            }

            if (inp.charAt(count) == '}') {

                for (int countTwo = 0; countTwo < inp.length(); countTwo++) {

                    if (inp.charAt(countTwo) == '{') {
                        value = "valid";
                    }
                    if (inp.charAt(countTwo) != '{') {
                        value = "invalid";
                    }
                }

            }


            if (inp.charAt(count) == ']') {
                for (int countTwo = 0; countTwo < inp.length(); countTwo++) {

                    if (inp.charAt(countTwo) != '[') {
                        value = "invalid";

                    }

                    if (inp.charAt(countTwo) == '[') {
                        value = "valid";

                    }

                }

            }


        }

       if (value == "invalid") {
           return "invalid";
       }
       return value;
    }



    public boolean phoneN (String phoneNumber) {
       if (phoneNumber.startsWith("080") || phoneNumber.startsWith("070") || phoneNumber.startsWith("090") || phoneNumber.startsWith("081") || phoneNumber.startsWith("091") )       {
           if (Pattern.matches("[0-9]{11}", phoneNumber)) {
               return true;
           }
       }


        if (phoneNumber.startsWith("+234-80") || phoneNumber.startsWith("+234-70") || phoneNumber.startsWith("+234-90")  )       {
            if (Pattern.matches("[0-9]{10}", phoneNumber.substring(7, 13))) {
                return true;
            }
        }


        if (phoneNumber.startsWith("(+234)-80") || phoneNumber.startsWith("(+234)-70") || phoneNumber.startsWith("(+234)-90")) {
            if (Pattern.matches("[0-9]{10}", phoneNumber.substring(9, 17))) {
                return true;
            }
        }





return false;
    }
}
