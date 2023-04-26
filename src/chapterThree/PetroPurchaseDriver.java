package chapterThree;

public class PetroPurchaseDriver {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Yaba", "Diesel", 4, 600, 8);

        System.out.println(petrolPurchase.getPetrolType());
        System.out.println(petrolPurchase.getLocation());
        System.out.println(petrolPurchase.getDiscount());
        System.out.println(petrolPurchase.getPrice());
        System.out.println(petrolPurchase.getPurchaseAmount());
        System.out.println(petrolPurchase.getQuantity());
    }
}
