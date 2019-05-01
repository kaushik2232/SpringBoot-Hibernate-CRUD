package com.SpringBootHibernate.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootHibernate.Repository.DeveloperRepository;
import com.SpringBootHibernate.model.Developer;

@Service
public class DeveloperDAO {
	
	 @Autowired
	 DeveloperRepository developerRepository;


	    /*Save the developer*/
	    public Developer save(Developer dev){
	        return developerRepository.save(dev);
	    }

	    /*Search for a developer*/
	    public List<Developer> findAll(){
	        return developerRepository.findAll();
	    }
	    /*get the developer*/
	    public Developer getOne(int id) {
	      return developerRepository.getOne(id);
	    }

	    /*delete the developer*/
	    public void delete(Developer dev){
	        developerRepository.delete(dev);
	    }

}
