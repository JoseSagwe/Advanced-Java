package InputOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    
    public static void main(String[] args) throws IOException{

        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try{
            inStream = new FileInputStream("f:\\path\\source.txt");
            outStream = new FileOutputStream("f:\\path\\dest.txt");

            //reads a byte at a time, if it reached end of file, return -1
            int content;
            while ((content = inStream.read()) != -1){
                outStream.write((byte) content);
            }
        } finally{
            if (inStream != null) {
                inStream.close();
            }
            if (outStream != null) {
                outStream.close();
            }
        }

    }

}
