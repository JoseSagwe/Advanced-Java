package Autoboxing;

public class AutoboxingDemo {
    public static void main(String[] args){

        int i = 10;

        //Autoboxing
        Integer iObj = Integer.valueOf(i);
        System.out.println("Value of Integer obj: " + iObj);

        //Unboxing
        int i1 = iObj;
        System.out.println("Value of i1: " + i1);

        //Autobox
        Character charObj = 'a';
        System.out.println("Value of charObj: " + charObj);

        //Unboxing Character
        char ch = charObj;
        System.out.println("Value of ch: " + ch);

    }
}
