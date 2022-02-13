public class Dog extends  Animal{
    //DATA name age
    public int speed;

    public Dog(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    @Override
    public void makeSound(){
        System.out.println("Dog goes wraph wraph ");
    }

    @Override
    public String toString() {
        return super.toString()+
                ", speed=" + speed +
                '}';
    }
}
