import javax.swing.JOptionPane;

public class TestRectangle {

	public static void main(String[] args) {
		
		run();
	}
	
	public static void run(){
		
		Rectangle rectangle1;
		//Show area and perimeter for First rectangle 
		
		try {
			rectangle1 = new Rectangle(4,40);
			JOptionPane.showMessageDialog(null, "For Rectangle-1, Width = " + rectangle1.getWidth() +
					" and Height = "+rectangle1.getHeight()+" have Area = "+ rectangle1.getArea() + 
					" and Perimeter = "+ rectangle1.getPerimeter(), "First Rectangle", JOptionPane.PLAIN_MESSAGE); 
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.WARNING_MESSAGE);
		}
		
		Rectangle rectangle2;
		//Show area and perimeter for Second rectangle
		
		try {
			rectangle2 = new Rectangle(3.5,35.9);
			JOptionPane.showMessageDialog(null, "For Rectangle-2, Width = " + rectangle2.getWidth() +
					" and Height = "+rectangle2.getHeight()+" have Area = "+ rectangle2.getArea() + 
					" and Perimeter = "+ rectangle2.getPerimeter(), "Second Rectangle", JOptionPane.PLAIN_MESSAGE);
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.WARNING_MESSAGE);
		}
		
		Rectangle rectangle3 = new Rectangle();
		
		//Further code is for user interaction 
		JOptionPane.showMessageDialog(null, "Now it's turn for user to enter dimension of Rectangle","Enjoy this progarm...",JOptionPane.INFORMATION_MESSAGE);
		
		boolean repeat = true, repeat1 = true, repeat2 = true;
		
		while(repeat){
		
			while(repeat1)
			{
				String heightString = JOptionPane.showInputDialog(null, "Enter Height:", "Enter dimension of Rectangle",
						JOptionPane.QUESTION_MESSAGE);

					try {
					
						if((heightString != null) && (heightString.length() > 0)){
							double _height = Double.parseDouble(heightString);
							rectangle3.setHeight(_height);
							repeat1 = false;
						}
					
					} catch (Exception e) {
						if(e.getClass().getName().compareTo("java.lang.NumberFormatException") == 0){
							JOptionPane.showMessageDialog(null, "Height must be numeric value : "+e.getMessage());
						}else
							JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.WARNING_MESSAGE);
					
					}
			}
		
			while(repeat2)
			{
				String widthString = JOptionPane.showInputDialog(null, "Enter width:", "Enter dimension of Rectabgle" ,
						JOptionPane.QUESTION_MESSAGE);

					try {
						
						if((widthString != null) && (widthString.length() > 0)){
							double _width = Double.parseDouble(widthString);
							rectangle3.setWidth(_width);
							repeat2 = false;
						}
					
					} catch (Exception e) {
						if(e.getClass().getName().compareTo("java.lang.NumberFormatException") == 0){
							JOptionPane.showMessageDialog(null, "Height must be numeric value : "+e.getMessage());
						}else					
							JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.WARNING_MESSAGE);
					}
				
			}
			
			JOptionPane.showMessageDialog(null, "Area : "+ rectangle3.getArea()+"        Perimeter : "+rectangle3.getPerimeter(),"Area and Perimeter of Rectangle", JOptionPane.INFORMATION_MESSAGE);
			
			int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(response == JOptionPane.NO_OPTION)
			{
				JOptionPane.showMessageDialog(null, "Thank You....");
				repeat = false;
			}else if(response == JOptionPane.YES_OPTION){
				repeat1 = true;
				repeat2 = true;
			}
		}
		
	}
	
}
	
