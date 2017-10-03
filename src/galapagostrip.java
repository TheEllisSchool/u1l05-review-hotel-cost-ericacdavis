import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class galapagostrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int royalPalm = 275;
		int finchBay = 337;
		int casaNatura = 99;
		String stars1 = " ";
		String stars2 = " ";
		String stars3 = " ";
		
		ImageIcon icon = new ImageIcon("pool-restaurant.jpg");
		ImageIcon icon2 = new ImageIcon("Finch Bay.jpg");
		ImageIcon icon3 = new ImageIcon("CasaNatura.jpg");
		String input = JOptionPane.showInputDialog("How many days would you like to stay in the Galapogos?");
		int stay = Integer.parseInt(input);
		if(stay<=0) {
			JOptionPane.showMessageDialog(null, "You can't stay for negative nights!");
		}
		else {
			JOptionPane.showMessageDialog(null, "At Royal Palm Hotel, your vacation would cost: " + (royalPalm * stay), "Royal Palm Hotel", JOptionPane.INFORMATION_MESSAGE, icon); 
			JOptionPane.showMessageDialog(null, "At Finch Bay hotel, your vacation would cost: " + (finchBay * stay), "Finch Bay Hotel", JOptionPane.INFORMATION_MESSAGE, icon2);
			JOptionPane.showMessageDialog(null, "At Casa Natura Hotel, your vacation would cost: " + (casaNatura * stay), "Casa Natura Hotel", JOptionPane.INFORMATION_MESSAGE, icon3);
		}

		for (int i = 0; i<royalPalm/50; i++) {
			stars1 = stars1+ "*";
		}
		for (int i = 0; i < finchBay/50; i++){
			stars2 = stars2 + "*";
		}
		for (int i =0; i < casaNatura/50; i++){
			stars3= stars3 + "*";
		}
		JOptionPane.showMessageDialog(null, "Costs of the Hotels:"+ "\n" + "Royal Palm Hotel: " + stars1 + "\n" + "Finch Bay Hotel: " + stars2 + "\n" + "Casa Natura Hotel: " + stars3);
	}
}
