package Shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Toy> toy;

    public Shop() {
        toy = new ArrayList<>();
    }

    public void addToy(Toy newToy){
        toy.add(newToy);
    }
}
