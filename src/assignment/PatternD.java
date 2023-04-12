package assignment;

public class PatternD {

                public static void main(String[] args) {
                    int count = 0;
                    while (count < 6) {

                        int countTwo = 0;
                        int countThree = 1;
                        while (countTwo < 6) {
                            if (countTwo < count) {
                                System.out.print("  ");
                            }
                            else {
                                System.out.print(" " + countThree);
                                countThree++;
                            }
                            countTwo++;
                        }
                        System.out.println();
                        count++;

                    }
                }
            }

