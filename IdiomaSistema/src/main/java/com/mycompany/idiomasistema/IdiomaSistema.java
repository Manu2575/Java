/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.idiomasistema;

import java.util.Date;
import java.util.Locale;

/**
 *
 * @author manue
 */
public class IdiomaSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("O idioma esta em");
        System.out.println (loc.getDisplayLanguage());
    }
}

    