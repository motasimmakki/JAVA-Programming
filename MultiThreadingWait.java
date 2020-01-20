import java.lang.Thread;
class MultiThreadingWait extends Thread{
	public void run(){
		for (int i=1;i<=10;i++) {
			System.out.println("This is a run() method. {"+this.getName()+"}");
			if(i==5){
				try{
					System.out.println("Thread Waiting...{"+this.getName()+"}");
	            	this.wait(1000);
				}
				catch(Exception e){ }
			}
		}
	}
	public static void main(String[] args) {
		MultiThreadingWait obj1=new MultiThreadingWait();
		MultiThreadingWait obj2=new MultiThreadingWait();
		obj1.setName("My Thread -1");
		obj1.start();
		obj2.setName("My Thread -2");
		obj2.start();
		for (int i=1;i<=10;i++) {
			System.out.println("This is a main() method.");
		}
	}
}