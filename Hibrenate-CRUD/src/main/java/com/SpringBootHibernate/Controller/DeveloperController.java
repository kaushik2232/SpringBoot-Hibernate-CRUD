package com.SpringBootHibernate.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SpringBootHibernate.DAO.DeveloperDAO;
import com.SpringBootHibernate.model.Developer;

@RestController
@RequestMapping("/company")
public class DeveloperController {
	
	@Autowired
    DeveloperDAO developerDAO;

    /*Save an developer*/
    @PostMapping("/developers")
    public Developer createDeveloper(@Valid @RequestBody Developer dev) {
        return developerDAO.save(dev);
    }

    /*get all developers*/
    @GetMapping("/developers")
    public List<Developer> getAlldevelopers(){
        return developerDAO.findAll();
    }

    /*get developer by id*/
    @GetMapping("/developers/{id}")
    public ResponseEntity<Developer> getDeveloperById(@PathVariable(value="id") int id){

        Developer dev = developerDAO.getOne(id);

        if(dev==null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(dev);

    }

    /*update an employee by developer id*/
    @PutMapping("/developers/{id}")
    public ResponseEntity<Developer> updateDeveloper(@PathVariable(value="id") int id,@Valid @RequestBody Developer devDetails) {

        Developer dev = developerDAO.getOne(id);

        if (dev == null) {
            return ResponseEntity.notFound().build();
        }

        dev.setDname(devDetails.getDevname());
        dev.setDrole(devDetails.getDrole());
        dev.setDept(devDetails.getDept());

        Developer updateDeveloper = developerDAO.save(dev);
        return ResponseEntity.ok().body(updateDeveloper);
    }

    /*Delete an employee*/
    @DeleteMapping("/developer/{id}")
    public ResponseEntity<Developer> deleteDeveloper(@PathVariable(value="id") int id){

        Developer dev = developerDAO.getOne(id);
        if(dev == null) {
            return ResponseEntity.notFound().build();
        }
        developerDAO.delete(dev);

        return ResponseEntity.ok().build();


    }

}
