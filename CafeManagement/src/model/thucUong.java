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
public class thucUong {
    private String thucUongID;
    private String loaiThucUongID;
    private String tenThucUong;
    private int gia;
    private String donViTinh;
    private int soLuong;
    public thucUong(String thucUongID, String loaiThucUongID, String tenThucUong, int gia, String donViTinh, int soLuong) {
        this.thucUongID = thucUongID;
        this.loaiThucUongID = loaiThucUongID;
        this.tenThucUong = tenThucUong;
        this.gia = gia;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
    }

    public String getThucUongID() {
        return thucUongID;
    }

    public void setThucUongID(String thucUongID) {
        this.thucUongID = thucUongID;
    }

    public String getLoaiThucUongID() {
        return loaiThucUongID;
    }

    public void setLoaiThucUongID(String loaiThucUongID) {
        this.loaiThucUongID = loaiThucUongID;
    }

    public String getTenThucUong() {
        return tenThucUong;
    }

    public void setTenThucUong(String tenThucUong) {
        this.tenThucUong = tenThucUong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "thucUong{" + "thucUongID=" + thucUongID + ", loaiThucUongID=" + loaiThucUongID + ", tenThucUong=" + tenThucUong + ", gia=" + gia + ", donViTinh=" + donViTinh + ", soLuong=" + soLuong + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.thucUongID);
        hash = 53 * hash + Objects.hashCode(this.loaiThucUongID);
        hash = 53 * hash + Objects.hashCode(this.tenThucUong);
        hash = 53 * hash + this.gia;
        hash = 53 * hash + Objects.hashCode(this.donViTinh);
        hash = 53 * hash + this.soLuong;
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
        final thucUong other = (thucUong) obj;
        if (this.gia != other.gia) {
            return false;
        }
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (!Objects.equals(this.thucUongID, other.thucUongID)) {
            return false;
        }
        if (!Objects.equals(this.loaiThucUongID, other.loaiThucUongID)) {
            return false;
        }
        if (!Objects.equals(this.tenThucUong, other.tenThucUong)) {
            return false;
        }
        if (!Objects.equals(this.donViTinh, other.donViTinh)) {
            return false;
        }
        return true;
    }
    
    
}
