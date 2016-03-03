import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		while(true){
			int min = 1, max = 100;	// 최소값, 최댓값
		
			// 랜덤한 수 뽑기 1-100
			Random r = new Random();
			int k = r.nextInt(100) + 1;
		
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			System.out.println(min + "-" + max);
		
			int cnt = 0;	// 입력한 횟수를 계산해줄 변수
			while(true){	//	수를 맞출 때까지 루프를 돌림
				cnt++;
				System.out.print(cnt + ">>");
				Scanner n = new Scanner(System.in);
				int num = n.nextInt();	// 수를 입력 받는다.
			
				if(k == num)	// 수를 맞췄을 때
				{
					System.out.println("맞았습니다.");
					break;
				}else if(k > num)	// 정답보다 입력한 숫자가 더 높을 경우
				{
					System.out.println("더 높게");
					min = num;
				}else	// 정답보다 입력한 숫자가 더 낮을경우
				{
					System.out.println("더 낮게");
					max = num;
				}
				System.out.println(min + "-" + max);	// 정답 숫자의 범위 알려줌
			}
			System.out.print("다시하시겠습니까(y/n)>>");
			Scanner ans = new Scanner(System.in);	// 종료 및 재시작
			String answer = ans.next();
			if( answer.equals("n") ){
				break;
			}
		}
	}
}
