package hack.crackingcodinginterview;

public class ArrayLeftRotaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7};
		int rotate = 2;
		//right rotate
		for (int i = 0;i<rotate;i++)
		{
			for(int j = arr.length-1;j>0;j--)
			{
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1]= temp;
			}
		}
		for(int element:arr)
		{
			System.out.print(+element);
		}
		//left rotate
		/*for(int i=0;i<rotate;i++)
		{
		for(int j = 0;j<arr.length-1;j++)
		{
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1]=temp;
			
		}
	}*/
		
		/*for(int element :arr)
		{
			System.out.print(+element);
		}*/

}
}
