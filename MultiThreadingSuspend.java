import java.lang.Thread;
class MultiThreadingSuspend extends Thread{
	public void run(){
		for (int i=1;i<=10;i++) {
			System.out.println("This is a run() method. {"+this.getName()+"}");
			if(i==5){
				try{
					System.out.println("Thread Suspended...{"+this.getName()+"}");
	            	//this.suspend();
				}
				catch(Exception e){ }
			}
		}
	}
	public static void main(String[] args) {
		MultiThreadingSuspend obj1=new MultiThreadingSuspend();
		MultiThreadingSuspend obj2=new MultiThreadingSuspend();
		obj1.setName("My Thread -1");
		obj1.start();
		obj2.setName("My Thread -2");
		obj2.start();
		// obj2.suspend();
		for (int i=1;i<=10;i++) {
			System.out.println("This is a main() method.");
		}
	}
}