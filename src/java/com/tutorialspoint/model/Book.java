/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author ThangN
 */
@Entity
@Table(name = "book")
public class Book implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "book_gene_seq")
    @SequenceGenerator(name = "book_gene_seq", sequenceName = "BOOK_ENTITY_SEQ")
    @Column(name = "ID")
    private int id;
    
    @Column(name = "BOOK_NAME")
    private String name;
    
    public Book(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
