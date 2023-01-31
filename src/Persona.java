import java.util.ArrayList;

public class Persona extends Human {
    public Library PersLibr;
    public Pet PersPet;

    public Persona(String Name, String Sex, int Age,
                   String persLibr,
                   String persPet) {
        setSex(Sex);
        setName(Name);
        setAge(Age);
        this.PersLibr = new Library(persLibr);
        this.PersPet = new Pet(persPet);
    }
    ArrayList<Persona> listName = new ArrayList<>();

    public void AddName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Persona> getListName() {
        return listName;
    }

    public void Voice() {
        String name = getName();
        System.out.println("Меня зовут " + name);
    }
    public void Tag(){
        String name = Animal.getAnimalName();
        String breed = Animal.getAnimalBreed();
        int age = Animal.getAnimalAge();
        String owner = getName();
        System.out.println("Порода: " + breed + ",\n" +
                "Кличка: " + name + ",\n" +
                "Возраст: " + age + ",\n" +
                "Владелец: " + owner);
    }

    public void pBook(){

    }
}