/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.Local;

/**
 *
 * @author Benco
 */
@Local
public interface GestionProduitLocal {

    void create(String n, String p, String e, String a, String cp, String mdp);
}
