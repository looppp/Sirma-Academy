package GenericBox;

public class Box<T>{
    private T item;

    Box(T item){
        this.item = item;
    }

    @Override
    public String toString() {
        return item.getClass().getName() + ": " + item;
    }
}
