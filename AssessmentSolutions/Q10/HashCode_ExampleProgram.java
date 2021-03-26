
public class HashCode_ExampleProgram {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		Bird b2 = new Bird();
		System.out.println("Equals Method : "+b1.equals(b2));
		System.out.println("Hash Code for first object : "+b1.hashCode());
		System.out.println("Hash Code for se: "+b2.hashCode());
		
	}
}
