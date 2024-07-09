package InterviewQuestions.NumberPrinter;

public class OddNumberPrinter implements Runnable{
    private final SharedNumPrinter sp;
//
    public OddNumberPrinter(SharedNumPrinter sp){
        this.sp = sp;
    }
    @Override
    public void run() {
        sp.printOdd();
    }
}
