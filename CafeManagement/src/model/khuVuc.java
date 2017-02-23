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
public class khuVuc {
    private String khuVucID;
    private String tenKhuVuc;

    public khuVuc(String khuVucID, String tenKhuVuc) {
        this.khuVucID = khuVucID;
        this.tenKhuVuc = tenKhuVuc;
    }

    public String getKhuVucID() {
        return khuVucID;
    }

    public void setKhuVucID(String khuVucID) {
        this.khuVucID = khuVucID;
    }

    public String getTenKhuVuc() {
        return tenKhuVuc;
    }

    public void setTenKhuVuc(String tenKhuVuc) {
        this.tenKhuVuc = tenKhuVuc;
    }

    @Override
    public String toString() {
        return "khuVuc{" + "khuVucID=" + khuVucID + ", tenKhuVuc=" + tenKhuVuc + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.khuVucID);
        hash = 73 * hash + Objects.hashCode(this.tenKhuVuc);
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
        final khuVuc other = (khuVuc) obj;
        if (!Objects.equals(this.khuVucID, other.khuVucID)) {
            return false;
        }
        if (!Objects.equals(this.tenKhuVuc, other.tenKhuVuc)) {
            return false;
        }
        return true;
    }
    
}
