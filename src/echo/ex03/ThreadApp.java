package echo.ex03;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		
		Thread thread = new DigitThread();
		thread.start();//일을 시켜놓고 본인 일을 한다
		
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}

}
