import java.util.ArrayList;
import java.util.Scanner;

public class Product {

    private String name;
    private String description;
    private int price;
    private String category;

    public Product(String name, String description, int price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Nazwa produktu/usługi: " + name + " (" + description + "), kategoria: "+category+", cena: " + price +"\n";
    }

    public void addProduct(ArrayList list) {

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
        list.add(prod);

    }


}
