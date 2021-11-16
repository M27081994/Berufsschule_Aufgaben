package schere_stein_papier_gegenpc;


import java.util.Scanner;
//mport java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael.hartmann
 */
public class Game {
    Game(){
        
    }
    
    public static String vergleiche(int spieler1, int spieler2)
    {
        if(spieler1==spieler2)
        {
            return "Unentschieden";
        }
        
        switch(spieler1)
        {
            case 1: //S1: Schere
            {
                switch(spieler2)
                {
                    case 2: //S2: Stein
                        return "Spieler 2 gewinnt";
                    case 3: // S2: Papier
                        return "Spieler 1 gewinnt";
                }
            }
            case 2: //S1: Stein
            {
                switch(spieler2)
                {
                    case 1: //S2: Schere
                        return "Spieler 1 gewinnt";
                    case 3: // S2: Papier
                        return "Spieler 2 gewinnt";
                }
            }
            case 3: //S1: Papier
            {
                switch(spieler2)
                {
                    case 1: //S2: Schere
                        return "Spieler 2 gewinnt";
                    case 2: // S2: Stein
                        return "Spieler 1 gewinnt";
                }
            }
        }
        return null;
    }
    
    /*
    int i = 0;
    public static int eingabe1()
    {
        Scanner eingabe = new Scanner(System.in);
        
        System.out.println("Spieler 1: ");
        int spieler1 = eingabe.nextInt();
        return spieler1;
    }
    */
    
    
    
    
    
    public static int eingabe1()
    {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Spieler 1: ");
        int spieler1 = eingabe.nextInt();
        return spieler1;
    }
    
    public static int random_token()
    {
        System.out.println("Spieler 2: ");
        int spieler2 = 1+((int) (Math.random()*3));
        switch(spieler2){
            case 1:
                System.out.println("Schere");
                break;
            case 2:
                System.out.println("Stein");
                break;
            case 3:
                System.out.println("Papier");
                break;
        }
        return spieler2;
        
    }
}