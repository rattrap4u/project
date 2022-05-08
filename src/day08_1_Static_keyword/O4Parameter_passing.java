// -----Parameter Parsing-----
// pass by value or call by value
// in java there is only one parameter parsing and that is call by value.

package day08_1_Static_keyword;

//class Operation
//{
//	int data=50;
//	void change(int data)
//	{
//		data=data+100;   // changes will be in the local variable only
//	}
//	public static void main(String[] args)
//	{
//		Operation op=new Operation();
//		System.out.println("before change "+op.data);
//		op.change(500);
//		System.out.println("after change "+op.data);
//	}
//}
 // in java call by reference is only achieved by objects.


// # --another example of call by value in java--
class Operation
{
	int data=50;
	void change(Operation op)
	{
		data=data+100;   // changes will be in the instance variable only
	}
	
	public static void main(String[] args)
	{
		Operation op=new Operation();
		System.out.println("before change "+op.data);
		op.change(op);
		System.out.println("after change "+op.data);
	}
}