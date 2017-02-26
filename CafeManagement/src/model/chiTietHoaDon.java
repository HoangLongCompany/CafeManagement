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
public class chiTietHoaDon {
    private String CTHoaDonID;
    private String hoaDonID;
    private String thucUongID;
    private int soLuong;
    
    public chiTietHoaDon(){
        
    }

    public chiTietHoaDon(String CTHoaDonID, String hoaDonID, String thucUongID, int soLuong) {
        this.CTHoaDonID = CTHoaDonID;
        this.hoaDonID = hoaDonID;
        this.thucUongID = thucUongID;
        this.soLuong = soLuong;
    }

    public String getCTHoaDonID() {
        return CTHoaDonID;
    }

    public void setCTHoaDonID(String CTHoaDonID) {
        this.CTHoaDonID = CTHoaDonID;
    }

    public String getHoaDonID() {
        return hoaDonID;
    }

    public void setHoaDonID(String hoaDonID) {
        this.hoaDonID = hoaDonID;
    }

    public String getThucUongID() {
        return thucUongID;
    }

    public void setThucUongID(String thucUongID) {
        this.thucUongID = thucUongID;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "chiTietHoaDon{" + "CTHoaDonID=" + CTHoaDonID + ", hoaDonID=" + hoaDonID + ", thucUongID=" + thucUongID + ", soLuong=" + soLuong + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.CTHoaDonID);
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
        final chiTietHoaDon other = (chiTietHoaDon) obj;
        if (!Objects.equals(this.CTHoaDonID, other.CTHoaDonID)) {
            return false;
        }
        return true;
    }
    
}
