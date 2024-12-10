
public class Demo {
	
	/**
	 * This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In acest moment exista " + Dog.counter + " numar de catelusi.");
		Dog dog1 = new Dog((byte)5, "Max", "White");
		Dog dog2 = new Dog("Iulius Cesar");
		Dog dog3 = dog1;
		System.out.println("In acest moment exista " + Dog.counter + " numar de catelusi.");
		System.out.println("My first dog's name is " + dog1.getName() + " and he is " + dog1.getAge() + " years old.");
		System.out.println("My second dog's name is " + dog2.getName() + " and he is " + dog2.getAge() + " years old.");
		System.out.println("My third dog's name is " + dog3.getName() + " and he is " + dog3.getAge() + " years old.");
		System.out.println(Dog.RASA);
	}
}
