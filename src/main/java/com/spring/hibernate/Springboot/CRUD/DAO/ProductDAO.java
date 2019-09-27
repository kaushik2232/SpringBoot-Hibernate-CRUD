package com.spring.hibernate.Springboot.CRUD.DAO;

import com.spring.hibernate.Springboot.CRUD.Repository.ProductRepository;
import com.spring.hibernate.Springboot.CRUD.model.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDAO {

    @Autowired
    ProductRepository productRepository;

    /*save a product*/
    public products save(products pro){
        return productRepository.save(pro);
    }

    /*search all product*/
    public List<products> findAll(){
        return productRepository.findAll();
    }

    /*get a product by  id*/
    public products getOne(Integer pid){
        return productRepository.getOne(pid);
    }

    /*delete a product*/
    public void delete(products pro){
        productRepository.delete(pro);
    }
}
