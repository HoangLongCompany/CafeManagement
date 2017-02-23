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
public class loaiThucUong {
    private String loaiThucUongID;
    private String tenLoaiThucUong;

    public loaiThucUong(String loaiThucUongID, String tenLoaiThucUong) {
        this.loaiThucUongID = loaiThucUongID;
        this.tenLoaiThucUong = tenLoaiThucUong;
    }

    public String getLoaiThucUongID() {
        return loaiThucUongID;
    }

    public void setLoaiThucUongID(String loaiThucUongID) {
        this.loaiThucUongID = loaiThucUongID;
    }

    public String getTenLoaiThucUong() {
        return tenLoaiThucUong;
    }

    public void setTenLoaiThucUong(String tenLoaiThucUong) {
        this.tenLoaiThucUong = tenLoaiThucUong;
    }

    @Override
    public String toString() {
        return "loaiThucUong{" + "loaiThucUongID=" + loaiThucUongID + ", tenLoaiThucUong=" + tenLoaiThucUong + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.loaiThucUongID);
        hash = 59 * hash + Objects.hashCode(this.tenLoaiThucUong);
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
        final loaiThucUong other = (loaiThucUong) obj;
        if (!Objects.equals(this.loaiThucUongID, other.loaiThucUongID)) {
            return false;
        }
        if (!Objects.equals(this.tenLoaiThucUong, other.tenLoaiThucUong)) {
            return false;
        }
        return true;
    }
    
}
