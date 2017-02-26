/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
import model.chiTietHoaDon;

/**
 *
 * @author pc
 */
public interface chiTietHoaDonDao {
    public void add(chiTietHoaDon cthd);
    public void update(chiTietHoaDon cthd);
    public void delete(String cthdID);
    public chiTietHoaDon getChiTietHoaDon(String cthdID);
    public List<chiTietHoaDon> getAll();
}
