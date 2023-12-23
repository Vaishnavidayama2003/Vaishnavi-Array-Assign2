import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of array:");
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n];
		
		System.out.println("Enter elements:");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Minimum element in the array is:"+min);
	}
}
