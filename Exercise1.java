class Exercise1{
	public static void main(String args[]){
		Student s=new Student();
		s.name="������";
		s.ban=1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;
		System.out.println("�̸� : "+s.name);
		System.out.println("���� : "+s.getTotal());
		System.out.println("��� : "+s.getAverage());
	}
}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public int getTotal(){
		return(this.kor+this.eng+this.math);
	}

	public float getAverage(){
		return((this.kor+this.eng+this.math)/3);
	}
}