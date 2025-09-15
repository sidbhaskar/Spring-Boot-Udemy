package com.Learning.EcomProject.Service;

import com.Learning.EcomProject.Model.Product;
import com.Learning.EcomProject.Repository.ProductRepository;
import com.Learning.EcomProject.utils.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + id));
    }
}
