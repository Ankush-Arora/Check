import java.util.Scanner;
import java.util.*;
class Abc
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the first array ");
 			int n=sc.nextInt();
		System.out.println("Enter the size of the second array ");
		     int m=sc.nextInt();
		System.out.println("Enter the elements of the first array ");
		 
		  int arr1 []=new int [n];
	  int arr2 []=new int [m];
		 for(int x=0;x<n;x++)
		 arr1[x]=sc.nextInt();
  ArrayList<Integer> a=new ArrayList<>();
		System.out.println("Enter the elements of the second array ");
		 	 for(int y=0;y<m;y++)
		  arr2[y]=sc.nextInt();
		 int i=0,j=0,count=0;
	 Arrays.sort(arr1);
	Arrays.sort(arr2);
		 while(i!=n 	&& j!= m)
		 {
			if(arr1[i]==arr2[j])
			{
			count++;
		i++;j++;
			}
		    else  if(arr1[i]<arr2[j])
			{
				i++;
				}
			else
			j++;
		
	 }
	 int p=n+m-count;
	 System.out.println(" Union count  of the arrays = "+p);
}
}