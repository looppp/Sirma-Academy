package GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator<T>{
    public static <T> T[] create(int length, T item){
        if(length < 0){
            throw new IllegalArgumentException("Array length cannot be negative!");
        }

        T[] array = (T[]) Array.newInstance(item.getClass(), length);

        for (int i = 0; i < length; i++) {
            array[i] = item;
        }

        return array;
    }

    public static <T> T[] create(Class<T> classT, int length, T item){
        if(length < 0){
            throw new IllegalArgumentException("Array length cannot be negative!");
        }

        T[] array = (T[]) Array.newInstance(classT, length);

        for (int i = 0; i < length; i++) {
            array[i] = item;
        }

        return array;
    }
}
