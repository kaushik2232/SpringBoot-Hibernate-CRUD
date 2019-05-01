package com.SpringBootHibernate.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "developer")
@EntityListeners(AuditingEntityListener.class)
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

  
    private String devname;
 
    private String drole;
    
    private int dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDevname() {
        return devname;
    }

    public void setDname(String devname) {
        this.devname = devname;
    }

    public String getDrole() {
        return drole;
    }

    public void setDrole(String drole) {
        this.drole = drole;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }
}