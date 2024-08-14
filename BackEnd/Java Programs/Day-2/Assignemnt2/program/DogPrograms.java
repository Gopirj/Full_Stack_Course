package program;

public class DogPrograms {
	String Name;
	String Breed;
	
	DogPrograms(String Name,String Breed){
		this.Name=Name;
		this.Breed=Breed;
	}
	void display() {
		System.out.println("Dog Name: "+Name);
		System.out.println("Dog Breed: "+Breed);
	}
	public  void setVariable(String Name, String Breed) {
		this.Name=Name;
		this.Breed=Breed;
	}
	
	public static void main(String args[]) {
		DogPrograms obj=new DogPrograms("jimmy","labertom");
		obj.display();
		obj.setVariable("tom","street dog");
		obj.display();
	}
}
