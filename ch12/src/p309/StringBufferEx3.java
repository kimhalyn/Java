package p309;

public class StringBufferEx3 {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		String str = "";
		for (int i=0; i<100000; i++) {
			str += i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println( "���� �ð� : " + ( end - start)/1000);
	}
}
