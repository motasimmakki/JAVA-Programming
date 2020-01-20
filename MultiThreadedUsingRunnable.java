import java.lang.Runnable;
import java.lang.Thread;
class MultiThreadedUsingRunnable implements Runnable{
	public void run(){
		for (int i=0;i<10;i++) {
			System.out.println("This is a run() method. {"+Thread.currentThread().getName()+"}");
		}
	}
	public static void main(String[] args) {
		Thread obj1=new Thread( new MultiThreadedUsingRunnable());
		Thread obj2=new Thread( new MultiThreadedUsingRunnable());
		obj1.setName("My Thread -1");
		obj1.start();
		obj2.setName("My Thread -2");
		obj2.start();
		for (int i=0;i<10;i++) {
			System.out.println("This is a main() method.");
		}
	}
}