package chapterSeven;

import java.util.ArrayList;

public class DuplicateElimination {

    private ArrayList<Integer> arrays;


    public ArrayList<Integer> getArrays() {
        return arrays;
    }


    public void setArrays (ArrayList<Integer> arrays) {
      this.arrays = arrays;
      for (int count = 0; count < 10; count++) {
          arrays.add(count, -1);
      }
  }

  public String removeDuplicate (ArrayList<Integer> numbers) {
      arrays = numbers;
      String duplicate = "";
      // remove duplicate
      for (int count = 0; count < numbers.size(); count++){
          for (int countTwo = 1; countTwo < numbers.size(); countTwo++){
                if (numbers.get(count) == numbers.get(countTwo)); {
                    duplicate = "There is a duplicate";
              }

          }
      }
      return duplicate;
  }

}
