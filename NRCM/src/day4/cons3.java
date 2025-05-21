package day4;

public class cons3 {
int x,y,z;
public cons3(){
	System.out.println("welcome to my profile:Harshini");
}
public cons3(int x){
	this.x=x;
	System.out.println(x);
}
public cons3(int x,int y){
	this.x=x;
	this.x=y;
	System.out.println(x+","+y);
}
public cons3(int x,int y,int z){
	this.x=x;
	this.y=y;
	this.z=z;
	System.out.println(x+","+y+","+z);
}

	public static void main(String[] args) {
		cons3 c1=new cons3();
		cons3 c2=new cons3(10);
		cons3 c3=new cons3(10,900);
		cons3 c4=new cons3(10,900,8);

	}

}
