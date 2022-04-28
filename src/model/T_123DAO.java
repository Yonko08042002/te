/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Connect.Connect;
import static Connect.Connect.JDBCConnection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class T_123DAO {
    public List<T_123> getAllUsers() {
        List<T_123> ltl = new ArrayList<T_123>();

        Connection connection = Connect.JDBCConnection();
        String sql = "select * from Tin";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                T_123 tl = new T_123();
                tl.setId(rs.getString("Id"));
                tl.setTitle(rs.getString("Title"));
                tl.setQuantity(rs.getInt("quantity"));
                tl.setPrice(rs.getFloat("Price"));
                ltl.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }
    public List<String> getAllId() {
        List<String> ltl = new ArrayList<String>();

        Connection connection = Connect.JDBCConnection();
        String sql = "select * from Tin";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ltl.add(rs.getString("Id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }
    public void add(T_123 tl){
     Connection connection = Connect.JDBCConnection();          
            String sql = "INSERT INTO Tin (Id, Title,quantity ,Price) "
                    + "values (?,?,?,?) ";            
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, tl.getId());
                preparedStatement.setString(2, tl.getTitle());
                preparedStatement.setInt(3, tl.getQuantity());
                preparedStatement.setFloat(4, tl.getPrice());
                
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
                preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int updateUser(T_123 tl){
        Connection connection = Connect.JDBCConnection();
        String sql = "Update Tin set Title = ? , Price = ?,quantity =? where Id = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(4, tl.getId());
            preparedStatement.setString(1, tl.getTitle());
            preparedStatement.setInt(3, tl.getQuantity());
            preparedStatement.setFloat(2, tl.getPrice());
            if(preparedStatement.executeUpdate()>0){
                System.out.println("Update thành công!");
                return 1;
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public void delete(String id){
       Connection connection = Connect.JDBCConnection();
        String sql = "delete from Tin where Id = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);           
            int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<T_123> findTaiLieu(String id){
        ArrayList<T_123> ql = new ArrayList<T_123>();
        Connection connection = Connect.JDBCConnection();
        String sql = "select * from Tin where Id like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+id+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                T_123 tl = new T_123();
                tl.setId(rs.getString("Id"));
                tl.setTitle(rs.getString("Title"));
                tl.setQuantity(rs.getInt("quantity"));
                tl.setPrice(rs.getFloat("Price"));
                ql.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ql;
    }
    public T_123 find1TaiLieu(String id){
        T_123 ql = new T_123();
        Connection connection = Connect.JDBCConnection();
        String sql = "select * from Tin where Id like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+id+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ql.setId(rs.getString("Id"));
                ql.setTitle(rs.getString("Title"));
                ql.setQuantity(rs.getInt("quantity"));
                ql.setPrice(rs.getFloat("Price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ql;
    }
}
