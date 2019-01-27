//to sort an array of 10 elements in ascending order
//to left shift by nth position
//to cicular shift by nth position
import java.io.*;
class C7
{
	public static void main(String[] args)
	{
		Console con = System.console();
		int i,sum=0,k,j;
		int arr[]= new int[10];
		int asceding[]= new int[10];
		int leftshift[]= new int[10];
		int circularleftshift[]= new int[10];
		System.out.println(arr[0]);
		for(i=0;i<=9;i++)
		{
			System.out.println("Enter the value:");
			arr[i]=Integer.parseInt(con.readLine());
			sum+=arr[i];
			asceding[i]=arr[i];
			leftshift[i]=arr[i];
			circularleftshift[i]=arr[i];
		}
		//Sum
		//System.out.println("Sum = "+sum);
		//Ascending order
		for(i=0;i<=8;i++)
		{
			for(j=0;j<=8-i;j++)
			{
				if(asceding[j]>asceding[j+1])
				{
					k=asceding[j+1];
					asceding[j+1]=asceding[j];
					asceding[j]=k;
				}
			}
		}
		System.out.println("Ascending Order:");
		for(i=0;i<=9;i++)
		{
			System.out.println(asceding[i]);
		}
		//Leftshift by nth position
		System.out.println("Leftshift by nth position:");
		int n= Integer.parseInt(con.readLine());
		for(i=1;i<=n;i++)
		{
			for(j=0;j<9;j++)
			{
				leftshift[j]=leftshift[j+1];
			}
			leftshift[9]=0;
		}

		System.out.println("Value of array 10 :" +leftshift[9]);
		System.out.println("leftshift by "+n+" position");
		for(j=0;j<=9;j++)
		{
			System.out.println(leftshift[j]);
		}
		//CircularleftShift by nth position
		System.out.println("Circularleftshift by nth position:");
		n= Integer.parseInt(con.readLine());
		for(i=1;i<=n;i++)
		{
			k=circularleftshift[0];
			for(j=0;j<9;j++)
			{
				circularleftshift[j]=circularleftshift[j+1];
			}
			circularleftshift[9]=k;
		}
		System.out.println("circularleftshift by "+n+" position");
		for(i=0;i<=9;i++)
		{
			System.out.println(circularleftshift[i]);
		}
	}
}