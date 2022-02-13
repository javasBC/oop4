import javax.lang.model.element.AnnotationMirror;
import java.awt.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

      //  //Friend friend1 = new Friend("jack0");
      //  //System.out.println("static " + friend1.numbOfFriends);
      //  //System.out.println("not static " + friend1.nonStaticNumbOfFriend);
////
////
      //  //Friend friend2 = new Friend("jack 1");
      //  //System.out.println("static " + friend2.numbOfFriends);
      //  //System.out.println("not static " + friend2.nonStaticNumbOfFriend);
////
////
      //  //Friend friend3 = new Friend("jack  2");
      //  //System.out.println("static " + friend3.numbOfFriends);
      //  //System.out.println("not static " + friend3.nonStaticNumbOfFriend);
////
////
      //  //Friend friend4 = new Friend("jack   3");
      //  //System.out.println("static " + friend4.numbOfFriends);
      //  //System.out.println("not static " + friend4.nonStaticNumbOfFriend);
      //  //Friend.whatsName();
      //  //Friend f1 = new Friend("gary");
      //  //Dog dog = new Dog("rexy the dog ",24,13);
      //  //Animal animal= new Animal("sora the deer",17);
////
////
      //  //System.out.println(dog instanceof Animal );
      //  //animal.makeSound();
      //  //dog.makeSound();
//
      //  //Animal animal= new Animal("hatool",12);
      //  Dog dog= new Dog("jojo ", 17 , 99);
      //  Animal dog2=new Dog("mojo",14,0);
      //  Animal dog3= new Poodle("poodle",3,4,Color.red);
      //  Poodle poodle = new Poodle("musko",8,13, Color.CYAN);
//
      //  Poodle p = (Poodle)dog2;
      //  System.out.println(p.color);
//
//
      //  Animal[] animals= new Animal[4];
      // // animals[0]= new Animal("hatool",12);
      //  animals[1]= new Poodle("poodle",3,4,Color.red);
      //  animals[2]= new Dog("jojo ", 17 , 99);
      ////  animals[3]= new Animal("ssss" ,5);
//
      //  for(Animal temp: animals)
      //  {
//
      //  }
//
//
//
      //  dog.makeSound();
      //  dog2.makeSound();
      //  animal.makeSound();
//
      //  System.out.println(dog instanceof  Animal);
//

        Scanner sc1= new Scanner(System.in);
        Food[] fridge=new Food[5];
        int caloriesSum=0;

        Food a;


        for(int i= 0 ; i<5;i++){
            System.out.println("what does your fridge contains");
            System.out.print("1 => meat    2=> fish      3=> veg");
            int choice = sc1.nextInt();
            switch (choice){
                case 1 :
                    fridge[i]=new Meat(45,Color.red,false);
                    break;
                case 2:
                    fridge[i]= new Fish(21,Color.gray,350);
                    break;
                case 3:
                    fridge[i]= new Vegetables(0.8,Color.green,2);
            }
            caloriesSum+=fridge[i].calcCalories(4);
        }
        System.out.println(caloriesSum);




    }

}
