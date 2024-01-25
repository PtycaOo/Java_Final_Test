package Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    public List<Toy> toy;

    public Shop() {
        toy = new ArrayList<>();
    }

    public void addToy(){
        ToyBuilder toyBuilder = new ToyBuilder();
        Scanner scanner = new Scanner(System.in);
        String[] newToy = scanner.nextLine().split(" ");
        toy.add(toyBuilder.build(Integer.parseInt(newToy[0]),newToy[1],Integer.parseInt(newToy[2])));
    }
}
