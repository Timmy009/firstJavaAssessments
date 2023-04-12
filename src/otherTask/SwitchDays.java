package otherTask;

    public class SwitchDays {

        public String checkWeatherCondition (String weatherCondition) {
            return switch (weatherCondition) {
                case "sunny" -> "Put on Shades";
                case "windy" -> "Wear Jacket";
                case "rainy" -> "Take Umbrealla";
                case "snowy" -> "Stay at home";
                default -> "check your weather";
            };

        }
    }


