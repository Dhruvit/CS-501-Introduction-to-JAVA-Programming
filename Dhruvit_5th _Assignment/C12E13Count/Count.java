import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Count {

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
    
	public static void main(String [] args)
	{
    	
		boolean repeat = true;
		
		JFileChooser fileChooser = new JFileChooser();
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file only", "txt");
        fileChooser.setFileFilter(filter);
        fileChooser.setCurrentDirectory(new File("\\"));

		while(repeat)
		{
	        int result = fileChooser.showOpenDialog(null);
	        
	        BufferedReader br = null;
	        
	        if (result == JFileChooser.APPROVE_OPTION)
	        {
	            String filename = fileChooser.getSelectedFile().getName();
	            String currentLine;
	            
	            try {
	            	
	            	br = new BufferedReader(new FileReader(new File(fileChooser.getSelectedFile().getPath())));
	            	
	            	int lineNum = 0;
	        		int wordCount = 0;
	        		int charCount = 0;
	        		
	            	while((currentLine = br.readLine()) != null){
	            		
	            		lineNum++;
	            		
	            		String word[] = currentLine.split("[\r \n \t ,;:.]");
	            		for(int i=0; i < word.length; i++){
	            			if(word[i].length()>0){
	            				
	            				wordCount++;
	            				charCount += word[i].length();
	            			}
	            		}
	            		
	            	}
	            	JOptionPane.showMessageDialog(null, "Number of Lines : "
	            							+lineNum+"\nNumber of words : "
	            							+wordCount+"\nNumber of Character : "
	            							+charCount,"Informtion of "+filename
	            							,JOptionPane.INFORMATION_MESSAGE);
					
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, e.toString());
				}finally{
					try {
						if(br != null)br.close();
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, ex.toString());
					}
				}
				
	        }
	        else if (result == JFileChooser.CANCEL_OPTION)
	        {   
	            JOptionPane.showMessageDialog(null, "You selected nothing.");
	        }
	        else if (result == JFileChooser.ERROR_OPTION)
	        {
	            JOptionPane.showMessageDialog(null, "An error occurred.");  
	        }
	        
	        repeat = confirmDialog();
		}                     
    }

}


