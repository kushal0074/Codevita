import java.util.*;
class A
{
	public static void main(String ar[])
	{
		int arr[] ={10,5,110,22,33,444,110,1,12,3};
		int n = arr.length;
		leadersInArray(arr,n);
	}
	public static void leadersInArray(int arr[],int n)
	{
		System.out.print(arr[n-1]);
		int curr_leader = arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(curr_leader<arr[i]){
				System.out.print(" "+arr[i]);
				curr_leader = arr[i];
			}
		}
	}
}