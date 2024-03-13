package Task2;

import java.util.ArrayList;
import java.util.List;

public class Storage <T> {
     private List<T> listOfItems = new ArrayList<>();

    public void add (T item) {
        listOfItems.add(item);
    }

    public T get (int index) {
        return listOfItems.get(index);
    }

    public int size() {
        return listOfItems.size();
    }
}
