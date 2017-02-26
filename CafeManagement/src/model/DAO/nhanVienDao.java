/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
import model.nhanVien;

/**
 *
 * @author pc
 */
public interface nhanVienDao {
    public void add(nhanVien nv);
    public void update(nhanVien nv);
    public void delete(String nvID);
    public nhanVien getNhanVien(String nvID);
    public List<nhanVien> getAll();
}
