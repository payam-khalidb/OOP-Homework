
package evenorodd;

import javax.swing.JOptionPane;

public class Evenorodd {

    public static void main(String[] args) {
       
        for (int i = 0; i < 1012345; i++) {
            
        
       
       String nn= JOptionPane.showInputDialog(null,"Input any number to check even or odd:");
        int n=Integer.parseInt(nn);
        
     
         if (n % 2 == 0)
        
            JOptionPane.showMessageDialog(null,"Your number " + n + " is even");
            else

            JOptionPane.showMessageDialog(null,"Your number " + n + " is odd");
         JOptionPane.showMessageDialog(null,"Entered number is odd" );  
   
    String message = "Try another Number?";
    int answer = JOptionPane.showConfirmDialog(null, message);
    if (answer== JOptionPane.YES_OPTION){}
    else if(answer==JOptionPane.NO_OPTION){ break;}
    else if (answer==JOptionPane.CANCEL_OPTION){System.exit(0);}
         
         
         }
    }
    
}
