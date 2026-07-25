class xyz
{

	void show()
	{
	System.out.println("Hello this is xyz");
	
	}
}
class abc extends xyz{
	

	void show()
	{
	super.show();
	System.out.println("Hello this is abc");
	}
}
class object
{
	public static void main(String[] args) {
		
		abc a = new abc();
		a.show();
	}
}