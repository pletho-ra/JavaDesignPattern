package InterviewQuestions;

import InterviewQuestions.NumberPrinter.EvenNumberPrinter;
import InterviewQuestions.NumberPrinter.OddNumberPrinter;
import InterviewQuestions.NumberPrinter.SharedNumPrinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        SharedNumPrinter sp = new SharedNumPrinter();

        ExecutorService ex = Executors.newFixedThreadPool(2);

        ex.submit(new OddNumberPrinter(sp));
        ex.submit(new EvenNumberPrinter(sp));

        ex.shutdown();
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(9);
//
//        // Print the original list
//        System.out.println("Original list: " + numbers);


    }
}
