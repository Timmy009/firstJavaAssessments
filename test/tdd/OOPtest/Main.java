package tdd.OOPtest;

import OOP.Nigeria;
import OOP.User;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setState("Lagos");
        System.out.println(user.getState());

//        System.out.println(Arrays.toString(Nigeria.NORTH_CENTRAL.getState()));
//     //   user.setState(Nigeria.valueOf("Lagos"));
for (String sta : Nigeria.SOUTH_SOUTH.getState()) {

    System.out.println(sta);
}
        System.out.println(Arrays.toString(Nigeria.NORTH_CENTRAL.getState()));
//        System.out.println(user.getState().toString());
    }

}
