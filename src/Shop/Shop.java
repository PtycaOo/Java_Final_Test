package Shop;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Shop {
    private final ArrayList<Toy> shop;
    private final ArrayList<Toy> prize;

    private final PriorityQueue<Toy> idToy = new PriorityQueue<>(Comparator.comparing(Toy::getWeight));

    public Shop() {
        shop = new ArrayList<>();
        prize = new ArrayList<>();
    }

    public void addToy(){
        ToyBuilder toyBuilder = new ToyBuilder();
        shop.add(toyBuilder.build());
    }

    public void sort(){
        idToy.addAll(shop);
        while (!idToy.isEmpty()) {
            prize.add(idToy.remove());
        }
        System.out.println(prize.toString());

    }

    public void get(){
        sort();
        for (int i = 0; i < 10; i++) {
            int random_num = 1 + (int)(Math.random()*100);
            for (Toy toy: prize){
                if(random_num <= toy.getWeight()*10){
                    idToy.add(toy);
                }
            }
            WorkWithFile.writeInfo(idToy.remove().getId());
        }
    }

    @Override
    public String toString() {
        return idToy.toString();
    }
}
