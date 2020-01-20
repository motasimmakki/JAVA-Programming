import java.lang.Thread;
class MultiThreadingSleep extends Thread{
	public void run(){
		for (int i=1;i<10;i++) {
			System.out.println("This is a run() method. {"+this.getName()+"}");
			if(i==5){
				try{
					System.out.println("Thread Sleeps...{"+this.getName()+"}");
	            	this.sleep(1000);
         		}
         		catch(Exception e){ }
			}
		}
	}
	public static void main(String[] args) {
		MultiThreadingSleep obj1=new MultiThreadingSleep();
		MultiThreadingSleep obj2=new MultiThreadingSleep();
		obj1.setName("My Thread -1");
		obj1.start();
		obj2.setName("My Thread -2");
		obj2.start();
		for (int i=1;i<10;i++) {
			System.out.println("This is a main() method.");
			if(i==5){
				try{
					System.out.println("Thread Sleeps...{ Main Thread }");
	            	Thread.sleep(1000);
         		}
         		catch(Exception e){ }
			}
		}
	}
}