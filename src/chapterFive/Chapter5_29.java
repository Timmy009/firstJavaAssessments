package chapterFive;


    public class Chapter5_29 {
        public static void main(String[] args) {
            int days = 1;
            int maxDays = 12;
            while (days <= maxDays) {
                System.out.printf("On the %S day of christmas my true love sent to me. and %n", number(days));
                switch (days) {
                    case 12:
                        System.out.println("Twelve drummers drumming");
                    case 11:
                        System.out.println("Eleven pipers piping");
                    case 10:
                        System.out.println("Ten lords a-leaping");
                    case 9:
                        System.out.println("Nine ladies dancing");
                    case 8:
                        System.out.println("Eight maids a-milking");
                    case 7:
                        System.out.println("Seven swans a-swimming");
                    case 6:
                        System.out.println("Six geese a-laying");
                    case 5:
                        System.out.println("Five golds rings");
                    case 4:
                        System.out.println("Four calling birds");
                    case 3:
                        System.out.println("Three French hens");
                    case 2:
                        System.out.println("Two turtle doves, and");
                    case 1:
                        System.out.println("A partridge in a pear tree");
                }
                System.out.println();
                days++;
            }
        }
        private static String number (int days) {
            switch (days) {
                case 1:
                    return "first";
                case 2:
                    return "Second";
                case 3:
                    return "Third";
                case 4:
                    return "Fourth";
                case 5:
                    return "fifth";
                case 6:
                    return "sixth";
                case 7:
                    return  "Seventh";
                case 8:
                    return "Eight";
                case 9:
                    return  "Ninth";

                case 10:
                    return  "Tenth";

                case 11:
                    return  "Eleventh";

                case 12:
                    return  "Twelve";
                default: return "";
            }
        }



}
