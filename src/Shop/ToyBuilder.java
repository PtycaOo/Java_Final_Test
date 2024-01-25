package Shop;

import java.util.Scanner;

public class ToyBuilder {

    public Toy build(int id, String name, int weight){
        return new Toy(id,name,weight);
    }
}
