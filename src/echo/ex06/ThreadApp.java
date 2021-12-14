package echo.ex06;

public class ThreadApp {

	public static void main(String[] args) {
		
		Runnable digit = new DigitImpl();
		Runnable lower = new LowerImpl();
		Runnable upper = new UpperImpl();
		
		
		Thread thread1 = new Thread(digit);
		Thread thread2 = new Thread(lower);
		Thread thread3 = new Thread(upper);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
