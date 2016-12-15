import javax.swing.JOptionPane;

public class TestMyPoint {

	public static void main(String[] args) {
		run();
	}

	public static void run(){
		
		boolean repeat = true, repeat1 = true, repeat2 = true;
		try{
			
			MyPoint myPoint = new MyPoint(10, 30.5);
			MyPoint _myPoint = new MyPoint();
			
			JOptionPane.showMessageDialog(null, "The distance between the two points (0,0) and (10, 30.5) is : "+myPoint.distance(),
					null,JOptionPane.INFORMATION_MESSAGE);
			
			JOptionPane.showMessageDialog(null, "Now, it's turn for user to enter x and y coordinates...",
					null,JOptionPane.INFORMATION_MESSAGE);
			

			while(repeat){
			
				while(repeat1 )
				{
					String xString = JOptionPane.showInputDialog(null, "Enter x-coordinates : ", null, JOptionPane.QUESTION_MESSAGE);
						try {
						
							if((xString != null) && (xString.length() > 0)){
								
								_myPoint.setX(xString);
								repeat1 = false;
							}
						
						} catch (Exception e) {
								JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.WARNING_MESSAGE);
						
						}
				}
			
				while(repeat2 )
				{
					String yString = JOptionPane.showInputDialog(null, "Enter y-coordinates : ", null, JOptionPane.QUESTION_MESSAGE);
					try {
					
						if((yString != null) && (yString.length() > 0)){
							
							_myPoint.setY(yString);
							repeat2 = false;
						}
					
					} catch (Exception e) {
							JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.WARNING_MESSAGE);
					
					}
					
				}
				
				JOptionPane.showMessageDialog(null, "The distance between the two points (0,0) and ("
							+ _myPoint.getX()+","+_myPoint.getY()+") is : "
							+_myPoint.distance(_myPoint.getX(), _myPoint.getY())
							,"Enjoy this progarm...",JOptionPane.INFORMATION_MESSAGE);
				
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
				
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
