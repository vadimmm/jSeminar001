import java.util.ArrayList;
class AnimalPets{
    public String aName;
    public String aBreed;
    public int aAge;
}
public class Pet extends Animal{
    public String AnimalOwner;
    public Pet(String animalOwner) {
        this.AnimalOwner = animalOwner;
    }
    ArrayList<AnimalPets> owner = new ArrayList<>();
    public void addPet(String animalName, String animalBreed, int animalAge) {
        AnimalPets ap = new AnimalPets();
        setAnimalName(animalName);
        setAnimalBreed(animalBreed);
        setAnimalAge(animalAge);
        ap.aName = getAnimalName();
        ap.aBreed = getAnimalBreed();
        ap.aAge = getAnimalAge();
        owner.add(ap);
    }

    public ArrayList<AnimalPets> getPets() {
        return owner;
    }

    public void Tag() {
    }
}
