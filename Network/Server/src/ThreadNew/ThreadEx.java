package ThreadNew;

public class ThreadEx extends Thread{
	String msg;
	public ThreadEx(String msg) {
		this.msg=msg;
	}
	
	@Override
	public void run() {
		super.run();
		
		for(int i=0;i<10;i++) {
			System.out.println(msg);
			
			Thread thread1 = new ThreadEx("퐁");
			Thread thread2 = new ThreadEx("딩");
			Thread thread3 = new ThreadEx("!!!");
			
			thread1.start();
			thread2.start();
			thread3.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
