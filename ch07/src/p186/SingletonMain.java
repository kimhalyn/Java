package p186;

public class SingletonMain {

	public static void main(String[] args) {
		
		//singleton s = new Singleton(); //�����߻�
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}
}
