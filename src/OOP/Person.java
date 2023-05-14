package OOP;

import java.util.ArrayList;

public class Person {

    private ArrayList<Type> problem = new ArrayList<>();


    public void addProblem(Type type) {
        problem.add(type);
    }
    public void solveProblem(Type type) {
        problem.remove(type);
    }
    public String getProblem () {
        return problem.toString();
    }
}
