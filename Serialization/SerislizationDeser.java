package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerislizationDeser {
    
    public static void main(String[] args){
        Student student = new Student("Joseph Sagwe", 22, "Nairobi, Kenya");
        student.setX(10);

        String filename = "F:\\Advanced-Java\\Test.txt";
        FileOutputStream fileout = null;
        ObjectOutputStream objout = null;

        //serialization 
        try {
            fileout = new FileOutputStream(filename);
            objout = new ObjectOutputStream(fileout);
            objout.writeObject(student);

            objout.close();
            fileout.close();

            System.out.println("Object has been serialized : \n" + student);

        } catch (IOException e) {
            System.out.println("IOException is Caught");
        }

        //Deserilization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;

        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();
             System.out.println("Object has been desesrialized: \n" + object);
             System.out.println("value of X is " + object.getX());

        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
                    System.out.println("ClassNotFoundException" + " is caught");
                }
        
    }
}
