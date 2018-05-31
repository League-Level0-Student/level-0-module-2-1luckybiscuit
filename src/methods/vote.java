package methods;

import javax.swing.JOptionPane;

public class vote {
	public static void main(String[] args) {
		String oop = JOptionPane.showInputDialog("What is your age? That is, the amount of years you have been alive? None of that 'minutes' bamboozlement.");
		int oops = Integer.parseInt(oop);
		if(oops < 18 && oops >0) {
			JOptionPane.showMessageDialog(null, "You have not been on the face of the earth long enough to elect a citizen for a government position. Please come back when time has passed.");
		}else if(oops >=18 && oops > 0) {
			JOptionPane.showMessageDialog(null, "The number defining your existence on this planet is large enough for you to influence the position of another mature citizen. Go on ahead.");
		}else {
			JOptionPane.showMessageDialog(null, "Either you are a fetus, which cannot communicate, or you are currently defying the laws of time. Either way, this is creepy. Please meddle with a different universe.");
		}
	}
}
