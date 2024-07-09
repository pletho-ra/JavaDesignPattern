package CollectionsQuestions;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomLinkedList<E> extends LinkedList<E> {

    public void reverse(){
        if(size() <= 1){
            return;
        }

        int mid = size()/2;
        Iterator<E> forwardIterator = iterator();
        Iterator<E> backwardIterator = descendingIterator();
        for( int i = 0; i < mid; i++){
            E forwardElement = forwardIterator.next();
            E backwardElement = backwardIterator.next();

            set(i , backwardElement);
            set(size() - 1 - i, forwardElement);
        }
    }
}
