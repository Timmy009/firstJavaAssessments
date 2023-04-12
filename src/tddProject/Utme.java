package tddProject;

public class Utme {

        public int testDrillerUtme (int unit) {
            int price = 0;
            if (unit >= 1) {if (unit <= 5) price = 2000;}
            if (unit >= 5) {if (unit <= 9) price = 1800;}
            if (unit >= 10) {if (unit <= 29) price = 1600;}
            if (unit >= 30) {if (unit <= 49) price = 1500;}
            if (unit >= 50) {if (unit <= 99) price = 1300;}
            if (unit >= 100) {if (unit <= 199) price = 1200;}
            if (unit >= 200) {if (unit <= 499) price = 1100;}
            if (unit >= 500)  {price = 1000;}
            if (unit < 1)  {System.out.println("Number must be greater than 0");
                System.out.println(price = 0);}
            return unit * price;
        }
    }



