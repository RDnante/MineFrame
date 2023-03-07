/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author nante
 */
public class Utils {

    public Utils() {
    }
    
    public String[] Split_url(String url) {
        String[] u = url.split("/");
        int taille = u.length - 4;
        String[] valiny = new String[taille];

        if (u.length > 4) {
            int indice = 0;
            for (int i = 4; i < u.length; i++) {
                valiny[indice] = u[i];
                indice++;
            }
        }

        return valiny;
    }
}
