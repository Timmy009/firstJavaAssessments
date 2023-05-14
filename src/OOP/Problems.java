package OOP;



public class Problems {

   private String name;
   private boolean isSolved;
   private Type type;

    public Problems(String name, Type type) {
        this.name = name;
        this.type = type;
    }
    public boolean getStatus () {
        return isSolved;
    }
}
