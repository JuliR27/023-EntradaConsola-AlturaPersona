/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author CicloM
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        double altura;
        try {
            System.out.println("Dijete su altura en metros: ");
            altura = SCN.nextDouble();

            System.out.printf(" Mi Altura es %.2f%n ", altura);

        } catch (Exception e) {
            System.out.println("Error a la entrada de datos");
        } finally {
            SCN.nextLine();
        }
    }
}
