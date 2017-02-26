/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
import model.quanLy;

/**
 *
 * @author pc
 */
public interface quanLyDao {
    public void add(quanLy ql);
    public void update(quanLy ql);
    public void delete(String qlID);
    public quanLy getQuanLy(String qlID);
    public List<quanLy> getAll();
}
