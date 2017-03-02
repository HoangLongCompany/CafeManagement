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
import model.nhanVien;

/**
 *
 * @author pc
 */
public class nhanVienDaoImpl implements nhanVienDao{
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    
    @Override
    public void add(nhanVien nv) {
        conn = DBConnection.getConnection();
        String sql ="INSERT INTO tb_nhanvien VALUES (?,?,?,?,?,?,?,?)";
        try {
            pst= conn.prepareStatement(sql);
            pst.setString(1, nv.getNhanVienID());
            pst.setString(2, nv.getHoTen());
            java.sql.Date sqlDate = new java.sql.Date(nv.getNgaySinh().getTime());
            pst.setDate(3, sqlDate);
            pst.setInt(4, nv.getGioiTinh());
            pst.setInt(5, nv.getSoCMND());
            pst.setString(6, nv.getSoDT());
            pst.setString(7, nv.getDiaChi());
            pst.setString(8, nv.getCaLam());
            
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(banDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }     
    }

    @Override
    public void update(nhanVien nv) {
        conn = DBConnection.getConnection();
        String sql = "UPDATE tb_nhanvien SET HoTen='"+nv.getHoTen()+"',NgaySinh='"+nv.getNgaySinh()
                     +"',GioiTinh='"+nv.getGioiTinh()+"',SoCMND='"+nv.getSoCMND()+"',SoDT='"+nv.getSoDT()
                     +"',DiaChi='"+nv.getDiaChi()+"',CaLam='"+nv.getCaLam()+"' WHERE NhanVienID='"+nv.getNhanVienID()+"'";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(nhanVienDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void delete(String nvID) {
        conn = DBConnection.getConnection();
        String sql = "DELETE FROM tb_nhanvien WHERE NhanVienID= ?";  
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, nvID);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(nhanVienDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public nhanVien getNhanVien(String nvID) {
        conn = DBConnection.getConnection();
        nhanVien nv = null;
        String sql = "SELECT * FROM tb_nhanvien WHERE NhanVienID= ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, nvID);
            rs = pst.executeQuery();
            while (rs.next()) {                
                nv = new nhanVien(rs.getString("NhanVienID"), rs.getString("HoTen"), rs.getDate("NgaySinh"),
                                  rs.getInt("GioiTinh"), rs.getInt("SoCMND"), rs.getString("SoDT"), rs.getString("DiaChi"),
                                  rs.getString("CaLam"));
            }
        } catch (Exception e) {
        }
        return nv;
    }

    @Override
    public List<nhanVien> getAll() {
        conn = DBConnection.getConnection();
        nhanVien nv =null;
        List<nhanVien> list = new ArrayList<>();
        String sql = "SELECT * FROM tb_nhanvien";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                nv = new nhanVien(rs.getString("NhanVienID"), rs.getString("HoTen"), rs.getDate("NgaySinh"),
                                  rs.getInt("GioiTinh"), rs.getInt("SoCMND"), rs.getString("SoDT"), rs.getString("DiaChi"),
                                  rs.getString("CaLam"));
                list.add(nv);
            }
        } catch (SQLException e) {
            Logger.getLogger(nhanVienDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    public static void main(String[] args) throws ParseException{
        nhanVienDaoImpl nhanvienDao = new nhanVienDaoImpl();
//        Date d = DateDao.convetToDate("27/7/1995");
//        nhanVien nv = new nhanVien("NV001", "Ta Quang Hoang", d , 1, 205903351, "0905515033", "Tam Kỳ", "Sáng");
//        nhanvienDao.add(nv);
//        nhanVien nv = nhanvienDao.getNhanVien("NV001");
//        System.out.println(nv.toString());
//        List<nhanVien> l = new ArrayList<>();
//        l = nhanvienDao.getAll();
//        for (nhanVien i : l){
//            System.out.println(i.toString());
//        }
//        nhanvienDao.delete("NV001");
        System.out.println("OK");
    }
}
