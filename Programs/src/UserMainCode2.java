
public class UserMainCode2 {
	/*public static int findElement(int array[], int element)
	{
		boolean found = false;
		 for ( int x = 0; x <array.length; x++)  
		    {  
		      if (array[x] == element)      
		      {  
		         found=true;
		          break;  
		      }  
		   }  
		 
		   if (found)  
		      return 1;
		   else
			   return 0;
			

	}*/
	/*public static int binElement(int array[],int element)
	{
		boolean found =false;
		int low=0,high=array.length-1;
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(array[mid]== element)
			{
				found =true;
				break;
			}
			else if (array[mid]<element)
			{
				low=mid+1;
			}
			else if(array[mid]>element)
			{
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		if (found)  
		      return 1;
		   else
			   return 0;
			
	}*/
	public static int matchSum(int arr1[],int arr2[],int ele1,int ele2)
	{
		int s=0;
		
		for(int x=0;x<ele1;x++)
		{
			for(int y=0;y<ele2;y++)
			{
					if (arr1[x]==arr2[y])  
						{
						s=s+arr2[y];
						}
			}
		}
		return s;
	}
	
	}



