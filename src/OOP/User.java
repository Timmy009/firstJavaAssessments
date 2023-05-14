package OOP;

public class User {
    private Nigeria state;


    public void setState(String state) {
       setSouthWest(state);
      setNorthCentral(state);
        setNorthEast(state);
       setSouthSouth(state);
       setNorthWest(state);
       setSouthEast(state);

     }
     private void setSouthWest(String state) {
         for (String statez : Nigeria.SOUTH_WEST.getState()) {
             if (statez == state) {
                 this.state = Nigeria.SOUTH_WEST;
             }
         }
     }
     private void setNorthEast(String state) {
         for (String statez : Nigeria.NORTH_EAST.getState()) {
             if (statez == state) {
                 this.state = Nigeria.NORTH_EAST;
             }
         }
     }
     private void setNorthCentral(String state) {
         for (String statez : Nigeria.NORTH_CENTRAL.getState()) {
             if (statez == state) {
                 this.state = Nigeria.NORTH_CENTRAL;
             }
         }
     }
     private void setSouthEast (String state) {
         for (String statez : Nigeria.SOUTH_EAST.getState()) {
             if (statez == state) {
                 this.state = Nigeria.SOUTH_EAST;
             }
         }
     }
private void setSouthSouth (String state) {
    for (String statez : Nigeria.SOUTH_SOUTH.getState()) {
        if (statez == state) {
            this.state = Nigeria.SOUTH_SOUTH;
        }
    }
}

     private void setNorthWest(String state) {
         for (String statez : Nigeria.NORTH_WEST.getState()) {
             if (statez == state) {
                 this.state = Nigeria.NORTH_WEST;
             }
         }
     }
    public Nigeria getState() {
        return state;
    }


}
