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
import model.loaiThucUong;

/**
 *
 * @author pc
 */
public class loaiThucUongDaoImpl implements loaiThucUongDao{

    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    
    @Override
    public void add(loaiThucUong loaiTU) {
        conn = DBConnection.getConnection();
        String sql ="INSERT INTO tb_loaithucuong VALUES (?,?)";
        try {
            pst= conn.prepareStatement(sql);
            pst.setString(1, loaiTU.getLoaiThucUongID());
            pst.setString(2, loaiTU.getTenLoaiThucUong());
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(banDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }     
    }

    @Override
    public void update(loaiThucUong loaiTU) {
        conn = DBConnection.getConnection();
        String sql = "UPDATE tb_loaithucuong SET TenBan='"+loaiTU.getTenLoaiThucUong()+"' where "
                + "LoaiThucUongID='"+loaiTU.getLoaiThucUongID()+"'";
        try {
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(banDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void delete(String loaiTUID) {
        conn = DBConnection.getConnection();
        String sql = "DELETE FROM tb_loaithucuong WHERE LoaiThucUongID = ? ";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, loaiTUID);
            pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(banDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public loaiThucUong getLoaiThucUong(String loaiTUID) {
        loaiThucUong loaiTU = null;
        conn = DBConnection.getConnection();
        String sql = "SELECT * FROM tb_loaithucuong WHERE LoaiThucUongID = ? ";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, loaiTUID);
            rs = pst.executeQuery();
            while (rs.next()) {                
            loaiTU = new loaiThucUong(rs.getString("LoaiThucUongID"), rs.getString("TenLoaiThucUong"));
            }            
        } catch (SQLException e) {
            Logger.getLogger(banDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return loaiTU;
    }

    @Override
    public List<loaiThucUong> getAll() {
        List<loaiThucUong> list = new ArrayList<>();
        conn = DBConnection.getConnection();
        String sql = "SELECT * FROM tb_loaithucuong";
        loaiThucUong loaiTU = null;
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {   
            loaiTU = new loaiThucUong(rs.getString("LoaiThucUongID"), rs.getString("TenLoaiThucUong"));
            list.add(loaiTU);
            }            
        } catch (SQLException e) {
            Logger.getLogger(banDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    public static void main(String[] args) {
        loaiThucUongDaoImpl loaiThucUongDao = new loaiThucUongDaoImpl();
//        loaiThucUong l = new loaiThucUong("TS","Tra Sua");
//        loaiThucUongDao.add(l);
//        loaiThucUong l = loaiThucUongDao.getLoaiThucUong("TS");
//        System.out.println(l.toString());
//        List<loaiThucUong> list = new ArrayList<>();
//        list = loaiThucUongDao.getAll();
//        for (loaiThucUong i : list){
//            System.out.println(i.toString());
//        }
        loaiThucUongDao.delete("TS");
        System.out.println("ok");
    }
            
}
