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
public class ban {
    private String banID;
    private String tenBan;
    private String khuVucID;
    private int trangThai;
    private String ghiChu;
    
    public ban(){
    }

    public ban(String banID, String tenBan, String khuVucID, int trangThai, String ghiChu) {
        this.banID = banID;
        this.tenBan = tenBan;
        this.khuVucID = khuVucID;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

    public String getBanID() {
        return banID;
    }

    public void setBanID(String banID) {
        this.banID = banID;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getKhuVucID() {
        return khuVucID;
    }

    public void setKhuVucID(String khuVucID) {
        this.khuVucID = khuVucID;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "ban{" + "banID=" + banID + ", tenBan=" + tenBan + ", khuVucID=" + khuVucID + ", trangThai=" + trangThai + ", ghiChu=" + ghiChu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.banID);
        hash = 97 * hash + Objects.hashCode(this.tenBan);
        hash = 97 * hash + Objects.hashCode(this.khuVucID);
        hash = 97 * hash + this.trangThai;
        hash = 97 * hash + Objects.hashCode(this.ghiChu);
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
        final ban other = (ban) obj;
        if (this.trangThai != other.trangThai) {
            return false;
        }
        if (!Objects.equals(this.banID, other.banID)) {
            return false;
        }
        if (!Objects.equals(this.tenBan, other.tenBan)) {
            return false;
        }
        if (!Objects.equals(this.khuVucID, other.khuVucID)) {
            return false;
        }
        if (!Objects.equals(this.ghiChu, other.ghiChu)) {
            return false;
        }
        return true;
    }
    
}
