
public class TestClass{
	
	static Bird b = new Bird();
	
	public static void main(String[] args){
		//Printing default values of static variables
		System.out.println("Bird : Static Variables ");
		System.out.println("Id :" + b.id1);
		System.out.println("Average Height : "+b.averageHeight1+" feet");
		System.out.println("Average Speed : "+b.averageSpeed1+" mph");
		System.out.println("Has wings : "+b.hasWings1);
		System.out.println("Name : "+b.name1);
		
		//Printing default values of instance variables
		System.out.println("\nBird : Instance Variables ");
		System.out.println("Id :" + b.id2);
		System.out.println("Average Height : "+b.averageHeight2+" feet");
		System.out.println("Average Speed : "+b.averageSpeed2+" mph");
		System.out.println("Has wings : "+b.hasWings2);
		System.out.println("Name : "+b.name2);
		
		//Printing Object Reference of Bird
		
		System.out.println("\nTestClass : Object reference");
		System.out.println("Bird : "+b);
	}
}