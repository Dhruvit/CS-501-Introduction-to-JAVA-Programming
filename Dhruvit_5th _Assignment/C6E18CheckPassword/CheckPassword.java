import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class CheckPassword {
	
	private static String msg = "";

	private static boolean confirmDialog()
	{
		int response = JOptionPane.showConfirmDialog(null, "Do you want to try again?", "Confirm",
		        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		boolean confirmation = true;
		
		if(response == JOptionPane.NO_OPTION)
		{	
			confirmation = false;
		}
		
		return confirmation;
		
	}
	
	private static boolean quitDialog()
	{
		int response = JOptionPane.showConfirmDialog(null, "Do you want to quit?", "Quit",
		        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		boolean confirmation = true;
		
		if(response == JOptionPane.YES_OPTION)
		{	
			confirmation = false;
		}
		
		return confirmation;
		
	}
	
	public static boolean checkPass(String password) {
		
		int count = 0;
		if(password.length() == 0){
			msg = "Please enter password";
			return false;
		}
		
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
				msg = "A password consists of only letters and digits.";
				return false;
			}
		}
		
		if (password.length() < 8) 
		{
			msg = "A password must have at least eight characters.";
			return false;
		}
		
		for (int i = 0; i < password.length(); i++) {
			if ((Character.isDigit(password.charAt(i)))) {
				count = count + 1;
			}
		}
		
		if (count >= 2) {
			msg = "Your Pssword is "+ password;
			return true;
		}else 
		{
			msg = "A password must contain at least two digits.";
			return false;
		}
			
	}

	public static void main(String[] args) {
		
		boolean repeat = true;
		
		while(repeat)
		{
			JPanel panel = new JPanel();
			JLabel label = new JLabel("<html>A password must have at least eight characters."
								+"<br>A password consists of only letters and digits."
								+"<br>A password must contain at least two digits."
								+"<br><br>Password : ");
			
			JPasswordField pass = new JPasswordField();
			panel.add(label);
			panel.add(pass);
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			panel.setAlignmentX(Component.LEFT_ALIGNMENT);
			
			
			int result = JOptionPane.showConfirmDialog(null, panel, "Check Password:", JOptionPane.OK_CANCEL_OPTION);
			
			if(result == JOptionPane.OK_OPTION) // pressing OK button
			{
				try {
					char[] password = pass.getPassword();
				    if(checkPass(String.valueOf(password))){  //Valid password
				    	JOptionPane.showMessageDialog(null, msg, "Message for user", JOptionPane.INFORMATION_MESSAGE);
				    	repeat = confirmDialog();
				    	
				    }else{
							throw new Exception(msg);
						
				    }
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Message for user", JOptionPane.WARNING_MESSAGE);
				}
				
			}else if(result == JOptionPane.CANCEL_OPTION){
				
				repeat = quitDialog();
			}	
		}
	}

}

