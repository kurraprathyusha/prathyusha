class Main
{
	public static void main(String []args)
	{
	
	Car c=new Car("prathyu","foe",144,"petrol",500000);
	c.m1();
	}
}
class Machine
{
	String manufacture;
	Machine(String manufacture)
	{
		this.manufacture=manufacture;
	}
}
class Vehicle extends Machine
{
	String modelname;
	int capacity;
	Vehicle(String manufacture,String modelname,int capacity)
	{
		super(manufacture);
		this.modelname=modelname;
		this.capacity=capacity;
	}
	void m1()
	{
		System.out.println(manufacture + " " +modelname + " " + capacity );
	}

}
class Car extends Vehicle
{
	String fueltype;
	int price;
	Car(String manufacture,String modelname,int capacity,String fueltype,int price)
	{
		super(manufacture,modelname,capacity);
		this.fueltype=fueltype;
		this.price=price;
	}
	void m1()
	{
		System.out.println(manufacture + " " +modelname + " " + capacity + " " + fueltype+ " " + price);
	}
}