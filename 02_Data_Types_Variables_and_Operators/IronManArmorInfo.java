/*
 * The legend Tony Stark has asked you to  make a program to
 * store the info of his new Armor in a java program as
 * it will be needed by him for upgrading his armor software
 * 
 * Armor name is "Mark 2025"
 * Armor version is "0.01"
 * Armor weight is "100.89789378 kg"
 * Armor Power Catagory is "A"
 * Armor has nano-tech.
 * Number of missile can store is 200.
 */

public class IronManArmorInfo {
    public static void main(String[] args) {
        String armorName = "Mark 2025";
        float armorVersion = 0.1f;
        double armorWeight = 100.89789378;
        char armorPowerCatagory = 'A';
        boolean isNanoTech = true;
        int maxMissileStorage = 200;

        System.out.println("Armor Name: " + armorName);
        System.out.println("Armor Version: " + armorVersion);
        System.out.println("Armor Weight: " + armorWeight);
        System.out.println("Armor Name: " + armorPowerCatagory);
        System.out.println("Armor Version: " + isNanoTech);
        System.out.println("Armor Weight: " + maxMissileStorage);
    }
}