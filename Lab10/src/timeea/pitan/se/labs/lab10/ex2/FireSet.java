package timeea.pitan.se.labs.lab10.ex2;

public class FireSet extends Thread{
    Point p;

    public FireSet(Point p){
        this.p=p;
    }

    public void run(){
        int i=0;
        while(++i<15){
            int x=(int)Math.round(10*Math.random()+10);
            int y=(int)Math.round(10*Math.random()+10);

            synchronized (p){
                p.setXY(x,y);
            }

            try{
                sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("I wrote: ["+x+","+y+"]");
        }
    }
}
