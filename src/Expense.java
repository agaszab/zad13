import java.util.ArrayList;
import java.util.Scanner;

public class Expense {

    public Expense() {

    }

    ArrayList<Product> wydatki = new ArrayList<>();

    public void addProduct() {

        Scanner scan = new Scanner(System.in);
        String name;
        String description;
        String category;
        int price;

        System.out.println("Podaj nazwę produktu/usługi:");
        name = scan.nextLine();
        System.out.println("Podaj opis:");
        description = scan.nextLine();
        System.out.println("Podaj kategorię:");
        category = scan.nextLine();
        System.out.println("Podaj cenę:");
        price = scan.nextInt();
        scan.nextLine();

        Product prod = new Product(name, description, price, category);
        wydatki.add(prod);

    }


    public void druk() {
        if (wydatki.isEmpty()) System.out.print("Nie ma żadnych wydatków.");
        else
            for (Product elem : wydatki) {
                System.out.println(elem);
            }
    }


}



