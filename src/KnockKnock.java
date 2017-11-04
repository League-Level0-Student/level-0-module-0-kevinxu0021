import javax.swing.JOptionPane;

public class KnockKnock {
public static void main(String[] args) {
	String name = "Matt";
	String answer = JOptionPane.showInputDialog("Knock Knock");
	System.out.println(answer);
	if (answer.equals("who's there")) {
		
	 
		
	String answer2 = JOptionPane.showInputDialog("Impatient cow");
	System.out.println(answer2);
	JOptionPane.showMessageDialog(null, "Moo!");
	}else {
	}
	}
}

