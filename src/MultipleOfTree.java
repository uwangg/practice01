import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		while(true){
			Scanner s = new Scanner(System.in);
			
			System.out.print("수를 입력하세요(종료는 -1) : ");
			int num = s.nextInt();

			if(num == -1)	// -1을 입력 받을시에 종료
			{
				System.out.println("프로그램 종료");
				break;
			}
			
			if(num%3 == 0)	// 3의 배수일 때
				System.out.println("3의 배수입니다.");
			else	// 3의 배수가 아닐때
				System.out.println("3의 배수가 아닙니다.");
		}
	}

}
