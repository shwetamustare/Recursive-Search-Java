
//itarative
import java.io.*;
import java.util.*;


public class recu {
	
	public int binary_search(int element, int array[], int size,int high,int low,int mid)
	{
		//int size;
		//int low = 0, high = size-1, mid;
	  
	  //while (low < high)
	  
	    mid = (low + high)/2;
	    if(element == array[mid])
	    {
	      mid=mid+1;
	      System.out.println("Element is found at position "+ mid);
	      return 0;
	    }
	    else if(element < array[mid])
	    { 
		 high = mid;
		 return binary_search(element, array,size,high,low,mid);
	     }
	    else if(element > array[mid])
	    {  
	    	low = mid + 1;
		return binary_search(element, array, size,high,low,mid);
	     }
	    else
	    {
	    	System.out.println("\n the number is not present in array");
	    	return 0;
	    }
	  
	}
	
	int [] sort(int array[],int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
				
			}
		}
		return array;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,search,array[];
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Number of elements :");
		n=in.nextInt();
		array=new int[n];
		System.out.println("Enter "+n+" integer");
		
		for(int i=0;i<n;i++)
		{
			array[i]=in.nextInt();
		}
		
		recu s=new recu();
		s.sort(array, n);
		System.out.println("Sorted Array is : ");
		for (int i=0;i<n;i++)
			System.out.println(array[i]);
		System.out.println("Enter value to be serach");
		search=in.nextInt();
		int low = 0, high = n-1, mid=0;
		
		s.binary_search(search, array, n,high,low,mid);
		

		
	}

}


/*output
 Enter Number of elements :
10
Enter 10 integer
5
63
48
95
25
18
47
66
13
20
Sorted Array is : 
5
13
18
20
25
47
48
63
66
95
Enter value to be serach
18
Element is found at position 3
*/
