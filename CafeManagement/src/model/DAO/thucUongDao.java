/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
import model.thucUong;

/**
 *
 * @author pc
 */
public interface thucUongDao {
    public void add(thucUong tu);
    public void update(thucUong tu);
    public void delete(String tuID);
    public thucUong getThucUong(String tuID);
    public List<thucUong> getAll();
}
