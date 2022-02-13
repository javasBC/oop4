import java.awt.*;

public class Fish extends Food{
    //DATA
    private int weight;


    //FUnc


    public Fish(double calories, Color color, int weight) {
        super(calories, color);
        this.weight = weight;
    }

    @Override
    public void howToCook() {
        System.out.println("fry to die ");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "weight=" + weight +
                '}';
    }
}
