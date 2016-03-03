public class Game369_2 {
	public static void main(String[] args) {
		for(int i=1 ; i<100 ; i++)
		{
			int cnt = 0;
			
			if(((i%10)%3 == 0) && (i%10 != 0))	// 1의 자리수 계산, 0을 제외한 3의배수 체크(3,6,9)
				cnt++;
			if(((i-(i%10))%3 == 0) && (i>=10))	// 10의 자리수 계산
				cnt++;
			
			if(cnt != 0)	// 3,6,9가 있는 수만 출력
			{
				System.out.print(i + " ");
				for(int j=0 ; j<cnt ; j++)
					System.out.print("짝 ");
				System.out.println("");
			}
		}
	}
}
