public class Star
{
	public static void main(String args[])
	{
		int num=9;
int n= num/2;
		for(int i=0; i<num; i++)
		{
			for (int j=0; j<num-i; j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
for(int k=0; k<2*i-1; k++)
{
System.out.print(" ");
}
if(i!=0){
System.out.println("*");
}
System.out.println(" ");
}
}
}
