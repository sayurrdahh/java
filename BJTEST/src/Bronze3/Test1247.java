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
�� BigInteger�� ������ BigInteger�� ���մϴ�. �� �޼���� 6���� boolean ���� �� ������ (<,==, >, >=,! =, <=)�� ���� ���ϴ� ������ �޼��� ��ſ� �����˴ϴ�. �̷��� �񱳸� �ǽ��Ϸ��� (x.compareTo(y) <op> 0) ��� �ϴ� ���� ��õ�մϴ�. �� ��� <op>���� 6���� ������ ��� 1���� ���ϴ�.
����:�������̽� Comparable <BigInteger > ���� compareTo
�Ķ����: val - �� BigInteger�� ���ϴ� BigInteger
��ȯ��: �� BigInteger ���� val ���� ���� ���� -1, ������ ���� 0, ū ���� 1
			 * */
			else if(S.compareTo(a)==-1)
				System.out.println("-");
			else
				System.out.println("+");
		}
	}
}
