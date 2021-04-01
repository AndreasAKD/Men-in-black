
package men.in.black;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Validering {

    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;
        if (rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan �r tom!");
            resultat = false;
            rutaAttKolla.requestFocus();
        }
        return resultat;
    }
    
    public static boolean losenordFaltHarVarde(JPasswordField rutaAttKolla) {
        boolean resultat = true;
        if (rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "l�senordsf�ltet �r tomt!");
            resultat = false;
            rutaAttKolla.requestFocus();
        }
        return resultat;
    }
    
    public static boolean isHeltal(JTextField rutaAttKolla) {

        boolean resultat = true;
        try {
            String inStrang = rutaAttKolla.getText();
            Integer.parseInt(inStrang);
            rutaAttKolla.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");
            resultat = false;
        }
        return resultat;
    }
    
    static public boolean langdTelefonnummer(JTextField rutaAttKolla){
         boolean resultat = true;
        if (rutaAttKolla.getText().toString().length() > 30){
            JOptionPane.showMessageDialog(null, "Telefonnumret �r f�r l�ngt, max 30 tecken");
             resultat = false;
            rutaAttKolla.requestFocus();
        }
        return resultat;
    }
    
    static public boolean langdNamn(JTextField rutaAttKolla){
         boolean resultat = true;
        if (rutaAttKolla.getText().toString().length() > 20){
            JOptionPane.showMessageDialog(null, "Namnet �r f�r l�ngt, max 20 tecken");
             resultat = false;
            rutaAttKolla.requestFocus();
        }
        return resultat;
    }

    
    static public boolean langdBenamning(JTextField rutaAttKolla){
         boolean resultat = true;
        if (rutaAttKolla.getText().toString().length() > 20){
            JOptionPane.showMessageDialog(null, "ben�mningen �r f�r l�ng, max 20 tecken");
             resultat = false;
            rutaAttKolla.requestFocus();
        }
        return resultat;
    }
    
static public boolean langdLosenord(JPasswordField rutaAttKolla){
         boolean resultat = true;
        if (rutaAttKolla.getText().toString().length() > 6){
            JOptionPane.showMessageDialog(null, "L�senordet �r f�r l�ngt, max 6 tecken");
             resultat = false;
            rutaAttKolla.requestFocus();
        }
        return resultat;
    }

    
    
}

 



