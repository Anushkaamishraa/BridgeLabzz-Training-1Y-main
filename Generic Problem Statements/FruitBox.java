import java.util.*;

class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

public class FruitBox<T extends Fruit> {
    private List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public void display() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        FruitBox<Apple> fb = new FruitBox<>();
        fb.add(new Apple());
        fb.display();
    }
}