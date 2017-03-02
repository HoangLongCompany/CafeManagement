/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import Connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ban;

/**
 *
 * @author BaoLong
 */
public  class banDaoImpl implements banDao{
    
    
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    
    @Override
    public void add(ban b) {
        conn = DBConnection.getConnection();
        String sql ="INSERT INTO tb_ban VALUES (?,?,?,?,?)";
        try {
            pst= conn.prepareStatement(sql);
            pst.setString(1, b.getBanID());
            pst.setString(2, b.getTenBan());
            pst.setString(3, b.getKhuVucID());
            pst.setInt(4, b.getTrangThai());
            pst.setString(5, b.getGhiChu());
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(banDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }     
    }

    @Override
    public void update(ban b) {
        conn = DBConnection.getConnection();
        String sql = "UPDATE tb_ban SET TenBan='"+b.getTenBan()
                +"',KhuVucID='"+b.getKhuVucID()+"',TrangThai='"
                +b.getTrangThai()+"',GhiChu='"+b.getGhiChu()+"' WHERE BanID='"+b.getBanID()+"'";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(banDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void delete(String banID) {
        conn = DBConnection.getConnection();
        String sql = "DELETE FROM tb_ban WHERE BanID="+banID;
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(banDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public ban getBan(String banID) {
        ban b = null;
        conn = DBConnection.getConnection();
        String sql = "SELECT * FROM tb_ban WHERE BanID="+banID;
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                b = new ban(rs.getString("BanID"), 
                            rs.getString("TenBan"), rs.getString("KhuVucID"),
                            rs.getInt("TrangThai"), rs.getString("GhiChu"));                
            }            
        } catch (SQLException e) {
            Logger.getLogger(banDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return b;
    }

    @Override
    public List<ban> getAll() {
        List<ban> list = new ArrayList<>();
        ban b;
        conn = DBConnection.getConnection();
        String sql = "SELECT * FROM tb_ban";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                b = new ban(rs.getString("BanID"), rs.getString("TenBan"), 
                            rs.getString("KhuVucID"), rs.getInt("TrangThai"), 
                            rs.getString("GhiChu"));
                list.add(b);
            }
        }catch (SQLException e) {
            Logger.getLogger(banDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }   
    public static void main(String[] args) {
        ban b = new ban("B1","Ban 1" , "KV1", 0, "OK");
        banDaoImpl banDao = new banDaoImpl();
        banDao.add(b);
        System.out.println("ok"); 
                
    }        
}
