package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.PriceUpdate;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Produto 1", 10.00));
        list.add(new Product("Produto 2", 20.00));
        list.add(new Product("Produto 3", 30.00));

        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);
    }
}
