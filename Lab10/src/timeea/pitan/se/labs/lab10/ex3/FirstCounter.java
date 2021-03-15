package timeea.pitan.se.labs.lab10.ex3;

public class FirstCounter extends Thread {

    String name;

    FirstCounter(String name){
        this.name=name;
    }
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println(i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("The first counter has finalised its job.");
    }
}
