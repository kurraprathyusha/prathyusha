class Animal
{
	static void makeSoun()
	{
		System.out.println("animal...");

	}


}
class Dog extends Animal
{

	static void makeSoun()
	{

		System.out.println("Dog...");

	}

}
class Ployex2
{
	public static void main(String args[])
	{
		Animal d =new Dog();
		d.makeSoun();
		
	}

}