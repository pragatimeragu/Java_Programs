// This is code of Upcasting 

class A
{
	void show()
	{
		System.out.println("I am Show method from Class A");
	}
}
class B extends A 
{
	void show()
	{
		System.out.println("I am Show method from Class B");
	}
}
class C extends B 
{

	void show()
	{
		System.out.println("I am Show method from Class C");
	}

	public static void main(String[] args) {
		

		B b1 = new C();		

		b1.show();
	}
}

// here b1 is reference of class B and object of class C
// reference is always created of parent class 
//in this process B b1 = new C();	- both Compiler and JVM are working
// 1 st Compiler starts from reference i,e class B if found the method then says to JVM 
// But JVM again verifies and says that b1 is object of class C and object has more importance 
//then it executes the method from Class C becoz b1 is object of class C
// here if there is no such method show in parent (B class ) then ouput is Error / Exception
// the method always present in parent class 
// and another case if method present in parent class as well as child then the method excuted whoevers class object is created
// next case if method is not present in object class (i,e in this case C) then method executed from refernce class (B) 