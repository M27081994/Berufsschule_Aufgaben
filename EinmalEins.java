/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package einmaleins;

/**
 *
 * @author michael.hartmann
 */
public class EinmalEins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<=10;i++)
        {
            for(int j=1; j<=10;j++)
            {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
    
}
