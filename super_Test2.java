class Parent{
	int x=10;
}

class Child extends Parent{
	int x=20;
	public void method(){
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}

class super_Test2{
	public static void main(String ar[]){
		Child c=new Child();
		c.method();
	}
}
//20-20-10