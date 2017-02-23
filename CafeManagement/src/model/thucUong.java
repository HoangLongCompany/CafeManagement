/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
    
    
}
