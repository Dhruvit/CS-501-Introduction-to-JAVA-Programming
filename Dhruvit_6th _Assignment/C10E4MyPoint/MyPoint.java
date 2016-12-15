
public class MyPoint {

	private double x;
	private double y;
	private String errMsg;
	
	public MyPoint() throws Exception{
		this.setX(String.valueOf(0.0));
		this.setY(String.valueOf(0.0));
	}
	
	public MyPoint(double x, double y)throws Exception{
		this.setX(String.valueOf(x));
		this.setY(String.valueOf(y));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public void setX(String x) throws Exception{
		
		if(isValidNumber(x)){
			this.x = Double.parseDouble(x);	
		}else{
			Exception e = new Exception(errMsg);
			throw e;
		}
		
	}

	public void setY(String y) throws Exception{
		
		if(isValidNumber(y)){
			this.y = Double.parseDouble(y);
		}else{
			Exception e = new Exception(errMsg);
			throw e;
		}
		
	}
	
	public double distance(){
		return Math.pow((Math.pow((this.x),2) + Math.pow((this.y),2)),0.5);
		
	}
	
	public double distance(double x, double y){
		return Math.pow((Math.pow((x),2) + Math.pow((y),2)),0.5);
		
	}
	
	public boolean isValidNumber(String number){
		
		try{
			Double.parseDouble(number);
			return true;
		}catch(Exception e){
			if(e.getClass().getName().compareTo("java.lang.NumberFormatException") == 0){
				this.errMsg = "Enter number is not a number.  Please enter numeric number.";	
			}
			return false;
			
		}
		
		
	}

}
