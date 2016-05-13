/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;



import com.tutorialspoint.model.Book;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ThangN
 */

@Stateless
public class LibrarySessionBean implements LibrarySessionBeanRemote{

    // pass persitence unit to entityManager
    @PersistenceContext(name = "EJBComponentsPU")
    private EntityManager entityManager;
    
    
    
    public LibrarySessionBean(){
        
    }
    @Override
    public void addBook(Book book) {
        //if(book.getId() != 0){
            //bookShelf.add(bookName);
            entityManager.persist(book);
        //}
    }

    @Override
    public List<Book> getBooks() {
        return entityManager.createQuery("From Book").getResultList();
    }
    
}
