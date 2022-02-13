public abstract class Animal {
    //data
    public String name;
    public int age ;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void makeSound(){
        System.out.println("the animal  making sound ");
    }


    @Override
    public String toString() {
        return ""+getClass().getName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
