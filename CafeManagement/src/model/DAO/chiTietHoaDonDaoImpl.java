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
import model.chiTietHoaDon;

/**
 *
 * @author BaoLong
 */
public class chiTietHoaDonDaoImpl implements chiTietHoaDonDao{
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    @Override
    public void add(chiTietHoaDon cthd) {
      conn = DBConnection.getConnection();
      String sql = "INSERT INTO tb_chitiethoadon VALUES (?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, cthd.getCTHoaDonID());
            pst.setString(2, cthd.getHoaDonID());
            pst.setString(3, cthd.getThucUongID());
            pst.setInt(4, cthd.getSoLuong());
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(chiTietHoaDonDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void update(chiTietHoaDon cthd) {
      conn = DBConnection.getConnection();
      String sql = "UPDATE tb_chitiethoadon SET HoaDonID='"+cthd.getHoaDonID()
                    +"',ThucUongID='"+cthd.getThucUongID()+"',SoLuong='"+cthd.getSoLuong()
                    +"' WHERE CTHoaDonID='"+cthd.getCTHoaDonID()+"'";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(chiTietHoaDonDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void delete(String cthdID) {
        conn = DBConnection.getConnection();
        String sql = "DELETE FROM tb_chitiethoadon WHERE CTHoaDonID=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, cthdID);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(chiTietHoaDonDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public chiTietHoaDon getChiTietHoaDon(String cthdID) {
        conn = DBConnection.getConnection();
        chiTietHoaDon cthd = null;
        String sql = "SELECT * FROM tb_chitiethoadon WHERE CTHoaDonID = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, cthdID);
            rs = pst.executeQuery();
            while (rs.next()) {                
                cthd = new chiTietHoaDon(rs.getString("CTHoaDonID"), rs.getString("HoaDonID"), 
                                         rs.getString("ThucUongID"), rs.getInt("SoLuong"));
            }
        } catch (SQLException e) {
            Logger.getLogger(chiTietHoaDonDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return cthd;
    }

    @Override
    public List<chiTietHoaDon> getAll() {
        conn = DBConnection.getConnection();
        List<chiTietHoaDon> list = new ArrayList<>();
        chiTietHoaDon cthd = null;
        String sql = "SELECT * FROM tb_chitiethoadon";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                cthd = new chiTietHoaDon(rs.getString("CTHoaDonID"), rs.getString("HoaDonID"), 
                                         rs.getString("ThucUongID"), rs.getInt("SoLuong"));
                list.add(cthd);
            }
        } catch (SQLException e) {
            Logger.getLogger(chiTietHoaDonDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    public static void main(String[] args){
        chiTietHoaDonDaoImpl chiTietHoaDonDao = new chiTietHoaDonDaoImpl();
//        chiTietHoaDon cthd = new chiTietHoaDon("CTHD001", "HD002", "Tra Sua", 1);
//        chiTietHoaDonDao.add(cthd);
//        chiTietHoaDon cthd1 = chiTietHoaDonDao.getChiTietHoaDon("CTHD001");
//        System.out.println(cthd1.toString());
//        chiTietHoaDon.update(cthd);
//        List<chiTietHoaDon> l = new ArrayList<>();
//        l = chiTietHoaDonDao.getAll();
//        for (chiTietHoaDon i: l){
//            System.out.println(i.toString());
//        }
//        chiTietHoaDonDao.delete("CTHD001");
        System.out.println("OK");
    }
}
