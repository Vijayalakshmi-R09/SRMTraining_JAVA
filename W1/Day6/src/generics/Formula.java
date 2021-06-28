package generics;

public interface Formula <T extends Number> 
{
	float areaOfSqr(T s);
	float areaOfCircle(T r);
}
