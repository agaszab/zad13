import java.util.*;

public class Program {

    public static void main(String[] args) {


        int wybor1 = pokazOpcje();
        ArrayList<Product> wydatki = new ArrayList<>();
        Product prod=new Product();
        Expense expense = new Expense();

        while (wybor1!=3) {
        switch (wybor1) {
            case 0:  prod.addProduct(wydatki); break;
            case 1:  int wybor2 = pokazSortowanie();
                Comparator comparator= new NameComparator();
                switch (wybor2) {
                    case 0:
                        comparator = new NameComparator();
                        break;
                    case 1:
                        comparator = new CategoryComparator();
                        break;
                    case 2:
                        comparator = new PriceComparatorA();
                        break;
                    case 3:
                        comparator = new PriceComparatorZ();
                        break;
                }
                Collections.sort(wydatki, comparator);
              //  String tab = Arrays.toString(wydatki);
                System.out.println(wydatki);

                break;
            case 2:
                System.out.println("tu będzie zapis do pliku");
                break;
            case 3:
                break;
            default:
                System.out.println("Wybierz jedną z opcji z menu");
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
        System.out.println("Wybierz sposób sortowania:");
        System.out.print("|  ");
        for (Sortowanie s : sort) {
            System.out.print(s.getName() + " - " + s.getIndex() + "  |  ");
        }
        System.out.print("\n");
        int wybor = scan.nextInt();
        return wybor;
    }

}

