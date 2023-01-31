public class view {
    public static void treeView(Persona root, int num){
        String line = "_".repeat(num);
//        System.out.println(line + root.FullName);
        System.out.println(line + root.getName());
        for (Persona a: root.getListName()) {
            treeView(a, num + 1);
        }
    }
    public static void bookView(Persona root){
        System.out.println("имя библиотеки " + root.PersLibr.LibraryName);
        for (LibraryBooks a: root.PersLibr.listBook) {
            System.out.println(a.bAutor + " " + a.bName);
        }
    }

    public static void animalView(Persona root){
        System.out.println("Владелец пушистика " + root.PersPet.AnimalOwner);
        for(AnimalPets p: root.PersPet.owner){
            System.out.println(p.aBreed + " " + p.aName + " " + p.aAge);
        }
    }
}

// https://t.me/VladVin2314
