package InterviewQuestions.NumberPrinter;

import java.util.concurrent.Semaphore;

public class SharedNumPrinter {
    private final Semaphore evenSema = new Semaphore(0);
    private final Semaphore oddSema = new Semaphore(1);
    private final int max = 100;

    public void printOdd(){
        for( int i = 1; i <= max; i+=2){
            try{
                oddSema.acquire();
                System.out.println( " " + i + " ");
                evenSema.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printEven(){
        for(int i = 2; i <= max; i+=2){
            try{
                evenSema.acquire();
                System.out.println(" " + i + " ");
                oddSema.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
