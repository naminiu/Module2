package AAAShop.Sort;

import AAAShop.model.Product;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else {
            if (o1.getName().compareTo(o2.getName()) == 0) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    if (o1.getPrice() == o2.getPrice()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            } else {
                return -1;
            }
        }
    }

}
