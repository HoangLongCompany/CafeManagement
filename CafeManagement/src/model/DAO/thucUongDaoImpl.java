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
import model.thucUong;

/**
 *
 * @author BaoLong
 */
public class thucUongDaoImpl implements thucUongDao{
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    @Override
    public void add(thucUong tu) {
        conn = DBConnection.getConnection();
        String sql = "INSERT INTO tb_thucuong VALUES (?,?,?,?,?,?)";    
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tu.getThucUongID());
            pst.setString(2, tu.getLoaiThucUongID());
            pst.setString(3, tu.getTenThucUong());
            pst.setInt(4, tu.getGia());
            pst.setString(5, tu.getDonViTinh());
            pst.setInt(6, tu.getSoLuong());
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(thucUongDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void update(thucUong tu) {
        conn = DBConnection.getConnection();
        String sql = "UPDATE tb_thucuong SET LoaiThucUongID='"+tu.getLoaiThucUongID()+"',TenThucUong='"+tu.getTenThucUong()
                     +"',Gia='"+tu.getGia()+"',DonViTinh='"+tu.getDonViTinh()+"',SoLuong='"+tu.getSoLuong()
                     +"' WHERE ThucUongID='"+tu.getThucUongID()+"'";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(thucUongDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void delete(String tuID) {
        conn = DBConnection.getConnection();
        String sql = "DELETE FROM tb_thucuong WHERE ThucUongID="+tuID;    
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(thucUongDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public thucUong getThucUong(String tuID) {
        conn = DBConnection.getConnection();
        thucUong tu = null;
        String sql = "SELECT * FROM tb_thucuong WHERE ThucUongID="+tuID;
        try {
            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            while (rs.next()) {                
                tu = new thucUong(rs.getString("ThucUongID"), rs.getString("LoaiThucUongID"), 
                                  rs.getString("TenThucUong"), rs.getInt("Gia"), rs.getString("DonViTinh"),
                                  rs.getInt("SoLuong"));
            }
        } catch (SQLException e) {
            Logger.getLogger(thucUongDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return tu;
    }

    @Override
    public List<thucUong> getAll() {
        conn = DBConnection.getConnection();
        List<thucUong> list = new ArrayList<>();
        thucUong tu = null;
        String sql = "SELECT * FROM tb_thucuong";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            while (rs.next()) {                
                tu = new thucUong(rs.getString("ThucUongID"), rs.getString("LoaiThucUongID"), 
                                  rs.getString("TenThucUong"), rs.getInt("Gia"), rs.getString("DonViTinh"),
                                  rs.getInt("SoLuong"));
                list.add(tu);
            }
        } catch (SQLException e) {
            Logger.getLogger(thucUongDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    public static void main(String[] args) {
        thucUongDaoImpl thucUongDao = new thucUongDaoImpl();
        thucUong tu = new thucUong("TU001", "TS02", "Tra Sua SoCoLa", 15000, "VND", 5);
        thucUongDao.update(tu);
        System.out.println("OK");
    }
}
