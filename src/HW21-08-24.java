public class Dog {
    private static int totalDogs = 0;
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        totalDogs++;
    }

    public void printDogInfo() {
        System.out.println("Name: " + this.name + ", Breed: " + this.breed);
    }
    public static int getTotalDogs() {
        return totalDogs;
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lord", "Labrador");
        dog1.printDogInfo();

        Dog dog2 = new Dog("Paid", "Beagle");
        dog2.printDogInfo();

        Dog dog3 = new Dog("Brullik", "Yorkshire ");
        dog3.printDogInfo();

        System.out.println("Total dogs created: " + Dog.getTotalDogs());
    }
}
