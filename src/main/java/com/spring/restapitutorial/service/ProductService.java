package com.spring.restapitutorial.service;

import com.spring.restapitutorial.entity.Product;
import com.spring.restapitutorial.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        Product newProduct = productRepository.save(product);
        return productRepository.save(newProduct);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
