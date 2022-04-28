/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JComboBox;
/**
 *
 * @author ASUS
 */
public class T_123 {
    private String Id;
    private String Title;
    private int quantity ;
    private float Price;

    public T_123() {
    }

    public T_123(String Id, String Title, int quantity, float Price) {
        this.Id = Id;
        this.Title = Title;
        this.quantity = quantity;
        this.Price = Price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   

   
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "T_123{" + "Id=" + Id + ", Title=" + Title + ", quantity=" + quantity + ", Price=" + Price + '}';
    }

   

   
}