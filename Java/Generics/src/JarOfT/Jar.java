package JarOfT;

import java.util.ArrayDeque;

public class Jar <T>{
    private ArrayDeque<T> stackOfElements = new ArrayDeque<>();

    public void add(T element){
        stackOfElements.push(element);
    }

    public void remove(){
        stackOfElements.pop();
    }

}
