import java.awt.*;

public  abstract class Food {
    //DATA
    private double calories;
    private Color color;
    private int id ;
    public static int foodRate=0;

    //FUNC
    //CTOR
    public Food(){
        this.setId();
    }

    public Food(double calories,Color color){
        this.setCalories(calories);
        this.setColor(color);
        this.setId();
    }
    //GETTER's and SETTER's
    public void setId(){
        this.id=++foodRate;
    }


    public int getId() {
        return id;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    //FUNC

    public int calcCalories(int w){
        return (int)(w*this.calories);
    }

    public abstract void howToCook();

    @Override
    public String toString() {
        return "Food{" +
                "calories=" + calories +
                ", color=" + color +
                ", id=" + id +
                '}';
    }
}
