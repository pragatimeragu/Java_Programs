class kit_stud
{
	int rollno;
	String name;
	public kit_stud()
	{
		System.out.println("Hii,i am default constructor of class kit_stud");
	}

	public kit_stud(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
	}
}

class Engineering extends kit_stud
{
	int x;
	public Engineering()
	{	
		super(76,"Pragati");
		System.out.println("Hii,i am default constructor of class Engineering..");
	}

	public Engineering(int x)
	{	
		
		super();
		this.x=x;
		System.out.println("Hii,i am parametrized constructor of class Engineering.. and value of x is : "+x);
	}

	public static void main(String[] args) {
		Engineering e = new Engineering();
		System.out.println("-----------------------------------------------------------------------------------------");
		Engineering e2 = new Engineering(10);
	}
}


// Conclusion : 
// we can call the default constructor in parametrized constructure and
// also we can call parametrized constructor in deafult constructor