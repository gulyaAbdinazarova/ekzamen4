import productStore.product.Product;
import productStore.product.meatProduct.Fish;
import productStore.product.meatProduct.Sausage;
import productStore.product.meatProduct.lambMeat;
import productStore.product.milkProduct.Kefir;
import productStore.product.milkProduct.Milk;
import productStore.product.milkProduct.SourCream;
import productStore.product.wheatProduct.Bread;
import productStore.product.wheatProduct.Flour;
import productStore.product.wheatProduct.Pasta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> meatProduct = new ArrayList<>();
        meatProduct.add(new Fish(1,"Nemo","Toiboss", LocalDate.of(2023,03,01)));
        meatProduct.add(new Fish(2,"Crab","Toiboss",LocalDate.of(2023,03,05)));

        meatProduct.add(new Sausage(3,"Garlic","Toiboss",LocalDate.of(2023,03,10)));
        meatProduct.add(new Sausage(4,"Halal","Toiboss",LocalDate.of(2023,03,15)));

        meatProduct.add(new lambMeat(5,"Kurdyuk","Toiboss",LocalDate.of(2023,03,20)));
        meatProduct.add(new lambMeat(6,"Ribs","Toiboss",LocalDate.of(2023,03,30)));

        List<Product> milkProduct = new ArrayList<>();
        milkProduct.add(new Kefir(7,"Airan","Milka",LocalDate.of(23,04,01)));
        milkProduct.add(new Kefir(8,"Smetana","Milka",LocalDate.of(23,04,05)));

        milkProduct.add(new Milk(9,"Kymyz","Milka",LocalDate.of(23,04,10)));
        milkProduct.add(new Milk(10,"Nejniy","Milka",LocalDate.of(23,04,20)));

        milkProduct.add(new SourCream(11,"Chudo","Milka",LocalDate.of(23,04,04)));
        milkProduct.add(new SourCream(12,"Naturell","Milka",LocalDate.of(23,04,11)));

        List<Product> wheatProduct = new ArrayList<>();
        wheatProduct.add(new Bread(13,"Baton","Nur",LocalDate.of(2023,04,30)));
        wheatProduct.add(new Bread(14,"Lepeshka","Nur",LocalDate.of(2023,04,15)));

        wheatProduct.add(new Flour(15,"MakFa","Nur",LocalDate.of(2023,04,20)));
        wheatProduct.add(new Flour(16,"AkUn","Nur",LocalDate.of(2023,04,10)));

        wheatProduct.add(new Pasta(17,"Italyans","Nur",LocalDate.of(2023,04,05)));
        wheatProduct.add(new Pasta(18,"Fransuz","Nur",LocalDate.of(2023,04,25)));

        StorService storService = new StorService();

        storService.addNewProduct(wheatProduct);









    }
}