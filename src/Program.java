import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Program {

    public static void main(String[] args) throws IOException {


       int wybor1=0;

        ArrayList<Product> wydatki = new ArrayList<>();
        Product prod=new Product();
        System.out.println(wybor1);
        int wybor2=0;
        while (wybor1!=3) {
        wybor1 = pokazOpcje();
        switch (wybor1) {
            case 0:  prod.addProduct(wydatki); break;
            case 1: if (wydatki.isEmpty()) { System.out.print("Nie ma żadnych wydatków.");  break; }
                else {
                    while (wybor2!=4) {
                    wybor2 = pokazSortowanie();
                    Comparator comparator = new NameComparator();
                    switch (wybor2) {
                        case 0: comparator = new NameComparator(); break;
                        case 1: comparator = new CategoryComparator(); break;
                        case 2: comparator = new PriceComparatorA(); break;
                        case 3: comparator = new PriceComparatorZ(); break;
                        case 4: break;
                    }
                if (comparator != null) {
                    Collections.sort(wydatki, comparator);
                    System.out.println(wydatki);
                   }
                }
            }
                    break;
            case 2: doPliku(wydatki); break;
            case 3: break;
            default: System.out.println("Wybierz jedną z opcji z menu");
        }
              }

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
        return wybor;
    }

    public static void doPliku(ArrayList wydatki) throws IOException{
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

}

