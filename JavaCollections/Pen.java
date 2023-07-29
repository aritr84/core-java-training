class  Pen //User-defined composite data type.
{
	//Constructor overloading.
	//It is a type of polymorphism
	//Poly means many
	//morph means forms
	//Capability to exist/act in Multiple forms
	//Many constructors with same name
	Pen() { //Explicit default constructor. No parameters
		penLength=12;
		diameter=3;//this is not required here.
		brand="Likhith";
		capped=false;
		System.out.println("Pen()");
	}

	Pen(int penLength) {
		this.penLength=penLength;
		System.out.println("Pen(int)");
	}
	Pen(int penLength, float diameter) //same # of parameters, different order
	{
		this.penLength=penLength;
		this.diameter=diameter;
		System.out.println("Pen(int, float)");	
	}
	Pen(float diameter, int penLength) //same # of parameters, different order
	{
		this.penLength=penLength;
		this.diameter=diameter;
		System.out.println("Pen(float, int)");	
	}
	Pen(String brand, boolean  avlstatus) //Same # of parameters, different type
	{
		this.brand=brand;
		System.out.println((avlstatus)?"Available":"Not Available");
		
		
	}

	void write()
{
System.out.println("Writing is another way of expression..");
}
void sketch()
{
System.out.println("Sketching is also another way of expression..");
}
void draw() {
System.out.println("Drawing is another way of expression..");
}
void strikeOut (){
System.out.println("Cancel Cancel..");
}


float  penLength=10;
float  diameter=3;//this is not required here.
String brand="R2";
boolean capped=true;
public boolean equals(Pen p10) {
		return (p10.brand == brand) && (p10.capped==capped) && (p10.diameter==diameter) && (p10.penLength==penLength);
	}
}