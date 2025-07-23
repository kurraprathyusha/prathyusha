class Animal
{

	void MakeSound()
	{
		System.out.println("Animal....");

	}


}
class dog extends Animal
{
	void MakeSound()
	{
		System.out.println("dog...");

	}

}
class cat extends Animal
{
	void MakeSound()
	{

		System.out.println("Cat...");
	}


}
class Polyex1
{

	public static void main(String args[])
	{
		Animal d =new dog();
		Animal c = new cat();
		d.MakeSound();
		c.MakeSound();


	}

}