import Shop.Shop;

import java.util.Scanner;

public class Start {




    public static void start(){
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.println("Привет!");
        while (true){
            System.out.println("1) Добавить игрушку");
            System.out.println("2) Провести розыгрыш");
            System.out.println("3) Выход");
            String choise = sc.nextLine();
            switch (choise){
                case "1":
                    shop.addToy();
                    break;
                case "2":
                    System.out.println(shop.toString());
                    break;
                case "3":
                    System.out.println("Досвидания!");
                    return;
            }
        }
    }
}
