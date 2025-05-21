package day3;

public class dupliarray {

	public static void main(String args[])
	{
		int a[]= {12,3,7,90,7,21,44,36,21};
		int a1[]=new int[a.length];
		int index=0,j;
		for(int i=0;i<a.length-1;i++) {
			int count=0;
			for(j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1) {
				a1[index++]=a[i];
			}
			}
		
		for(int i=0;i<index;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}


}
