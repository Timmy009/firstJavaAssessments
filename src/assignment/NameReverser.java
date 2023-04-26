package assignment;

public class NameReverser {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String nameReverse() {
        String reversedName = "";
        for (int index = 1; index <= name.length(); index++)
         reversedName = getReversedName(reversedName, index);
        return reversedName;
    }
    private String getReversedName (String reversedName, int index) {
            reversedName += name.charAt(name.length()-index);
            return reversedName;
        }
    }


