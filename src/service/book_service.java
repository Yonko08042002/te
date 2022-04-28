/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;



import java.util.List;
import model.T_123;
import model.T_123DAO;

/**
 *
 * @author dell
 */
public class book_service {
     private T_123DAO qltv;

    public book_service() {
        qltv = new T_123DAO();
        
    }
    
    public List<T_123> getAllUsers(){
        return qltv.getAllUsers();
    }
    
    public void add(T_123 tl){
        qltv.add(tl);
    }
    
    public void delete(String id){
        qltv.delete(id);
    }
    /*public users getUserByID(int id){
       return userLink.getUserByID(id);
    }*/
}
