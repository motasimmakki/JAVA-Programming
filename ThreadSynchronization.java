import java.lang.Thread;
class Pattern{
	synchronized public void printPyramid(Object o){
		char token;
		if(o.getClass().getName()=="MyThread1")
			token='*';
		else
			token='%';
		for(int i=0;i<11;i++){
			for(int j=0;j<21;j++){
				if((i+j>=10&&j<=10)||((j-i<=10)&&j>10)){
					S.o.p(token);
				}
				else{
					S.o.p(" ");
				}
			}
			S.o.pln();
		}
	}
}
class MyThread1 extends Thread{
	Pattern p;
	MyThread1(Pattern p){
		this.p=p;
	}
	public void run(){
		p.printPyramid(this);
	}
}
class MyThread2 extends Thread{
	Pattern p;
	MyThread2(Pattern p){
		this.p=p;
	}
	public void run(){
		p.printPyramid(this);
	}
}
class ThreadSynchronization{
	public static void main(String[] args) {
		Pattern obj=new Pattern();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		S.o.pln();	
		t2.start();	
	}
}