
package schaltjahr;
import java.util.Scanner;


public class Schaltjahr 
{
    private static boolean isSchalt() {
        System.out.println("Geben Sie eine Jahreszahl ein: ");
        Scanner eingabe = new Scanner(System.in);
        int eingabeInt = (int)eingabe.nextInt();
        
        boolean istschalt=false;    // ist das Jahr nicht durch 4 teilbar kann es gar kein Schaltjahr sein. Der Default ist also: Das Jahr ist kein Schaltjahr. Es gibt viel mehr Nichtschaltjahre, wie Schaltjahre.
        
        if(eingabeInt%4==0){  // ist das Jahr ohne Rest durch 4 teilbar, so so ist es womöglich ein Schaltjahr*
            istschalt = true; // Hier kann man also mit diesem Algorithmus nicht abkürzen und statt der Variable istschalt gleich den boolean returnen
            if(eingabeInt%100==0 && eingabeInt%400!=0){     // *außer das Jahr ist durch 100, aber nicht durch 400 teilbar
                istschalt = false;
            }
            if(eingabeInt%400==0){                    // ist es durch 400 teilbar ist es auch durch 4 teilbar. Ist es durch 400 teilbar ist es ein Schaltjahr.
                istschalt=true;
            }
        }
        return istschalt;
    }

    public static void main(String[] args) 
    {
        System.out.println(isSchalt()); // printed den boolean, den die Funktion isSchalt() als return-Wert hat
        
    }

    
    
}
