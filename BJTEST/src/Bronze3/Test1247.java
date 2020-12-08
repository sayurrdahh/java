package Bronze3;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1247 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<3;i++) {
			int N = sc.nextInt();
			BigInteger S = new BigInteger("0");
			BigInteger a = new BigInteger("0");
			for(int j=0;j<N;j++) {
                BigInteger b = sc.nextBigInteger();
                S = S.add(b);
            }
			if(S.compareTo(a)==0)
				System.out.println("0");
			/*compareTo(BigInteger val)
이 BigInteger가 지정된 BigInteger와 비교합니다. 이 메서드는 6개의 boolean 형의 비교 연산자 (<,==, >, >=,! =, <=)의 각각 대하는 개개의 메서드 대신에 제공됩니다. 이러한 비교를 실시하려면 (x.compareTo(y) <op> 0) 라고 하는 편성을 추천합니다. 이 경우 <op>에는 6개의 연산자 가운데 1개가 들어갑니다.
정의:인터페이스 Comparable <BigInteger > 내의 compareTo
파라미터: val - 이 BigInteger와 비교하는 BigInteger
반환값: 이 BigInteger 값이 val 보다 작은 경우는 -1, 동일한 경우는 0, 큰 경우는 1
			 * */
			else if(S.compareTo(a)==-1)
				System.out.println("-");
			else
				System.out.println("+");
		}
	}
}
