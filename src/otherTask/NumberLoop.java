package otherTask;

    public class NumberLoop {
        public static void main(String[] args) {
            int count = 1;
            String pre = "st";
            while (count <= 10) {
                if (count == 2) {pre = "nd";}
                if (count == 3) {pre = "rd";}
                if (count >= 3) {pre = "th";}
                System.out.println(count + pre);
                count++;
            }
        }
    }


