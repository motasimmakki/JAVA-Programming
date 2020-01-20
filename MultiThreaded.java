import java.lang.Thread;
class MultiThreaded extends Thread{
	public void run(){
		for (int i=0;i<10;i++) {
			System.out.println("This is a run() method. {"+this.getName()+"}");
		}
	}
	public static void main(String[] args) {
		MultiThreaded obj1=new MultiThreaded();
		MultiThreaded obj2=new MultiThreaded();
		obj1.setName("My Thread -1");
		obj1.start();
		obj2.setName("My Thread -2");
		obj2.start();
		for (int i=0;i<10;i++) {
			S.o.p("This is a main() method.\n");
		}
	}
}