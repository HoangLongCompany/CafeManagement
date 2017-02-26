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
public class quanLy {
    private String loginID;
    private String taiKhoan;
    private String matKhau;
    private String hoTen;
    private String soCMND;
    private int quyen;
    
    public quanLy(){
        
    }

    public quanLy(String loginID, String taiKhoan, String matKhau, String hoTen, String soCMND, int quyen) {
        this.loginID = loginID;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.soCMND = soCMND;
        this.quyen = quyen;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    @Override
    public String toString() {
        return "quanLy{" + "loginID=" + loginID + ", taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + ", hoTen=" + hoTen + ", soCMND=" + soCMND + ", quyen=" + quyen + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.loginID);
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
        final quanLy other = (quanLy) obj;
        if (!Objects.equals(this.loginID, other.loginID)) {
            return false;
        }
        return true;
    }
    
}
