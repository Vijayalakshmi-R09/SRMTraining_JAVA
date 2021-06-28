package generics;

public class StaticRestrict {
	  T ob;
	  T vals[];

	  StaticRestrict(T o, T[] nums) {
	    ob = o;
	    vals = nums;
	  }

	  public static void main(String args[]) {
	    Integer n[] = { 1 };
	    StaticRestrict<Integer> obj = new StaticRestrict<Integer>(50, n);
	    // Can't create an array of type-specific generic references.
	    // GenericNumber<Integer> gens[] = new GenericNumber<Integer>[10]; 
	    StaticRestrict<?> gens[] = new StaticRestrict<?>[10]; // OK
	  }
}
