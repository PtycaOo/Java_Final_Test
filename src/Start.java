import Shop.Shop;
import Shop.ToyBuilder;

import java.util.Scanner;

public class Start {




    public static void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Привет!");
        while (true){
            System.out.println("1) Добавить игрушку");
            System.out.println("2) Провести розыгрыш");
            System.out.println("3) Выход");
            String choise = sc.nextLine();
            switch (choise){
                case "1":
                case "2":
                case "3":
                    System.out.println("Досвидания!");
                    return;
            }
        }
    }
}
