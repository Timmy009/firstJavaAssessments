package otherTask;

public class DateTask {
    public  String dateConvert (double seconds) {
        int years = (int) (seconds / 31536000 );
        seconds =  (seconds % 31536000 );
        int months = (int) (seconds / 2628288);
        seconds =  (seconds % 2628288);
        int day = (int) (seconds / 86400);

        return years + " years " + months + " months " + day + " days ";
    }
}