package sub2;

public class SmartTv extends Tv implements Computer {

	@Override
	public void booting() {
		System.out.println("smartTv booting...");
	}

	@Override
	public void internet() {
		System.out.println("smartTv internet...");
	}

}
