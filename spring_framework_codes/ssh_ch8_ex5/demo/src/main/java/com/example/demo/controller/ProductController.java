package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products") // previously used a generic RequestMapping to get the values form the end point
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);

        return "product.html";
    }

    // adding code to add product to the list from the client, to the controller to the list
    //@RequestMapping(path = "/products", method = RequestMethod.POST)
    @PostMapping("/products")
    public String addProduct(
           // @RequestParam String name,
           // @RequestParam double price,
           Product p, // ssh_ch8_ex6
            Model model
    ) {
        //Product p = new Product();
        //p.setName(name);
       // p.setPrice(price);
        productService.addProduct(p); // ssh_ch8_ex6

        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";

    }
}
