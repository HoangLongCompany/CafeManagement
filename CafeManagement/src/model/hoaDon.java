/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author BaoLong
 */
public class hoaDon {
    private String hoaDonID;
    private String loginID;
    private String banID;
    private String thoiGian;
    private int hieuLuc;
    private int thanhTien;
    private int giamGia;
    private int tongTien;
    private String ghiChu;
    
    public hoaDon(){
        
    }

    public hoaDon(String hoaDonID, String loginID, String banID, String thoiGian, int hieuLuc, int thanhTien, int giamGia, int tongTien, String ghiChu) {
        this.hoaDonID = hoaDonID;
        this.loginID = loginID;
        this.banID = banID;
        this.thoiGian = thoiGian;
        this.hieuLuc = hieuLuc;
        this.thanhTien = thanhTien;
        this.giamGia = giamGia;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
    }

    public String getHoaDonID() {
        return hoaDonID;
    }

    public void setHoaDonID(String hoaDonID) {
        this.hoaDonID = hoaDonID;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getBanID() {
        return banID;
    }

    public void setBanID(String banID) {
        this.banID = banID;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getHieuLuc() {
        return hieuLuc;
    }

    public void setHieuLuc(int hieuLuc) {
        this.hieuLuc = hieuLuc;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "hoaDon{" + "hoaDonID=" + hoaDonID + ", loginID=" + loginID + ", banID=" + banID + ", thoiGian=" + thoiGian + ", hieuLuc=" + hieuLuc + ", thanhTien=" + thanhTien + ", giamGia=" + giamGia + ", tongTien=" + tongTien + ", ghiChu=" + ghiChu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.hoaDonID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final hoaDon other = (hoaDon) obj;
        if (!Objects.equals(this.hoaDonID, other.hoaDonID)) {
            return false;
        }
        return true;
    }
    
}
