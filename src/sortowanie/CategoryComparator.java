package sortowanie;
import dane.Product;
import java.util.Comparator;

public class CategoryComparator implements Comparator <Product>  {

    public int compare (Product p1, Product p2)  {
        return p1.getCategory().compareTo(p2.getCategory());

    }

    public CategoryComparator() {
    }

}
