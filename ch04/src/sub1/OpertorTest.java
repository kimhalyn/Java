package sub1;

/*
 * ��¥ : 2020/11/03
 * �̸� : ���ϸ�
 * ���� : ������ �ǽ��ϱ� ���� p52
 */
public class OpertorTest {
	
	public static void main(String[] args) {
		//��� ������
		int num1 = 1; //���ٷ� ���� �� int num1 = 1, num2 = 2, num3 = 3, num4 = 4;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
				
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num2 * num3;
		int rs4 = num4 / num2;
		int rs5 = num4 % num3; //������
		
		System.out.println("rs1 :"+rs1 );
		System.out.println("rs2 :"+rs2 );
		System.out.println("rs3 :"+rs3 );
		System.out.println("rs4 :"+rs4 );
		System.out.println("rs5 :"+rs5 );
		
		//����, ���� ������
		int n1 = 1, n2 = 2;
		
		n1++; 
		++n1; 
		
		n2--;
		--n2;
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		
		//���մ��� ������
		int no1 =1; //���� �� �ܾ�� �����ϸ� �ι�° �ܾ �빮�ڷ� ����� ex. noOne
		int no2 =2;
		int no3 =3;
		int no4 =4;
		
		no1 +=1; //no1 =no1 +1
		no2 -=2;//no2 =no2 -2
		no3 *=3;//no3 =no3 *3
		no4 /=4;//no4 =no4 /4
		
		System.out.println("no1 :"+no1);
		System.out.println("no2 :"+no2);
		System.out.println("no3 :"+no3);
		System.out.println("no4 :"+no4);
		
		//�� ������
		int var1 = 1;
		int var2 = 2;
		
		boolean res1= (var1>var2); 
		boolean res2= (var1<var2);
		boolean res3= (var1>=var2);
		boolean res4= (var1<=var2);
		boolean res5= (var1==var2); //������ �������� ��. ���� ����.
		boolean res6= (var1!=var2); //���� �ٸ���
		
		System.out.println("res1 :"+res1);
		System.out.println("res2 :"+res2);
		System.out.println("res3 :"+res3);
		System.out.println("res4 :"+res4);
		System.out.println("res5 :"+res5);
		System.out.println("res6 :"+res6);
		
		//�� ������
		
		boolean result1 = (var1 > 1) && (var2 < 3); //var1�� 1���� ũ�� �׸��� var2�� 3���� �۴�.
		boolean result2 = (var1 > 0) && (var2 < 3);
		boolean result3 = (var1 > 1) || (var2 < 3);
		boolean result4 = (var1 > 1) || (var2 < 2); //or�� �ϳ��� true�� �־�� ��ü true�� �ȴ�.
		boolean result5 = !(var1 > var2); //��ü�� �����Ѵ�. false�� !�����ϱ⶧���� true�� �ȴ�.
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		System.out.println("result4 : "+result4);
		System.out.println("result5 : "+result5);
		
		
		
	}

}
