/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author BaoLong
 */
public class nhanVien {
    private String nhanVienID;
    private String hoTen;
    private Date ngaySinh;
    private int gioiTinh;
    private int soCMND;
    private String soDT;
    private String diaChi;
    private String caLam;
    
    public nhanVien(){
        
    }

    public nhanVien(String nhanVienID, String hoTen, Date ngaySinh, int gioiTinh, int soCMND, String soDT, String diaChi, String caLam) {
        this.nhanVienID = nhanVienID;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.caLam = caLam;
    }

    public String getNhanVienID() {
        return nhanVienID;
    }

    public void setNhanVienID(String nhanVienID) {
        this.nhanVienID = nhanVienID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCaLam() {
        return caLam;
    }

    public void setCaLam(String caLam) {
        this.caLam = caLam;
    }

    @Override
    public String toString() {
        return "nhanVien{" + "nhanVienID=" + nhanVienID + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", soCMND=" + soCMND + ", soDT=" + soDT + ", diaChi=" + diaChi + ", caLam=" + caLam + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nhanVienID);
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
        final nhanVien other = (nhanVien) obj;
        if (!Objects.equals(this.nhanVienID, other.nhanVienID)) {
            return false;
        }
        return true;
    }
    
}
