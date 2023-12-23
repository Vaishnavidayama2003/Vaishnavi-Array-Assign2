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
		
		System.out.println("Enter element to search:");
		int search=Integer.parseInt(br.readLine());
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==search)
				System.out.println("Index is:"+i);
		}
		
	}
}
