package tddProject;

    public class Bike {
        private int speed;
        private boolean bikeOn;
        private int gear;

        public Bike() {
        }

        public Bike(int speed, int gear) {
            this.speed = speed;
            this.gear = gear;
        }

        public Bike(int speed) {
            this.speed = speed;
        }

        public void bikeSwitch (boolean bikeOn) {
            this.bikeOn = bikeOn;
        }
        public boolean isOn () {
            return bikeOn;
        }

        public void increaseGear(int gear) {
            this.gear = gear;
            if (bikeOn) {
                if (gear == 1 && speed <= 20) speed += 1;
                else if (gear == 2 && speed <= 30 && speed > 20) speed += 2;
                else if (gear == 3 && speed <= 40 && speed > 30) speed += 3;
                else if (gear == 4 && speed > 40) speed += 4;
                else speed = 0;
            }
        }
        public void decreaseGear(int gear) {
            this.gear = gear;
            if (gear == 1) speed -= 1;
            else if (gear == 2 ) speed -= 2;
            else if (gear == 3) speed -= 3;
            else if (gear == 4) speed -= 4;
            else speed = 0;

        }

        public int getSpeed() {
            return speed;
        }


    }
