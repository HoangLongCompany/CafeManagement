/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
import model.loaiThucUong;

/**
 *
 * @author pc
 */
public interface loaiThucUongDao {
    public void add(loaiThucUong loaiTU);
    public void update(loaiThucUong loaiTU);
    public void delete(String loaiTUID);
    public loaiThucUong getLoaiThucUong(String loaiTUID);
    public List<loaiThucUong> getAll();
}
