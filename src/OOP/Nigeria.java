package OOP;

public enum Nigeria {
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarrawa", "Niger", "Plateua"),
    NORTH_EAST ("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    private String[] states;


    Nigeria(String... states) {
        this.states = states;
    }
    public String[] getState() {
        return states;
    }


}
