/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
import model.ban;

/**
 *
 * @author pc
 */
public interface banDao {
    public void add(ban b);
    public void update(ban b);
    public void delete(String banID);
    public ban getBan(String banID);
    public List<ban> getAll();
}
