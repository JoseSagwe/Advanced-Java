package Synchronization;

public class MathUtils {
    
    // You can also make the method synchronized
    void getMultiples(int n){
        
        //Without synchronized there will be random thread accessing the object / variable
        //This will lock this object
        synchronized (this){ 

            for (int i=1; i<=20; i++){
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println(e);
                }
            }

       }
    }
}
