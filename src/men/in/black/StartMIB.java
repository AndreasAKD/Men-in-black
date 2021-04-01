//// Detta projekt är skapad av grupp 2
//// Andreas Dahlgren
//Joel Bengtsson
//Hajar Hasanpour
package men.in.black;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class StartMIB {

    private static InfDB idb;

    public static void main(String[] args) {

        try {
            String aktuellMap = System.getProperty("user.dir");
            String sokVag = aktuellMap + ("\\db\\MIBDB.FDB");
            System.out.println(sokVag); //internt test
            idb = new InfDB(sokVag);
        } catch (InfException ettUndantag) {

            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }

        new HuvudFonster(idb).setVisible(true);
    }
}
