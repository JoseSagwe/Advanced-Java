package InputOutputStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterSreamDemo {
    
    public static void main(String[] args) throws IOException{
     
        FileReader reader = null;
        FileWriter writer = null;

        try{
            reader = new FileReader("f:\\path\\source.txt");
            writer = new FileWriter("f:\\path\\dest.txt");

            //reading source file and writing content to target file character by character
            int content;
            while ((content = reader.read())!= -1) {
                writer.append((char) content);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
