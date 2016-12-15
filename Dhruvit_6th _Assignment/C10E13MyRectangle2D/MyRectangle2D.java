public class MyRectangle2D {

	private double x;
	private double y;
	private double width;
	private double height;
	private String errMsg; 
	
	public MyRectangle2D(){
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
		this.errMsg = "";
	}

	public MyRectangle2D(double _x, double _y, double _width, double _height) throws Exception{
		this.x = _x;
		this.y = _y;
		setWidth(_width);
		setHeight(_height);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setWidth(double width) throws Exception{
		
		if( !isValid(width) ){
			Exception e = new Exception(errMsg);
			throw e;
			
		}
		this.width = width;
	}
	
	public void setHeight(double height) throws Exception{
		
		if( !isValid(height) ){
			Exception e = new Exception(errMsg);
			throw e;
		}
		this.height = height;
	}
	
	public double getArea(){
		return this.height*this.width;
	}
	
	public double getPerimeter(){
		return 2*(this.height+this.width);
	}
	
	/* returns true if the specified point (x, y) is inside this rectangle*/
	public boolean contains(double _x, double _y){
		
		if( ( _x > (this.x - this.width/2) ) && ( _x < (this.x + this.width/2) ) && ( _y > (this.y - this.height/2) ) && (_y < (this.y + this.height/2) )){
			return true;
		}else 
			return false;
		
	}
	
	/* returns true if the specified rectangle is inside this rectangle*/
	public boolean contains(MyRectangle2D r){
		
		double x1 = r.x - r.width/2;
		double y1 = r.y - r.height/2;
		double x2 = r.x + r.width/2;
		double y2 = r.y - r.height/2;
		double x3 = r.x + r.width/2;
		double y3 = r.y + r.height/2;
		double x4 = r.x - r.width/2;
		double y4 = r.y + r.height/2;
		
		if( this.contains(x1, y1) && this.contains(x2, y2) && this.contains(x3, y3) && this.contains(x4, y4)){
			return true;
		}else 
			return false;
	}
	
	/* returns true if the specified rectangle overlaps with this rectangle*/
	public boolean overlaps(MyRectangle2D r){
		
		double lx = this.x - this.width/2;
		double ly = this.y + this.height/2;
		double rx = this.x + this.width/2;
		double ry = this.y - this.height/2;
		
		double _lx = r.x - r.width/2;
		double _ly = r.y + r.height/2;
		double _rx = r.x + r.width/2;
		double _ry = r.y - r.height/2;
		
		// If one rectangle is on left side of other
	    if (lx > _rx || _lx > rx)
	        return false;
	 
	    // If one rectangle is above other
	    if (ly < _ry || _ly < ry)
	        return false;
		
	    if(this.contains(r))
				return false;
		
		return true;
	}
	
	private boolean isValid(double _input){
		
		if(_input == 0){
			errMsg = "Diemensions never be zero. \nTry next time.";
			return false;
		}
		else if(_input < 0){
			errMsg = "Diemensions never be negative value. \nTry next time";
			return false;
		}
		else
			return true;
	}
}
