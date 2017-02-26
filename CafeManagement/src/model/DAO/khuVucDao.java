/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
import model.khuVuc;

/**
 *
 * @author pc
 */
public interface khuVucDao {
    public void add(khuVuc kv);
    public void update(khuVuc kv);
    public void delete(String kvID);
    public khuVuc getKhuVuc(String kvID);
    public List<khuVuc> getAll();
}
