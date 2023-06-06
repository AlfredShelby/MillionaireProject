package ObjectOrientedProgram;

public class Puppy {
	
	public Puppy(String name) {
		
		System.out.println("Passed name is: "+ name);
	}
	public Puppy() {
		System.out.println("This is the default constructor");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy myPuppy = new Puppy("tommy");
		
		Puppy p1 = new Puppy();
		System.out.print(p1);
		
	
	}

}
