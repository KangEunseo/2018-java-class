class Sum_Test2{
	int s=0;

	public void sum(int a, int b){
		for(int i=a;i<b+1;i++){
			s+=i;
		}
		System.out.println(a+"���� "+b+"������ �� : "+s);
	}

	public static void main(String ar[]){
		Sum_Test2 s2=new Sum_Test2();
		s2.sum(1,5);
	}

}