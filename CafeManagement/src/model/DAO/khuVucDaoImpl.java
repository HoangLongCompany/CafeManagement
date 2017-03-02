/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import Connection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.khuVuc;

/**
 *
 * @author BaoLong
 */
public class khuVucDaoImpl implements khuVucDao{
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    
    @Override
    public void add(khuVuc kv) {
        conn = DBConnection.getConnection();
        String sql = "INSERT INTO tb_khuvuc VALUES (?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, kv.getKhuVucID());
            pst.setString(2, kv.getTenKhuVuc());
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(khuVucDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void update(khuVuc kv) {
        conn = DBConnection.getConnection();
        String sql = "UPDATE tb_khuvuc SET TenKhuVuc='"+kv.getTenKhuVuc()
                     +"' WHERE KhuVucID='"+kv.getKhuVucID()+"'";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(khuVucDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void delete(String kvID) {
        conn = DBConnection.getConnection();
        String sql = "DELETE FROM tb_khuvuc WHERE KhuVucID = ? ";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, kvID);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(khuVucDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public khuVuc getKhuVuc(String kvID) {
        khuVuc kv = null;
        conn = DBConnection.getConnection();
        String sql = "SELECT * FROM tb_khuvuc WHERE khuVucID = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, kvID);
            rs = pst.executeQuery();
            while (rs.next()) {                
                kv = new khuVuc(rs.getString("KhuVucID"), rs.getString("TenKhuVuc"));                
            }            
        } catch (SQLException e) {
            Logger.getLogger(khuVucDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return kv;
    }

    @Override
    public List<khuVuc> getAll() {
        List<khuVuc> list = new ArrayList<>();
        khuVuc kv;
        conn = DBConnection.getConnection();
        String sql = "SELECT * FROM tb_khuvuc";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                kv = new khuVuc(rs.getString("KhuVucID"), rs.getString("TenKhuVuc"));
                list.add(kv);
            }
        } catch (SQLException e) {
            Logger.getLogger(khuVucDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    public static void main(String[] args){
        khuVucDaoImpl khuVucDao = new khuVucDaoImpl();
//        khuVuc kv = new khuVuc("KV1", "Khu Vuc 1");
//        khuVucDao.add(kv);
//        khuVuc kv = khuVucDao.getKhuVuc("KV1");
//        System.out.println(kv.toString());
//        List<khuVuc> l = new ArrayList<>();
//        l = khuVucDao.getAll();
//        for (khuVuc i: l){
//            System.out.println(i);
//        }
//        khuVucDao.delete("KV1");
//        System.out.println("OK");
    }
}
