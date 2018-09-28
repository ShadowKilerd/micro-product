package com.example.mall.microproduct.product;

import com.example.mall.microproduct.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    @PreAuthorize("hasAnyRole('USER', 'SERVICE')")
    public List<Product> getProductsList() {
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('USER', 'SERVICE')")
    public Product getProduct(@PathVariable int id)  {
        Optional<Product> product = productService.getProduct(id);
        if (product.isPresent()) {
            return product.get();
        } else {
            throw new NotFoundException();
        }
    }
}
