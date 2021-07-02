package generics;

public class StaticRestrict<Ty> {
	   Ty ob;

	   StaticRestrict () 
	   {
	    ob = new Ty(); //Not possible to create instance of type parameter
	  }
}
class staticGeneric{
	  static S ob;
	  static S getob() 
	  {
	    return ob; //Static method cannot use T
	  }
	  static void showob() 
	  {
	    System.out.println(ob);
	  }
}

