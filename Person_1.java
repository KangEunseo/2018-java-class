class Person_1 {
	String name;
	int age;

	public void go() {
		System.out.println("����");
	}

	public void eat() {
		System.out.println("�Դ�");
	}

	public static void main(String ar[]){
		Person_1 p=new Person_1(); //��ü����(��ü�̸�:p)
		p.name="Tom";
		p.age=27; //�����������:��ü�̸�.�������
		System.out.println("�̸��� "+p.name+", ���̴� "+p.age);
		p.eat(); //�޼��� ȣ��==��ü�̸�.�޼���()
		p.go();

		Person_1 p2=new Person_1();
		p2.name="Allen";
		p2.age=37;
		System.out.println("�̸��� "+p2.name+", ���̴� "+p2.age);
		p2.eat();
		p2.go();
	}
}