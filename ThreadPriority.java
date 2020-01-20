import java.lang.Runnable;
import java.lang.Thread;
class ThreadPriority implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Inside run().{"+Thread.currentThread().getName()+"}"+
				" Thread Priority : "+Thread.currentThread().getPriority());
		}
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadPriority());
		Thread t2=new Thread(new ThreadPriority());
		t1.setName("My Thread -1");
		t2.setName("My Thread -2");
		t1.setPriority(2); 
        t2.setPriority(5); 
		t1.start();
		t2.start();
	}
}