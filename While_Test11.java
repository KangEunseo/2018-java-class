//1���� ���� ���س����� ���� 100�� �Ѱ��ϴ� ���� ���

class While_Test11 {
	public static void main(String ar[]) {
		int i=1, sum=0;
		while (true) {
			sum+=i;
			i++;
			if (sum>=100) {
				break;
			}
		}
		System.out.println(i);
	}
}