package week6.bookshelf;

import java.util.ArrayList;

public class BookShelf extends Shelf implements Queue{

    @Override
    public void enQueue(String string) {
        content.add(string);
    }

    @Override
    public String deQueue() {
        return content.remove(0);
    }


}
