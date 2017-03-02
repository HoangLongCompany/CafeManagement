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
import model.hoaDon;

/**
 *
 * @author BaoLong
 */
public class hoaDonDaoImpl implements hoaDonDao{
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    @Override
    public void add(hoaDon hd) {
        conn = DBConnection.getConnection();
        String sql= "INSERT INTO tb_hoadon VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, hd.getHoaDonID());
            pst.setString(2, hd.getLoginID());
            pst.setString(3, hd.getBanID());
            java.sql.Date setDate = new java.sql.Date(hd.getThoiGian().getTime());
            pst.setDate(4, setDate);
            pst.setInt(5, hd.getHieuLuc());
            pst.setInt(6, hd.getThanhTien());
            pst.setInt(7, hd.getGiamGia());
            pst.setInt(8, hd.getTongTien());
            pst.setString(9, hd.getGhiChu());
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(hoaDonDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void update(hoaDon hd) {
        conn  = DBConnection.getConnection();
        String sql = "UPDATE tb_hoadon SET LoginID='"+hd.getLoginID()+"',BanID='"+hd.getBanID()+
                     "',ThoiGian='"+hd.getThoiGian()+"',HieuLuc='"+hd.getHieuLuc()+"',ThanhTien='"+hd.getThanhTien()+
                     "',GiamGia='"+hd.getGiamGia()+"',TongTien='"+hd.getTongTien()+"',GhiChu='"+hd.getGhiChu()+
                     "' WHERE HoaDonID='"+hd.getHoaDonID()+"'";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(hoaDonDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void delete(String hdID) {
        conn = DBConnection.getConnection();
        String sql = "DELETE FROM tb_hoadon WHERE HoaDonID="+hdID;
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(hoaDonDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public hoaDon getHoaDon(String hdID) {
        conn = DBConnection.getConnection();
        String sql = "SELECT * FROM tb_hoadon WHERE HoaDonID="+hdID;
        hoaDon hd = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            while (rs.next()) {                
                hd = new hoaDon(rs.getString("HoaDonID"), rs.getString("LoginID"), rs.getString("BanID"), 
                                rs.getDate("ThoiGian"), rs.getInt("HieuLuc"), rs.getInt("ThanhTien"),
                                rs.getInt("GiamGia"), rs.getInt("TongTien"), rs.getString("GhiChu"));

            }
        } catch (SQLException e) {
            Logger.getLogger(hoaDonDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return hd;
    }

    @Override
    public List<hoaDon> getAll() {
        conn = DBConnection.getConnection();
        List<hoaDon> list = new ArrayList<>();
        hoaDon hd = null;
        String sql = "SELECT * FROM tb_hoadon";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            while (rs.next()) {                
                hd = new hoaDon(rs.getString("HoaDonID"), rs.getString("LoginID"), rs.getString("BanID"), 
                                rs.getDate("ThoiGian"), rs.getInt("HieuLuc"), rs.getInt("ThanhTien"),
                                rs.getInt("GiamGia"), rs.getInt("TongTien"), rs.getString("GhiChu"));
                list.add(hd);
            }
        } catch (SQLException e) {
            Logger.getLogger(hoaDonDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    
    public static void main(String[] args){
        hoaDonDaoImpl hoaDonDao = new hoaDonDaoImpl();
//        hoaDon hd = new hoaDon("HD001", "LG001", "B03", "2017-03-01", 0, 0, 0, 0, ghiChu);        
//        hoaDonDao.add(hd);
        System.out.println("OK");
    }
}
