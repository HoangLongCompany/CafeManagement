/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import Connection.DBConnection;
import Connection.DateDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
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
        String sql = "DELETE FROM tb_hoadon WHERE HoaDonID = ? ";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, hdID);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(hoaDonDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public hoaDon getHoaDon(String hdID) {
        conn = DBConnection.getConnection();
        String sql = "SELECT * FROM tb_hoadon WHERE HoaDonID = ? ";
        hoaDon hd = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, hdID);
            rs = pst.executeQuery();
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
            rs = pst.executeQuery();
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
    
    public static void main(String[] args) throws ParseException{
        hoaDonDaoImpl hoaDonDao = new hoaDonDaoImpl();
//        String date = "2/3/2017";
//        Date d = DateDao.convetToDate(date);
//        hoaDon hd = new hoaDon("HD001", "LG001", "B03", d, 0, 0, 0, 0, "hop dong mua ban");        
//        hoaDonDao.add(hd);
//        hoaDon hd = hoaDonDao.getHoaDon("HD001");
//        System.out.println(hd.toString());
//        List<hoaDon> l = new ArrayList<>();
//        l = hoaDonDao.getAll();
//        for (hoaDon i : l){
//            System.out.println(i);
//        }
        hoaDonDao.delete("HD001");
        System.out.println("OK");
    }
}
