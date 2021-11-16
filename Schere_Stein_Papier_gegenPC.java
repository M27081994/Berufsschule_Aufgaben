/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Für dieses Programm wird auch noch das File Game.java mit der Main-Funktion gebraucht
package schere_stein_papier_gegenpc;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author michael.hartmann
 */
public class Schere_Stein_Papier_gegenPC {

    
     
    public static void main(String[] args) {
       
        while(true)
        {
                          
            System.out.println("1: Schere \t 2: Stein \t 3: Papier");
            Scanner eingabe = new Scanner(System.in);
            int eingabeInt = Integer.parseInt(eingabe.nextLine());
            
            
            String ergebnis = Game.vergleiche(eingabeInt, Game.random_token());
            System.out.println(ergebnis);
            
            
            System.out.println("Möchten Sie weiter spielen? 1: Ja ");
            Scanner weiter = new Scanner(System.in);
            int weiterInt = weiter.nextInt();
            if(weiterInt!=1)
            {
                break;
            }
        }
        
    }
    
}





/*
JFrame frame = new JFrame("MyFirstGUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 900);
            frame.setVisible(true);
            
            JButton buttonSchere = new JButton("Schere");
            buttonSchere.setBounds(100, 100, 100, 100);
            frame.getContentPane().add(buttonSchere);
            //buttonSchere.addActionListener(new ActionListener());
            buttonSchere.addActionListener( new ActionListener()
            {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        if(e.getSource() == buttonSchere){
                            eingabe = 1;
                        }
                    }
            
                    }
            
            
            JButton buttonStein = new JButton("Stein");
            buttonStein.setBounds(200, 100, 100, 100);
            frame.getContentPane().add(buttonStein);
            buttonSchere.addActionListener( new ActionListener()
            {
                    @Override
                    public void actionPerformed(ActionEvent e)
                {
                    int eingabe = 2;
                }
            });
            
            
            
            JButton buttonPapier = new JButton("Papier");
            buttonPapier.setBounds(300, 100, 100, 100);
            frame.getContentPane().add(buttonPapier);
            buttonSchere.addActionListener( new ActionListener()
            {
                    @Override
                    public void actionPerformed(ActionEvent e)
                {
                    int eingabe = 2;
                }
            });

*/
