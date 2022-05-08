package day08_0_parameterized_constructor_overloading;

public class O5Address 
{
	String hno;
	String streetName;
	String locality;
	String city;
	String state;
	String country;
	int pincode;
	
public O5Address(String hno,String streetName,String locality,String city,String state,String country,int pincode)
{
	this.hno=hno;
	this.streetName=streetName;
	this.locality=locality;
	this.city=city;
	this.state=state;
	this.country=country;
	this.pincode=pincode;
}

public void dispAddress()
{
	System.out.println("\n**********Address**********\n");
	System.out.println(hno+"\t"+streetName);
	System.out.println(locality+"\t"+city);
	System.out.println(state+"\t"+country+"\t"+pincode);
}
	public static void main(String[] args) 
	{
		
	}

}
