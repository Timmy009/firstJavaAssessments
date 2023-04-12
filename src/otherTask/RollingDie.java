package otherTask;

import java.security.SecureRandom;


    public class RollingDie {
        public static void main(String[] args) {
            SecureRandom random = new SecureRandom();
            int count = 1;
            int frequency1 = 0;
            int frequency2 = 0;
            int frequency3 = 0;
            int frequency4 = 0;
            int frequency5 = 0;
            int frequency6 = 0;
            while (count <= 60000000) {
                int result = 1 + random.nextInt(6);
                switch (result) {
                    case 1:
                        frequency1++;
                        break;
                    case 2:
                        frequency2++;
                        break;
                    case 3:
                        frequency3++;
                        break;
                    case 4:
                        frequency4++;
                        break;
                    case 5:
                        frequency5++;
                        break;
                    case 6:
                        frequency6++;
                        break;
                }
                count++;
            }
            System.out.println("Face \t Frequency");
            System.out.println("Frequency 1\t" + frequency1);
            System.out.println("Frequency 2\t" + frequency2);
            System.out.println("Frequency 3\t" + frequency3);
            System.out.println("Frequency 4\t" + frequency4);
            System.out.println("Frequency 5\t" + frequency5);
            System.out.println("Frequency 6\t" + frequency6);
            System.out.println(frequency1 + frequency2 + frequency3 + frequency4 + frequency5 + frequency6);
        }
    }

