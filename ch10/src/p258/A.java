package p258;

class A {
	A(){
		System.out.println("A ��ü ����");
	}
	static class B{
		B(){
			System.out.println("C ��ü ����");
		}
		
		int var1;
		static int var2;
		
		void method1() {
			System.out.println("static ���� Ŭ������ method1()");
		}
		
		static void method2() {
			System.out.println("static ���� Ŭ������ static method2()");
		}
	}
	
	public class C {
		C() {
			System.out.println("B ��ü ����");
		}
		int var1;
		
		void method1() {
			System.out.println("�ν��Ͻ� ���� Ŭ������ method1()");
		}
	}
	
	void method() {
		class D{
			D(){
				System.out.println("D ��ü ����");
			}
			
			int var1;
			
			void method1() {
				System.out.println("���� ���� Ŭ������ method1()");
			}
		}
		D d = new D();
		d.var1 = 3;
		d.method1();
	}
}
