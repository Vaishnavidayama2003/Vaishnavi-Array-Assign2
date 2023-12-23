import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of array:");
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n];
		
		int evenSum=0;
		int oddSum=0;
		
		System.out.println("Enter elements:");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0)
				evenSum=evenSum+arr[i];
			else
				oddSum=oddSum+arr[i];
		}
		
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}
