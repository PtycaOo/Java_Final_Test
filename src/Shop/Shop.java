package Shop;


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

    public int sort(){
        int x = 0;
        idToy.addAll(shop);
        while (!idToy.isEmpty()) {
            prize.add(idToy.remove());
        }
        for (Toy toy: prize){
            x = toy.getWeight();
        }
        return x;
    }


    public void get(){
        int x = sort();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int random_num = random.nextInt(x + 1);
            System.out.println(random_num);
            for (Toy toy: prize){
                if(random_num <= toy.getWeight()){
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
