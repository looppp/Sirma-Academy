package CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> list = new ArrayList<>();

    public void add(T element){
        list.add(element);
    }

    public T  remove(int index){
        if(index < 0 || index > list.size()){
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        return list.remove(index);
    }

    public boolean contains(T element){
        return list.contains(element);
    }

    public void swap(int indexOne, int indexTwo){
        if(indexOne < 0 || indexOne > list.size() || indexTwo < 0 || indexTwo > list.size()){
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        Collections.swap(list, indexOne, indexTwo);
    }

    public int countGreaterThan(T element){
        int count = 0;
        for (T item : list){
            if(item.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    public T getMax(){
        if(list.size() == 0){
            throw new IllegalStateException("List is empty.");
        }
        return Collections.max(list);
    }
    public T getMin(){
        if(list.size() == 0){
            throw new IllegalStateException("List is empty.");
        }
        return Collections.min(list);
    }

   public void printArray(){
        list.forEach(x -> System.out.println(x));
   }
}
