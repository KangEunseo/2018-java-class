import java.util.*;

class Array_Test3 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);

// 1번 문제. 키보드에서 숫자 2개를 입력받아 어떤수가 큰지 출력
		System.out.println("1번 문제 ♥");

		int a[]=new int[2];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("정수를 입력하세요. : ");
			a[i]=sc.nextInt();
		}

		if (a[0]>a[1]) {
			System.out.println("방 a[0]안에 있는 수 "+a[0]+"이(가) 방 a[1]안에 있는 수 "+a[1]+"보다 더 큽니다.");
		}
		else if (a[0]<a[1]) {
            System.out.println("방 a[0]안에 있는 수 "+a[0]+"이(가) 방 a[1]안에 있는 수 "+a[1]+"보다 더 작습니다.");
		}
		else {
			System.out.println("방 a[0]안에 있는 수 "+a[0]+", 방 a[1]안에 있는 수"+a[1]+" ==> 같습니다.");
		}
		System.out.println();

// 2번 문제. 키보드에서 정수를 10개 입력받아 배열에 저장하고 이 정수중에서 3의 배수만 골라 화면에 출력
		System.out.println("2번 문제 ♥");

       int b[]=new int[10];

	   for (int i=0; i<b.length; i++) {
		   System.out.print("정수를 입력하세요. : ");
		   b[i]=sc.nextInt();
	   }
	   System.out.println();

	   for (int i=0; i<b.length; i++) {
		   if (b[i]%3==0) {
			   System.out.println(b[i]);
		   }
	   }
	}
}