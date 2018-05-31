package random;

import javax.swing.JOptionPane;
import java.util.Random;

public class lotto {
	public static void main(String[] args) {
		Random owo = new Random();
		JOptionPane.showMessageDialog(null, "Today's numbers are:");
		for(int i = 0;i<5;i++) {
		int rando = owo.nextInt(10);
		JOptionPane.showMessageDialog(null, rando);
		}
		JOptionPane.showMessageDialog(null, "Congratulations to our lucky winner, Mr. S. Geddit!\n You have earned a lifetime supply of wokeness.");
	}
}
