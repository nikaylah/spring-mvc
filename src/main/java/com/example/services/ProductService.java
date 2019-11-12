package com.example.services;

import com.example.domain.Product;

import java.util.List;

//alt enter implements the methods


//public interface ProductService {
//    List<Product> listAllProducts();
//
//    Product getProductById(Integer id);
//
//    Product saveOrUpdateProduct(Product product);
//
//    void deleteProduct(Integer id);
//}


public interface ProductService extends CRUDService<Product> {
//this just specifies the type
}

