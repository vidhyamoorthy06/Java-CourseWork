import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q4_Sequence {
	
	public  int[] append ( int[] a, int[] b)
	// appends the second sequence at the end of the first sequence
	{
		int newSize = a.length+b.length;
		int[] res = new int[newSize];
		int k=0;
				for(int i=0;i<newSize;i++)
				{
					if(i<a.length)
						res[i]=a[i];
					else
					{
						k = i-a.length;
						res[i] = b[k];
					}		
				}
		return res;
	}

	public int[] merge(int[] a,int[] b)
	// merge two sequence with alternate elements from both the sequences
	{
		int newSize = a.length+b.length;
		int[] res = new int[newSize];
		
		int i = 0, j = 0, k = 0;
		 
	    // Traverse both array
	    while (i<a.length && j <b.length)
	    {
	        res[k++] = a[i++];
	        res[k++] = b[j++];
	    }
	 
	    // Store remaining elements of first array
	    while (i < a.length)
	        res[k++] = a[i++];
	 
	    // Store remaining elements of second array
	    while (j < b.length)
	        res[k++] = b[j++];
		
		return res;
	}
	
	public int[] mergeSorted(int a[], int b[])
	{
		int newSize = a.length+b.length;
		int[] res = new int[newSize];
		// sorting the arrays 'a' and 'b' before merging
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
				res[k++]=a[i++];
			else
				res[k++]=b[j++];
		}
		
		// storing the remaining elements in 'a' array
		while(i<a.length)
			res[k++]=a[i++];
		
		//storing the remaining elements in 'b' array
		
		while(j<b.length)
			res[k++]=b[j++];
		
		return res;
	}
	
	public void print(int[] a)
	{
		for(int e:a)
		{
			System.out.print(e+" , ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Q4_Sequence s = new Q4_Sequence();
		System.out.println("Enter the number of elements in Sequence A::");
		int asize = sc.nextInt();
		System.out.println("Enter the elements of Sequence A ::");
		int[] a = new int[asize];
		for(int i=0;i<asize;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the number of elements in Sequence B::");
		int bsize = sc.nextInt();
		int[] b = new int[bsize];
		System.out.println("Enter the elements of Sequence B ::");
		for(int i=0;i<bsize;i++)
		{
			b[i] = sc.nextInt();
		}
		
		//printing the given input sequences
		
		System.out.println("Sequence A:");
		s.print(a);
		System.out.println("Sequence B:");
		s.print(b);
		System.out.println("Append A and B");
		s.print(s.append(a,b));
		System.out.println("Merge A and B");
		s.print(s.merge(a, b));
		System.out.println("Merge and sort A and B");
		s.print(s.mergeSorted(a, b));

}
}

