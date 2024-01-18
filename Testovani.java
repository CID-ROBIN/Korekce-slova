/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.testovani;

import java.util.Scanner;

/**
 *
 * @author Cid Corso
 */
public class Testovani {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        
        // vstup od uživatele
        System.out.println("Zadej písmena pro převedení.");
        String Slovo = scanner.nextLine().trim().toLowerCase();
        
        
        
        
        // uložení prvního znaku slova do pomocné proměnné
        String SlovoVelkym = Slovo.toUpperCase();
        var PrvniPismenoSlova = SlovoVelkym.charAt(0);
        
        
        // uložení zbytku slova do pomocné proměnné
        String ZbytekSlova = Slovo.substring(1, Slovo.length());
        
        // složení celýho slova s velkým písmenem na začátku
        String KonecnaPodobaSlova = PrvniPismenoSlova + ZbytekSlova;
        System.out.println(KonecnaPodobaSlova);
        
        
        
        
    }
}
