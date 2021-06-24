package com.srm.java.training.inheritance;
class Publication
{
  private String title;
  private float price;
   Publication(String title,float price)
   {
   this.title=title;
   this.price=price;
   }
  void putData()
   {
   System.out.println("\nTitle:"+title);
   System.out.println("Price:"+price);
   }
}
class Book extends Publication
{
     private int pages;
     Book(String title,float price,int pages)
      {
     super(title,price);
     this.pages=pages;
      }
    void putData()
     {
     super.putData();
     System.out.println("No of Pages:"+pages);
     }
}
class CD extends Publication
{
	private double playingTime;
	CD(String title, float price, double playingTime) {
		super(title, price);
		this.playingTime=playingTime;
	}
	void putData()
	{
		super.putData();
		System.out.println("The Playing time of CD : "+playingTime);
	}	
}
public class PublicationEx {

	public static void main(String[] args) {
		{
		    Publication p=new Book("Five Little Pigs",224.0f,1700);
		    Publication p1=new CD("Pokemon",250.0f,300.25);
		       p.putData();
		       p1.putData();
		   }
	}

}
