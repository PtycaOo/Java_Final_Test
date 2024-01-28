package Shop;


import java.util.Scanner;

public class ToyBuilder {

    public Toy build(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите id игрушки");
        String id = sc.nextLine();
        System.out.println("ВВедите название игрушки: ");
        String name = sc.nextLine();
        System.out.println("ВВедите вес игрушки: ");
        String weight = sc.nextLine();
        return new Toy(Integer.parseInt(id), name, Integer.parseInt(weight));
    }
}
