package com.spring.hibernate.Springboot.CRUD.Controller;

import com.spring.hibernate.Springboot.CRUD.DAO.ProductDAO;
import com.spring.hibernate.Springboot.CRUD.Repository.ProductRepository;
import com.spring.hibernate.Springboot.CRUD.model.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/company")
public class ProductController {

    @Autowired
    ProductDAO productDAO;

    @Autowired
    ProductRepository productRepository;

    /**saving a product**/
    @PostMapping("/post")
    public products createProduct(@Valid @RequestBody products pro){
        return productDAO.save(pro);
    }

    /*get all products*/
    @GetMapping("/all")
    public List<products> getAllProducts(){
        return productDAO.findAll();
    }

    /*get a product bt id*/
    @GetMapping("/all/{pid}")
    public ResponseEntity<products> getProductById(@PathVariable(value="pid") final Integer pid) {

        products pro = productDAO.getOne(pid);
        if(pro==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(pro);
    }


    /*update a product*/
    @PutMapping("/update/{pid}")
    public ResponseEntity<products> updateProduct(@PathVariable(value = "pid") Integer pid, @Valid @RequestBody products prodetails){

        products pro = productDAO.getOne(pid);
        if(pro==null){
            return ResponseEntity.notFound().build();
        }
        pro.setPname(prodetails.getPname());
        pro.setPmadein(prodetails.getPmadein());
        pro.setPtype(prodetails.getPtype());

        products updateProduct = productDAO.save(pro);
        return ResponseEntity.ok().body(updateProduct);
    }

    /*delete a product*/
    @DeleteMapping("/delete/{pid}")
    public ResponseEntity<products> deleteProduct(@PathVariable("pid") Integer pid){

        products pro = productDAO.getOne(pid);
        if(pro==null){
            return ResponseEntity.notFound().build();
        }

        productDAO.delete(pro);
        return ResponseEntity.ok().build();
    }
}
