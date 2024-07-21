package com.ecommerce.e_commerce_platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.e_commerce_platform.entity.Product;
import com.ecommerce.e_commerce_platform.service.ProdcutService;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProdcutService prodcutService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return prodcutService.saveProduct(product);
    }

    @GetMapping
    public List<Product> getProducts() {
        return prodcutService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return prodcutService.getProductById(id);
    }

    @PutMapping("/{id}")
    public Product updateProductById(@PathVariable Long id, @RequestBody Product product) {
        product.setProductId(id);
        return prodcutService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        prodcutService.deleteProduct(id);
    }
}
