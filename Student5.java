class Student5{
	private String name;
	private int grade;
	private int ban;
	private int telephone;

	public Student5(String n, int g, int b, int t){
		this.name=n;
		this.grade=g;
		this.ban=b;
		this.telephone=t;
	}

	public Student5(String n, int g){
		this.name=n;
		this.grade=g;
	}

	public Student5(int g, int b, int t){
		this.grade=g;
		this.ban=b;
		this.telephone=t;
	}

	public String study(){
		return ("공부하다.");
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return "이름 : "+name;
	}

	public void setGrade(int grade){
		this.grade=grade;
	}

	public String getGrade(){
		return ("학년 : "+Integer.toString(grade));
	}

	public static void main(String ar[]){
		Student5 s1=new Student5("장민재", 1, 4, 111);
		Student5 s2=new Student5("김현우", 2);
		Student5 s3=new Student5(3, 4, 333);

		s3.setName("Tomas");
		System.out.println(s3.getName());
		s1.setName("Jane");
		System.out.println(s1.getName());
	}
}