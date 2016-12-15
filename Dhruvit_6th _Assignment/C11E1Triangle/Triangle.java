public class Triangle extends GeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    
    public Triangle() {
    }

    public Triangle(double _side1, double _side2, double _side3) throws IllegalTriangleException, Exception{
        
    	this.isValid(_side1);
    	this.isValid(_side2);
    	this.isValid(_side3);
    	
    	if( !( ((_side1+_side2) > _side3)  && ((_side1+_side3) > _side2) && ((_side2+_side3) > _side1) ) )  {
    		throw new IllegalTriangleException("Sum of two side is not greater than third side !");
    		
    	}
    	else{ 
    		this.setSide1(_side1);
            this.setSide2(_side2);
            this.setSide3(_side3);
    	}	
    }

    public double getSide1() {
    	return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double _side1) throws Exception {
        if(isValid(_side1)){
        	this.side1 = _side1;
        }
    }

    public void setSide2(double _side2) throws Exception{
    	if(isValid(_side2)){
        	this.side2 = _side2;
        }
    }

    public void setSide3(double _side3) throws Exception{
    	if(isValid(_side3)){
        	this.side3 = _side3;
        }
    }

    public double getArea() {
    	double s = getPerimeter() / 2;
        return Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
    return " Triangle: Side-1 = " + side1 + ", Side-2 = " + side2
           + ", Side-3 = " + side3;
    }
    
    private boolean isValid(double _input) throws Exception{
		if(_input == 0){
			throw new Exception("Diemensions never be zero. \nTry next time.");
		}
		else if(_input < 0){
			throw new Exception("Diemensions never be negative value. \nTry next time");	
		}
			return true;
	}
}