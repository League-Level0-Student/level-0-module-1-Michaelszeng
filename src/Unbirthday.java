import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String date = JOptionPane.showInputDialog("What is your birthday? (m/d)");
	if (date.equals("3/22")) {
		System.out.println("Happy birthday");
	}
	else{
		System.out.println("Very happy unbirthday!");	
		}
	}
}

