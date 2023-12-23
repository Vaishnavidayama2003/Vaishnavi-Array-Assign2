import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of array:");
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n];
		
		int evenCount=0;
		int oddCount=0;
		
		System.out.println("Enter elements:");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		
		System.out.println(evenCount);
		System.out.println(oddCount);
	}
}
