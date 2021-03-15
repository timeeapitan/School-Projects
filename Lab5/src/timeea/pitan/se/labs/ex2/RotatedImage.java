package timeea.pitan.se.labs.ex2;

public class RotatedImage implements Image {
    public String fileName;

    public RotatedImage(String fileName){
        this.fileName=fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading "+fileName);
    }

    @Override
    public void display(){
        System.out.println("Displaying "+fileName);
    }
}
