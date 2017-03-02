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
import model.quanLy;

/**
 *
 * @author BaoLong
 */
public class quanLyDaoImpl implements quanLyDao{
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    
    @Override
    public void add(quanLy ql) {
        conn = DBConnection.getConnection();
        String sql = "INSERT INTO tb_quanly VALUES (?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, ql.getLoginID());
            pst.setString(2, ql.getTaiKhoan());
            pst.setString(3, ql.getMatKhau());
            pst.setString(4, ql.getHoTen());
            pst.setString(5, ql.getSoCMND());
            pst.setInt(6, ql.getQuyen());
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(quanLyDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void update(quanLy ql) {
        conn = DBConnection.getConnection();
        String sql = "UPDATE tb_quanly SET TaiKhoan='"+ql.getTaiKhoan()+"',MatKhau='"+ql.getMatKhau()+"',HoTen='"+ql.getHoTen()
                      +"',SoCMND='"+ql.getSoCMND()+"',Quyen='"+ql.getQuyen()+"' WHERE LoginID='"+ql.getLoginID()+"'";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(quanLyDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void delete(String qlID) {
        conn = DBConnection.getConnection();
        String sql = "DELETE FROM tb_quanly WHERE LoginID="+qlID;
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(quanLyDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public quanLy getQuanLy(String qlID) {
        conn = DBConnection.getConnection();
        quanLy ql = null;
        String sql = "SELECT * FROM tb_quanly WHERE LoginID="+qlID;
        try {
            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            while (rs.next()) {                
                ql = new quanLy(rs.getString("LoginID"), rs.getString("TaiKhoan"), rs.getString("MatKhau"), 
                                rs.getString("HoTen"), rs.getString("SoCMND"), rs.getInt("Quyen"));
            }
        } catch (SQLException e) {
            Logger.getLogger(quanLyDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return ql;
    }

    @Override
    public List<quanLy> getAll() {
        conn = DBConnection.getConnection();
        String sql = "SELECT * FROM tb_quanly";
        List<quanLy> list = new ArrayList<>();
        quanLy ql = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            while (rs.next()) { 
                ql = new quanLy(rs.getString("LoginID"), rs.getString("TaiKhoan"), rs.getString("MatKhau"), 
                                rs.getString("HoTen"), rs.getString("SoCMND"), rs.getInt("Quyen"));   
                list.add(ql);
            }
        } catch (SQLException e) {
            Logger.getLogger(quanLyDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    public static void main(String[] args) {
        quanLyDaoImpl quanLyDao = new quanLyDaoImpl();
        quanLy ql = new quanLy("LG001", "tnbaolong", "222222", "Tran Ngoc Bao Long", 
                                "205903351", 1);
        quanLyDao.update(ql);
        System.out.println("OK");
    }
}
