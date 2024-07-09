package InterviewQuestions.NumberPrinter;

import java.util.concurrent.Semaphore;

public class EvenNumberPrinter implements Runnable{
    private final SharedNumPrinter sp;
    public EvenNumberPrinter(SharedNumPrinter sp){
        this.sp = sp;
    }

    @Override
    public void run() {
        sp.printEven();
    }
}
