package app;

import dane.Product;
import java.io.IOException;
import java.util.*;

public class Program {

    public static void main(String[] args) throws IOException {


        int wyborOpcji = 0;
        int wyborSortowania = 0;
        ArrayList<Product> wydatki = new ArrayList<>();
        Wydatki wyd = new Wydatki();
        System.out.println(wyborOpcji);


        while (wyborOpcji != 3) {
            wyborOpcji = wyd.pokazOpcje();
            switch (wyborOpcji) {
                case 0: wyd.addProduct(wydatki);
                    break;
                case 1:  if (wydatki.isEmpty()) {
                        System.out.print("Nie ma żadnych wydatków.");
                        break;
                    } else {
                        wyd.sortowanie(wyborSortowania, wydatki);
                        break;
                    }
                case 2: wyd.doPliku(wydatki);
                    break;
                case 3: break;
                default:
                    System.out.println("Wybierz jedną z opcji z menu");
            }
        }

    }


}

