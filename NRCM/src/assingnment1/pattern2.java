package assingnment1;

public class pattern2 {

	public static void main(String[] args) {
		int n=5,i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
