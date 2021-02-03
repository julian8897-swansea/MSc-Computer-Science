import javax.swing.JOptionPane;

public class UIName {
    public static void main(String[] args) {
        String name =
            JOptionPane.showInputDialog("What is your name?");
			
		JOptionPane.showMessageDialog(null, "Your Name Here: " + name,
			"I'm saying Hello...", 1);
    }
}