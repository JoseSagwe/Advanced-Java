package ThreadsAndCocurrency;

public class Thread1 extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("Thead 1 is running");
                    super.run();
        } catch (Exception e) {
          System.out.println("Exception Caught!");
        }
        
    }

}
