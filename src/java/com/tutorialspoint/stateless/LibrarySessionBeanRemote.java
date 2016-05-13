/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;

import com.tutorialspoint.model.Book;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Remote;

/**
 *
 * @author ThangN
 */
@Remote
public interface LibrarySessionBeanRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void addBook(Book book);
    
    public List<Book> getBooks();
    
}
