public class Game369 {
	public static void main(String[] args) {
		for(int i=1 ; i<100 ; i++)
		{
			int cnt = 0;
			int num = i;
			
			while(num>0)	// 받은수를 자리수마다 3,6,9 계산
			{
				if(((num%10)%3 == 0) && ((num%10) != 0))	// 3의 배수이면서, 0이 아닌경우 = 3,6,9 체크
					cnt++;
				num=num/10;
			}
			if(cnt!=0)	// 3,6,9가 아닌 것은 제외
			{
				System.out.print(i + " ");
				for(int j=0 ; j<cnt ; j++)	//  3,6,9 박수 출력
					System.out.print("짝 ");
				System.out.println("");
			}
		}
	}
}
