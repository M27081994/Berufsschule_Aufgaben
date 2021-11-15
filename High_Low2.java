
package high_low2;
import javax.swing.JOptionPane;

public class High_Low2 {
    
    public static String differ(int zahl, int eingabeInt)
    {
        if(zahl-eingabeInt > 0)
            {
                return "Zu klein";
            }
            else if(zahl-eingabeInt < 0)
            {
                return "Zu groß";
            }
            else
            {
                return "Richtig";
            }
    }

    
    public static void main(String[] args) 
    {
        String eingabe;
        int counter = 3;
        int zahl = (int)((Math.random()*1000)+1);
        System.out.println(zahl);
        int eingabeInt = 0;
        
        while((counter > 0) && (zahl != eingabeInt))
        {
            counter--;
            eingabe = JOptionPane.showInputDialog("Rate mal: ");
            eingabeInt = Integer.parseInt(eingabe);
            
            String string;
            string = High_Low2.differ(zahl, eingabeInt);
            JOptionPane.showMessageDialog(null, "Deine Eingabe: " + string + "\nCounter: " + counter);
            //JOptionPane.showMessageDialog(null,"Counter: " + counter);
            
            
        }
        if (counter==0 && zahl != eingabeInt)
        {
            JOptionPane.showMessageDialog(null, "Zu viele Versuche");
        }
    }
    
}


/*
            if(zahl-eingabeInt > 0)
            {
                string = "Zu klein";
            }
            else if(zahl-eingabeInt < 0)
            {
                string = "Zu groß";
            }
            else
            {
                string = "Richtig";
            }
            */