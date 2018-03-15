package tapasya.java.basic;

public class Deadlock {

	private Object lock1 = new Object();
	private Object lock2 = new Object();
	

	public void execute(){
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(1);
				synchronized (lock1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(2);
					synchronized (lock2) {
						System.err.println(3);
					}
					System.out.println(4);
				}
				System.out.println(5);
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(11);
				synchronized (lock2) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(12);
					synchronized (lock1) {
						System.err.println(13);
					}
					System.out.println(14);
				}
				System.out.println(15);
			}
		});
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		new Deadlock().execute();
	}
	
}
