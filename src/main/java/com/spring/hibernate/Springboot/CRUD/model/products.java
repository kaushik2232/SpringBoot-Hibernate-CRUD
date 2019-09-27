package com.spring.hibernate.Springboot.CRUD.model;

import javax.persistence.*;

@Entity
@Table(name = "products", catalog="test")
public class products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pid;
    private String pname;
    private String ptype;
    private Integer pmadein;

    public products() {
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public Integer getPmadein() {
        return pmadein;
    }

    public void setPmadein(Integer pmadein) {
        this.pmadein = pmadein;
    }
}
