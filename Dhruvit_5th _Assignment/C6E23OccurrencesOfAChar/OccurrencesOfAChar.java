import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OccurrencesOfAChar 
{ 
	private static boolean confirmDialog()
	{
		int response = JOptionPane.showConfirmDialog(null, "Do you want to try with the new string", "Confirm",
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
	
	public static void main(String[] args) 
	{
		boolean repeat = true, repeat1 = true;
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		while(repeat){
			JTextField str = new JTextField();
			label.setText("Enter a string:");
			panel.add(label);
			panel.add(str);
			
			int ans = JOptionPane.showConfirmDialog(null, panel, null, JOptionPane.OK_CANCEL_OPTION);
			
			try {
				
				if(ans == JOptionPane.OK_OPTION && str.getText().length() > 0){
					
					while(repeat1){
						JTextField ch = new JTextField();
						label.setText("<html>Your String is : "+str.getText()
											+"<br><br>Enter a character for find out occuarnce: <br>");
						panel.add(label);
						panel.remove(str);
						panel.add(ch);
						
						int ans1 = JOptionPane.showConfirmDialog(null, panel, null, JOptionPane.OK_CANCEL_OPTION);
						if(ans1 == JOptionPane.OK_OPTION)
						{
							try{
								if(ch.getText().length() == 1){
									int occurance = count(str.getText(),ch.getText().charAt(0));
									JOptionPane.showMessageDialog(null, "Occurance : "+occurance);	
									
								}else{
									// throw exception
									throw new Exception("Enter only one charcter");
								}
							}catch(Exception e){
								
								JOptionPane.showMessageDialog(null, e.getMessage(), "Message for user", JOptionPane.WARNING_MESSAGE);
							}
						
							
						}else if(ans1 == JOptionPane.CANCEL_OPTION){
							
							repeat1 = quitDialog();
							
						}
						panel.removeAll();
					}
					repeat = confirmDialog();
					repeat1 = repeat;
					panel.removeAll();
					
				}else if(ans == JOptionPane.CANCEL_OPTION){
					
					repeat = quitDialog();
					repeat1 = repeat;
					
				}else if(ans == JOptionPane.OK_OPTION && str.getText().length() == 0){
					throw new Exception("Please enter string");
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Message for user", JOptionPane.WARNING_MESSAGE);
			}
			
			panel.removeAll();
		}
		
	}

	public static int count(String str, char a) 
	{ 
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) 
		{ 
			if (str.charAt(i) == a) 
			{ 
				count++; 
			} 
		} 
		return count; 
	} 

}
