package Shop;

import java.util.Scanner;

public class Toy {
    int id;
    String name;
    int weight;


    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getWeight() {
        return weight;
    }


    Scanner sc = new Scanner(System.in);
    System.out.println("Введите данные через пробел в формате: id Наименование Вес");
    String s = sc.nextLine();
    String[] arr = s.split(" ");
        return new Toy(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]));


}
