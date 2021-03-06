package com.geekbrains.repositories;

import com.geekbrains.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private ArrayList<Product> products;

    public ProductRepository() {
        this.generateProducts();
    }

    public void generateProducts(){
        products = new ArrayList<Product>();
//        Product product = new Product(1, "Item 1", 942);
        products.add(new Product(1, "Item 1", 942));
        products.add(new Product(2, "Item 2", 217));
        products.add(new Product(3, "Item 3", 185));
        products.add(new Product(4, "Item 4", 815));
        products.add(new Product(5, "Item 5", 538));
    }

    public Product findProduct (int id){
        for(Product item : products){
            if(item.getId().equals(id)){
                return  item;
            }
        }
        return null;
    }

    public List <Product> findAllProducts (){
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
}
