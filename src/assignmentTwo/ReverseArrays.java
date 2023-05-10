package assignmentTwo;

public class ReverseArrays {

    public int [] getReversedArray (int [] array) {
        int [] reversed = new int[array.length];
     for (int count = 0; count < array.length; count++)   {
         reversed[count] = array[(array.length -1)- count];
     }
       return reversed;
    }




}
