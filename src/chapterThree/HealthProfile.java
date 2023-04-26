package chapterThree;

import java.time.LocalDate;
import java.util.Scanner;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private String gender;
    private int heigth;
    private int weight;

    public HealthProfile(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String gender, int heigth, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.heigth = heigth;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int calculateAge () {
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - yearOfBirth;
        if (monthOfBirth >= currentDate.getMonthValue() && dayOfBirth > currentDate.getDayOfMonth()) {
            age--;
        }
        return age;
    }

    public int calculateHeartRate () {
        int age = calculateAge();
        return 220 - age;
    }
    public String calculateTargetHeartRate () {
        int heartRate = calculateHeartRate();
        int lowerTargetRange = (int) (0.5 * heartRate);
        int higherTargetRange = (int) (0.85 * heartRate);
        return "The lower range for the target health rate is " + lowerTargetRange + " while the higher is " + higherTargetRange;
    }


       public int calculateBMI () {
           return (weight * 703) / (heigth * heigth);
       }
}
