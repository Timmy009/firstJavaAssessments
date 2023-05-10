package assignmentTwo;

public class EvenNumber {

    public String getEvenNumber (int [] arrays) {
        String even = "";
        for (int count = 0; count < arrays.length; count++) {
            if ((count +1) % 2 == 0) {
                even += arrays[count] + " ";
            }

        }
        return even;
    }
}
