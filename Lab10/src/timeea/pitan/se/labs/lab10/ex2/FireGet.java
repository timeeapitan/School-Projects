package timeea.pitan.se.labs.lab10.ex2;

public class FireGet extends Thread {
    Point p;

    public FireGet(Point p){
        this.p=p;
    }

    public void run(){
        int i=0;
        int x,y;
        while(++i<15){
            synchronized (p){
                x=p.getX();
                try{
                    sleep(50);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                y=p.getY();
            }
            System.out.println("I read: ["+x+","+y+"]");
        }
    }
}
