/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
import model.hoaDon;

/**
 *
 * @author pc
 */
public interface hoaDonDao {
    public void add(hoaDon hd);
    public void update(hoaDon hd);
    public void delete(String hdID);
    public hoaDon getHoaDon(String hdID);
    public List<hoaDon> getAll();
}
