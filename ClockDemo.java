public class ClockDemo{
  
	public static void main(String args[]){
        ClockTest Clock =  new  ClockTest();
        Clock.setTime(1,100);

        while(true){
            Clock.minIncrement();
            System.out.println("Tick...");
            System.out.println("Current time: "+Clock.getTime());

            wait(100);
        }
    }
    private static void wait(int millisecond){
        try{
            Thread.sleep(millisecond);
        }
        catch(Exception e){}
    }

}



