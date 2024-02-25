package Enum;
public class Main {
    public static void main(String[] args) {
        System.out.println("This Enum Types");

        Color c1 = Color.RED;

        System.out.println("Red Enum Name is : " + c1.name());
        System.out.println("Red Enum Value is : " + c1.getValue());

        for(Color color : Color.values()){
            System.out.println("Enum Name is " + color.name() + " and the Value is " + color.getValue());
        }

    }
}
