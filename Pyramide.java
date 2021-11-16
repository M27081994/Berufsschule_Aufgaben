
public class Pyramide 
{   
    public Pyramide(){
    }
    
    public static void drawPyramid(int height)
    {
       
        
        
    int j=0;
    //int height = 20;
    for (j=0;j<height;j++)
    {
        int k=0;
        for (k=height;k>=j+1;k--)
        {
                System.out.print(" ");
        }
        for(int m=0;m<j*2+1;m++)
        {
            System.out.print("#");
        }
    System.out.println();
    
    }
    }
 
}
    








    /*
    public static void main(String[] args) 
    {
        System.out.println("    #");
        System.out.println("   ###");
        System.out.println("  #####");
        System.out.println(" #######");
        System.out.println("#########");
    */
    
    //}
    
    
    
    /*for(m=0;m<=5;m++)
        {
            k=m+2
            System.out.print("#");
        }
        System.out.println();*/

