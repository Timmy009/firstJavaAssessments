package assignmentTwo;

public class ArrayConcantenation {

    public int [] arrayCon (int [] arraysOne, int [] arrayTwo) {
        int [] array = new int [arraysOne.length + arrayTwo.length];
      for (int count = 0; count < arraysOne.length; count++) {
          array[count] += arraysOne[count];
      }
      int countTwo = arraysOne.length;
        for (int count = 0; count < arrayTwo.length; count++) {

            array[countTwo] += arrayTwo[count];
            countTwo++;
        }
        return array;
    }
}
