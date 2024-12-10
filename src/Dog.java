/**
 * 
 */

/**
 * 
 */
public class Dog {
	
	public static final String RASA = "Canin";
	
	public static int counter = 0; // Variabila de clasa
	
	private byte age = (byte)0; // Variabila de obiect
	private String name = new String();
	public String color = "Brown";
	
	/**
	 * @param age
	 * @param name
	 */
	public Dog(byte age, String name, String color) {
		this.age = age;
		this.name = name; // + "d"
		this.color = color;
		counter++;
	}

	/**
	 * @param name
	 */
	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == "Nero") {
			System.out.println("Nu-mi place acest nume. Voi pune eu un alt nume.");
			String newName = "Azorel";
			this.name = newName;
		}
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	/**
	 * This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dogWhite = new Dog((byte)5, "Max", "White");
		Dog dogNoColor = new Dog("MyFriend");
		System.out.println("My dog's name is " + dogWhite.name + " and he is " + dogWhite.age + " years old.");
		System.out.println(dogWhite.color);
		System.out.println(dogNoColor.color);
	}

}
