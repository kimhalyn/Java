package sub2;
/*
 * ��¥ : 2020/11/09
 * �̸� : ���ϸ�
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� ���� p140
 * 
 */
public class ClassTest {
	public static void main(String[] args) {
		
		//�������� ��ü(Instance) ���� �� �ʱ�ȭ
		Account kb = new Account("��������", "123-11-5345", "������", 10000);

		//�������� ��ü ����ʱ�ȭ
		
		/* kb.bank = "��������"; ���� new Account�� �����Ƿ� ���̻� �ʿ����
		kb.id = "123-11-5345";
		kb.name = "������";
		kb.money = 10000; */
		
		//�������� ��ü Ȱ���ϱ�
		
		kb.deposit(15000);
		// kb.money++; ĸ��ȭ �������� ����ڵ� ����
		kb.withdraw(5000);
		kb.show();
		
		
		
		
		//�츮���� ��ü(Instance) ���� �� �ʱ�ȭ
		Account wr = new Account("�츮����", "1564-78-4454", "������", 5000);
		
		//�츮���� ��ü ����ʱ�ȭ
		
		/*wr.bank = "�츮����";
		wr.id = "1564-78-4454";
		wr.name = "������";
		wr.money = 5000; */
		
		//�츮���� ��ü Ȱ���ϱ�
		
		wr.deposit(10000);
		wr.withdraw(7000);
		// wr.money--; ĸ��ȭ �������� ����ڵ� ����
		wr.show();  
		
	}
}
