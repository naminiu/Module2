package AAAShop.services;

import AAAShop.model.Product;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ProductService {
    private static ArrayList<Product> products;

    public ProductService() {
    }

    //    public static void init() {
//        products = new ArrayList<>();
//        Date createAt = new Date();
//        Instant updateAt = Instant.now();
//
//        products.add(new Product(1667182235L, "Iphone 11", 20000, 2, "Apple",createAt, updateAt ));
//        products.add(new Product(1667182236L, "Iphone 12", 20000, 2, "Apple",createAt, updateAt ));
//        products.add(new Product(1667182237L, "Iphone 13", 20000, 2, "Apple",createAt, updateAt ));
//        products.add(new Product(1667182238L, "Iphone 14", 20000, 2, "Apple",createAt, updateAt ));
//        products.add(new Product(1667182239L, "Iphone X", 20000, 2, "Apple",createAt, updateAt ));
//
//    }
    static {
        products = new ArrayList<>();
        Date createAt = new Date();
        Instant updateAt = Instant.now();

        products.add(new Product(1667182235L, "phone 11", 80000, 2, "Apple", createAt, updateAt));
        products.add(new Product(1667182236L, "phone 11", 30000, 2, "Apple", createAt, updateAt));
        products.add(new Product(1667182237L, "1phone 13", 10000, 2, "Apple", createAt, updateAt));
        products.add(new Product(1667182238L, "phone 11", 60000, 2, "Apple", createAt, updateAt));
        products.add(new Product(1667182239L, "2phone 13", 40000, 2, "Apple", createAt, updateAt));

    }

    public ArrayList<Product> getProducts() {
        return products;
    }


    public void addProduct(Product product) {
        ProductService.products.add(product);
    }

    public Product getProductById(Long id) {
        for (Product p : ProductService.products) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void removeProduct(Product product) {
        ProductService.products.remove(product);
    }

    public void removeProductById(Long idProduct) {
        for (int i = 0; i < ProductService.products.size(); i++) {
            if (ProductService.products.get(i).getId().equals(idProduct)) {
                ProductService.products.remove(i);
                break;

            }
        }
    }

    // tìm kiếm product bạn muốn sửa, chọn ID để lấy ra product muốn sửa
    //
    //
    public void editProduct(Product newProduct) {
        List<Product> products = getProducts();
        for (Product p : products) {
            if (p.getId().equals(newProduct.getId())) {
                if (newProduct.getName() != null && !newProduct.getName().isEmpty())
                    p.setName(newProduct.getName());
                if (newProduct.getPrice() != 0)
                    p.setPrice(newProduct.getPrice());
                if (newProduct.getQuantity() != 0)
                    p.setQuantity(newProduct.getQuantity());
                if (newProduct.getManufacturer() != null && !newProduct.getManufacturer().isEmpty())
                    p.setManufacturer(newProduct.getManufacturer());
                p.setUpdateAt(Instant.now());
            }
        }
    }


    public void sortProduct(Comparator<Product> comparator) {
        products.sort(comparator);

    }


    public static void setProducts(ArrayList<Product> products) {
        ProductService.products = products;
    }

    public List<Product> searchNameProduct(String name) {
        ArrayList<Product> results = new ArrayList<>();
        for (Product u : products) {
            if (u.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(u);
            }
        }

        return results;
    }
}
