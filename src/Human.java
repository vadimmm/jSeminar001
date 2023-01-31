public abstract class Human {
    private String sex;
    private String name;
    private int age;

    public void setSex(String Sex){
        this.sex = Sex;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public void setAge(int Age){
        this.age = Age;
    }

    public String getSex(){
        return sex;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public abstract void Voice();

    public abstract void Tag();
}