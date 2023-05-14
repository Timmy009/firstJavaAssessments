package ChapterEight;

public enum Food {
    APPLE("White_leaf", 2),
    BANANA ("Green leaf", 4),
    CARROT("Leaf", 7);

    private String vegetables;
    private int numberOfCallories;

    Food(String vegetables, int numberOfCallories) {
        this.vegetables = vegetables;
        this.numberOfCallories = numberOfCallories;
    }

    public String getVegetables() {
        return vegetables;
    }

    public int getNumberOfCallories() {
        return numberOfCallories;
    }
}
