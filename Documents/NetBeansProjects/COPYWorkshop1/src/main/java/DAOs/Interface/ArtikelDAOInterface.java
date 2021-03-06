/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs.Interface;

import POJO.Artikel; 
import java.util.ArrayList;
import Factory.DaoFactory;
/**
 *
 * @author Anne
 */
public interface ArtikelDAOInterface {
    public ArrayList<Artikel> findAll();
    public Artikel findByArtikelID(int artikelID);
    public Artikel findByArtikelNaam(String artikelNaam);
    public Artikel findByArtikelPrijs (double artikelPrijs);
    public Artikel insertArtikel (String artikelNaam, double artikelPrijs);
    public boolean deleteArtikel(int artikelID);
    public int deleteAll();
    public boolean update(Artikel artikel);
    
}
