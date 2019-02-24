package com.geekbrains.controllers;

import com.geekbrains.entities.Product;
import com.geekbrains.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping ("/list")
    public String showProductsList(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "products-list";
    }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "product-form";
    }

    @RequestMapping ("/addProduct")
    public String addProduct(@ModelAttribute("product")Product product){
        productService.addProduct(product);
//        model.addAttribute("product", product);
        return "products-form-result";
    }

    @RequestMapping("/showProduct/{pid}")
    public String showProduct(Model model, @PathVariable("pid") int id) {
        Product product = productService.getProduct(id);
        model.addAttribute("product", product);
        return "product";
    }
}
