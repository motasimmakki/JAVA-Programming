class Static
{
   static int count=0;
   public void increment(){
       count++;
   }
   public static void main(String args[]){
       Static obj1=new Static();
       Static obj2=new Static();
       obj1.increment();
       obj2.increment();
       System.out.println("Obj1: count is="+obj1.count);
       System.out.println("Obj2: count is="+obj2.count);
   }
}