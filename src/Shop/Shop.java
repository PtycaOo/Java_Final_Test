package Shop;

import java.util.*;

public class Shop {
    public PriorityQueue<Toy> toy;

    public Shop() {
        toy = new PriorityQueue<>(Comparator.comparing(Toy::getWeight));

    }

    public void addToy(){
        ToyBuilder toyBuilder = new ToyBuilder();
        Scanner scanner = new Scanner(System.in);
        String[] newToy = scanner.nextLine().split(" ");
        toy.add(toyBuilder.build(Integer.parseInt(newToy[0]),newToy[1],Integer.parseInt(newToy[2])));
    }

    @Override
    public String toString() {
        return toy.toString();
    }
}
