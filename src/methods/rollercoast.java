package methods;

import javax.swing.JOptionPane;

public class rollercoast {
	
	public static void main(String[] args) {
		String oop = JOptionPane.showInputDialog("How tall you are? In inches, please.");
		int oops = Integer.parseInt(oop);
		if(oops <= 48 && oops >0) {
			JOptionPane.showMessageDialog(null, "You too small. Fly off ride. Go get big. Then come back.");
		}else if(oops >48 && oops > 0) {
			JOptionPane.showMessageDialog(null, "You large enough. Have fun vomiting.");
		}else {
			JOptionPane.showMessageDialog(null, "You should not exist. Please leave.");
		}
	}
	
}
