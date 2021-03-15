package timeea.pitan.se.labs.lab10.ex1;

public class Counter extends Thread {

    public Counter(String name){
        super(name);
    }

    public void run(){
        for(int i=0; i<20; i++){
            System.out.println(getName()+" i="+i);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(getName()+" job finalised.");
    }
}
