package chapterThree;

import java.time.LocalDate;

public class HeartRateCalculator {
    private String firstName;
    private String lastName;
    private String dateOfBirth;


    public HeartRateCalculator(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;


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

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

  public int getAge () {
      String yearOfBirth = "";
      for (int index = dateOfBirth.length()- 4; index < dateOfBirth.length(); index++)
          yearOfBirth = getYear(index, yearOfBirth);
      int year = Integer.parseInt(yearOfBirth);
      LocalDate currentYear = LocalDate.now();
      return currentYear.getYear() - year;

  }

  private String getYear (int index, String yearOfBirth) {
           yearOfBirth+=dateOfBirth.charAt(index);
           return yearOfBirth;
      }



    public int calculateMaximumHeartRate () {
        int age = getAge();
        return 220 - age;

    }
    public String calculateTargetHeartRate () {
        String heartRate = "";
        double lowerTargetRange = (double) (0.5 * calculateMaximumHeartRate());
        double higherTargetRange = (double) (0.85 * calculateMaximumHeartRate());
        return heartRate + lowerTargetRange + "-" + higherTargetRange;
    }

}
