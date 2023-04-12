package otherTask;

    public class WeatherDriver {
        public static void main(String[] args) {
            SwitchDays weatherObject1 = new SwitchDays();
            SwitchDays weatherObject2 = new SwitchDays();
            System.out.println(weatherObject1.checkWeatherCondition("sunny"));
            System.out.println(weatherObject2.checkWeatherCondition("snowy"));
            System.out.println(weatherObject2.checkWeatherCondition("foggy"));

        }
    }


