package app;

import dane.Product;
import java.io.IOException;
import java.util.*;

public class Program {

    public static void main(String[] args) throws IOException {


        int wyborOpcji = 0;
        int wyborSortowania = 0;
        ArrayList<Product> listaWydatkow = new ArrayList<>();
        Wydatki wyd = new Wydatki();

        System.out.println(wyborOpcji);
        while (wyborOpcji != 3) {
            wyborOpcji = wyd.pokazOpcje();
            switch (wyborOpcji) {
                case 0:
                    wyd.addProduct(listaWydatkow);
                    break;
                case 1:
                    if (listaWydatkow.isEmpty()) {
                        System.out.print("Nie ma żadnych wydatków.");
                        break;
                    } else {
                        wyborSortowania = wyd.pokazSortowanie();

                        wyd.sortowanie(wyborSortowania, listaWydatkow);
                        break;
                    }
                case 2:
                    wyd.doPliku(listaWydatkow);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wybierz jedną z opcji z menu");
            }
        }

    }

}


