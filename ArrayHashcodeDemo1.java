class ArrayHashcodeDemo1 
{
	public static void main(String[] args) 
	{
		int[][][] a = new int[3][2][3];
		System.out.println(a);//[[[I@15db9742
		System.out.println(a[0]);//[[I@6d06d69c
		System.out.println(a[0][0]);//[I@7852e922
		System.out.println(a[0][0][0]);//0
	}
}
