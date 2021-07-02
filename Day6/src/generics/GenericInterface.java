package generics;

class AreaCalc<T extends Number> implements Formula<T>{

	@Override
	public float areaOfSqr(T s) {
		
		return s.floatValue()*s.floatValue();
	}

	@Override
	public float areaOfCircle(T r) {
		
		return (float) (3.142*r.floatValue()*r.floatValue());
	}
    
    
}

public class GenericInterface {

	public static void main(String[] args) {
		AreaCalc<Float> a=new AreaCalc<Float>();
		System.out.println("Area of Square: -> "+a.areaOfSqr(5f));
		System.out.println("Area of Circle: -> "+a.areaOfCircle(5f));
	}

}
