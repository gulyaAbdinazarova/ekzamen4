
import manager.Manager;
import productStore.Store;
import productStore.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StorService {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31M";
    private static final String ANSI_ORANGE = "\001B[33";
    private static final Manager manager = new Manager(1, "manager", "manager");
    private static Store store;
    public void addNewProduct(List<Product> products) {
        List<Product> products1 = new ArrayList<>();
        try {
            for (Product product : products)
                if (product.getDate().isAfter(LocalDate.now())) {
                    if (product.getCompanyName().equals("Toiboss")
                            || product.getCompanyName().equals("Milka")
                            || product.getCompanyName().equals("Nur")) {
                        store.getProducts().add(product);
                    } else {
                        store.getProducts().add(product);
                    }
                }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println(ANSI_GREEN + "SPISOK PRINYATYH PRODUKTOV:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println(ANSI_RED + " SPISOK NE PRINITYH PRODUKTOV:");
        products.forEach(System.out::println);
    }

    public void sortByDiscount() {
        List<Product> storeShelves = new ArrayList<>();
        for (int i = 0; i < storeShelves.size(); i++) {
            if (storeShelves.get(i).getDate().isAfter(LocalDate.now())) {
                if (storeShelves.get(i).getDate().minusDays(7).isBefore(LocalDate.now())) {
                    storeShelves.add(storeShelves.get(i));
                }
            } else {
                storeShelves.remove(storeShelves.get(i));
            }
        }
        System.out.println(ANSI_ORANGE + " TOVAR SO SKIDKOI:");
        for (Product product : storeShelves) {
            System.out.println(product);
        }
    }

    public void manager(String login, String password) {
        if (manager.getLogin().equals(login) && manager.getPassword().equals(password)){
            store.getProducts().forEach(System.out::println);
        }else {
            System.out.println("У вас логин или пароль не правильный");
        }
    }

}