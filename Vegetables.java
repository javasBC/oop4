import java.awt.*;

public class Vegetables  extends  Food{
    //DATA
    private  int daysInFridge;


    //Func
    public Vegetables(double calories, Color color, int daysInFridge) {
        super(calories, color);
        this.daysInFridge = daysInFridge;
    }

    @Override
    public void howToCook() {
        System.out.println("who's cook a vegetables ");
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "daysInFridge=" + daysInFridge +
                '}';
    }
}
