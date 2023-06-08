package task;

public class TimiArray {
    private int [] timArray = new int[5];

    public void myAdd(int element) {
        int lenghtCount = 0;
        for (int count = 0; count < timArray.length; count++) {
            if (timArray[count] != 0) {
                lenghtCount++;
            }
        }
        timArray[lenghtCount] = element;
    }

    public void myremove() {
        int lenghtCount = 0;
        for (int count = 0; count < timArray.length; count++) {
            if (timArray[count] != 0) {
                lenghtCount++;
            }
        }
        timArray[lenghtCount] = 0;
    }


    public void myExpand() {
        int lenghtCount = 0;
        for (int count = 0; count < timArray.length; count++) {
            if (timArray[count] != 0) {
                lenghtCount++;
            }
        }

        if (lenghtCount== timArray.length) {
            int [] timArray2 = new int[timArray.length*2];

        }

      for (int count = 0; count < timArray.length; count++) {
          if (timArray[count] != 0) {
              lenghtCount++;
          }
      }
    }
}
