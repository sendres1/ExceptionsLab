package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public final void startConversation() {
        boolean isError = false;
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        String msg = "";
        do{
            isError = false;
        try {
            lastName = nameService.extractLastName(fullName);
            msg = "Your last name is: " + lastName;            
        } catch (IllegalArgumentException e) {
            msg = e.getLocalizedMessage();
            isError = true;
        }finally{
            JOptionPane.showMessageDialog(null, msg);
        }
        } while(isError);
        
        msg = ("your last name is " + lastName);
        JOptionPane.showMessageDialog(null, msg);
              
    }
}
