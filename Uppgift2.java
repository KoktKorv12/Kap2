import javax.swing.*;

public class Uppgift2 {
	public static void main(String[] args) {
		String name = "Calle Kalas";
		String adress = "Ballefjongberga";
		String number = "070-1337";
		String all = ( name + "\n" + adress + "\n" + number);
		
		JOptionPane.showMessageDialog(null, all);
	}
}