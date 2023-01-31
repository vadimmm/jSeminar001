public abstract class Animal {
    private static String AnimalName;
    private static String AnimalBreed;
    private static int AnimalAge;

    public void setAnimalName(String animalName){
        this.AnimalName = animalName;
    }
    public void setAnimalBreed(String animalBreed) {
        this.AnimalBreed = animalBreed;
    }
    public void setAnimalAge(int animalAge){
        this.AnimalAge = animalAge;
    }

    public static String getAnimalName() {
        return AnimalName;
    }
    public static String getAnimalBreed() {
        return AnimalBreed;
    }
    public static int getAnimalAge() {
        return AnimalAge;
    }

    public abstract void Tag();
}
