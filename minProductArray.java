import java.util.*;
class A
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int solid[] = new int[n];
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
			solid[i] = sc.nextInt();
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int product = minProduct(solid,arr,n,k);	
		System.out.println(product);
	}
	public static int minProduct(int solid[],int arr[],int n,int k)
	{
		int original_sum= 0;
		for(int i=0;i<n;i++)
		{
			original_sum = original_sum + solid[i] * arr[i];
		}
		int new_sum = original_sum;
		for(int i=0;i<n;i++)
		{
			int original_pro = solid[i] * arr[i];
			int new_product = Math.min((arr[i] + 2*k)*solid[i],(arr[i] - 2*k)*solid[i]);
			int new_sum1 = original_sum +new_product - original_pro;
			
			new_sum = Math.min(new_sum1,new_sum);
		}
		return original_sum;
	}
}