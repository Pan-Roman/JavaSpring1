package com.geekbrains.services;

import com.geekbrains.entities.Product;
import com.geekbrains.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product getProduct(int id){
        return productRepository.findProduct(id);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAllProducts();
    }

    public void addProduct (Product product){
        productRepository.addProduct(product);
    }
}
