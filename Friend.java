public class Friend {

    //DATA
    public  static String name;
    public int nonStaticNumbOfFriend=0;
    public static int numbOfFriends=0;

    public Friend(String name) {
        this.name = name;
        nonStaticNumbOfFriend++;
        this.numbOfFriends++;
    }

    public static  void whatsName(){
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }
}
