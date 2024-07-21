package com.ecommerce.e_commerce_platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.e_commerce_platform.entity.Product;
import com.ecommerce.e_commerce_platform.repository.ProductRepository;

@Service
public class ProdcutService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long productId) {
        return productRepository.findById(productId).get();
    }

    public Product updateProduct(Product product) {
        Product newproduct = productRepository.findById(product.getProductId()).get();
        newproduct.setName(product.getName());
        newproduct.setDescription(product.getDescription());
        newproduct.setPrice(product.getPrice());
        newproduct.setStockQuantity(product.getStockQuantity());
        return newproduct;
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}
