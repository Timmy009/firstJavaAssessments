package tddProject;

    public class Television {

        private boolean isOn;
        private int volume;
        private int brightness;

        public void toggleOn() {
            isOn = !isOn;

        }

        public boolean isOn() {
            return isOn;
        }

        public void increaseVolume() {
            if (volume < 100 && isOn) volume = volume + 1;
        }

        public int getVolume() {
            return volume;
        }

        public void decreaseVolume() {
            if (volume > 0 && isOn) volume = volume - 1;
        }

        public void increaseBrightness() {
            if (brightness < 100 && isOn) brightness = brightness + 1;
        }

        public int getBrightness() {
            return brightness;
        }

        public void decreaseBrightness() {
            if (brightness > 0 && isOn) brightness = brightness - 1;
        }
    }


