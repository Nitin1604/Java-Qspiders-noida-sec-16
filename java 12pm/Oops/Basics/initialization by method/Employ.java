class Employ
{
	String name;
	int id;	
	double salary;
	public void setValue(String n, int i, double s){
		name=n;
		id=i;
		salary=s;
	}
	public void getDetails(){
		System.out.println("Name is: "+name);
		System.out.println("ID is: "+id);
		System.out.println("Salary is: "+salary);
		System.out.println("===================");
	}
}

