public class Rectangle {

	private double width;
	private double height;
	private String errorMsg; 

	//Default Constructor
	public Rectangle(){
		
		 this.width = 1;
		 this.height = 1;
		 this.errorMsg = "";
	
	}
	
	//Parameterised Constructor
	public Rectangle(double _width,double _height) throws Exception{
		
		setWidth(_width);
		setHeight(_height);
	}
	
	//return rectangle's area
	public double getArea(){
		return this.height*this.width;
	}
	
	//return rectangle's perimeter
	public double getPerimeter(){
		return 2*(this.height+this.width);
	}
	
	//return height
	public double getHeight(){
		return this.height;
	}
	
	//return width
	public double getWidth(){
		return this.width;
	}
	
	public void setHeight(double _height) throws Exception{
		
		if( !isValidInput(_height) ){
				Exception e = new Exception(errorMsg);
				throw e;
		}
		this.height = _height;
		
	}

	public void setWidth(double _width) throws Exception{
		
		if( !isValidInput(_width) ){
			Exception e = new Exception(errorMsg);
			throw e;
			
		}
		this.width = _width;
		
	}
		
	public boolean isValidInput(double _input) {
		
		if(_input == 0){
			errorMsg = "Input not be zero";
			return false;
		}
		else if(_input < 0){
			errorMsg = "Please enter positive value";
			return false;
		}
		else
			return true;
		
	}
	
}
