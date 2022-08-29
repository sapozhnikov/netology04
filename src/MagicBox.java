import java.util.Random;

public class MagicBox <T>{
    private T items[];
    private int itemsAdded = 0;

    public MagicBox(int count){
        if (count < 1) {
            throw new RuntimeException("Can't contain no items");
        }
        items = (T[]) new Object[count];
    }

    public boolean add(T item){
        if (itemsAdded < items.length){
            items[itemsAdded++] = item;
            return true;
        }
        return false;
    }

    public T pick(){
        if (itemsAdded != items.length){
            throw new RuntimeException("Box is not full." + (items.length - itemsAdded) + " more to go!");
        }
        Random random = new Random();
        int randomInt = random.nextInt(itemsAdded);
        return items[randomInt];
    }
}
