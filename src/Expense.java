import java.util.ArrayList;
import java.util.Scanner;

public class Expense {

    public Expense() {

    }

    ArrayList<Product> wydatki = new ArrayList<>();



    public void druk() {
        if (wydatki.isEmpty()) System.out.print("Nie ma żadnych wydatków.");
        else
            for (Product elem : wydatki) {
                System.out.println(elem);
            }
    }


}



