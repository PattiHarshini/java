package day3;

public class array1 {

	public static void main(String[] args) {
		 int a[]= {23,65,878,90,7};
		 int min=a[0],max=a[0];
		 for(int i=1;i<a.length;i++) {
			 if(min>a[i])
			 {
				 min=a[i];
			 }
			 if(max<a[i])
			 {
				 max=a[i];
			 }
		 }
		 System.out.println(min);
		 System.out.println(max);
	}

}
