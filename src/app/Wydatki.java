package app;

import dane.Product;
import sortowanie.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class  Wydatki {

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


    public static int pokazOpcje() {

        Scanner scan = new Scanner(System.in);
        Options[] opcje = Options.values();
        System.out.println("Wybierz opcję sortowania:");
        System.out.print("|  ");
        for (Options opcja : opcje) {
            System.out.print(opcja.getName() + " - " + opcja.getIndex() + "  |  ");
        }
        System.out.print("\n");
        int wybor = scan.nextInt();
        scan.nextLine();
        return wybor;
    }


    public static int pokazSortowanie() {

        Scanner scan = new Scanner(System.in);
        Sortowanie[] sort = Sortowanie.values();
        System.out.println("Wybierz sposób sortowania lub wpisz 4 by powrócić do menu głównego:");
        System.out.print("|  ");
        for (Sortowanie s : sort) {
            System.out.print(s.getName() + " - " + s.getIndex() + "  |  ");
        }
        System.out.print("\n");
        int wybor = scan.nextInt();
        scan.nextLine();
        return wybor;
    }

    public static void doPliku(ArrayList wydatki) throws IOException {
        FileWriter file =new FileWriter("wydatki.txt");
        BufferedWriter bf = new BufferedWriter(file);
        for (int i=0; i<wydatki.size(); i++) {
            Product prod = new Product();
            String text=wydatki.get(i).toString();
            bf.write(text);
            bf.newLine();
        }
        bf.close();
    }

    public static void sortowanie(int wyborSortowania, ArrayList wydatki){

        while (wyborSortowania!=4) {
            wyborSortowania = pokazSortowanie();
            Comparator comparator = new NameComparator();
            switch (wyborSortowania) {
                case 0: comparator = new NameComparator(); break;
                case 1: comparator = new CategoryComparator(); break;
                case 2: comparator = new PriceComparatorA(); break;
                case 3: comparator = new PriceComparatorZ(); break;
                case 4: break;
            }
            if (comparator != null) {
                Collections.sort(wydatki, comparator);
                System.out.println(wydatki);
                System.out.println();
            }
        }
    }



}
