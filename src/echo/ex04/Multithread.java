package echo.ex04;

public class Multithread {

	public static void main(String[] args) {
		
		Thread thread1 = new DigitThread();
		Thread thread2 = new LowerThread();
		Thread thread3 = new UpperThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		/*
		thread1.run();//도중에 다른 게 끼어들지 않는다. 완료된 뒤 다른 스레드 실행
		thread2.run();
		thread3.run();
		 */
	}

}
