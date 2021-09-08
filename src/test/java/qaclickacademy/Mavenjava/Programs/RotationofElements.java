package qaclickacademy.Mavenjava.Programs;

public class RotationofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//left rotation of array elements
		
		// 1 2 3 4 5 
		//2 3 4 5 1
		
		int arr[]={1,2,3,4,5};
		
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
		    arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		for(int i=0;i<arr.length;i++)
		{
		    System.out.println(arr[i]);
		}
		
		
		//===============Right Rotation of array elements===================
		
		
		//1 2 3 4 5
		//5 1 2 3 4
		
int arr2[]={1,2,3,4,5};
		
		int temp2=arr2[arr2.length-1];
		for(int i=arr2.length-1;i>0;i--)
		{
		    arr2[i]=arr2[i-1];
		}
		arr2[0]=temp2;
		for(int i=0;i<arr2.length;i++)
		{
		    System.out.println(arr2[i]);
		}

	}

}
