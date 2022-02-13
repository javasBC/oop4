import java.awt.*;

public class Meat extends Food{
    //DATA
    // calories color id
    private boolean isFrozen;

    public Meat(double calories, Color color, boolean isFrozen) {
        super(calories, color);
        this.isFrozen = isFrozen;
    }

    @Override
    public void howToCook() {
        System.out.println("make it well done");
    }

    @Override
    public String toString() {
        return super.toString()+"is frozen ="+this.isFrozen;
    }
}
