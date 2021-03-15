package timeea.pitan.se.labs.ex2;

public class ProxyImage implements Image {

    private RealImage realImage;
    private RotatedImage rotatedImage;
    private String fileName;
    private String mode;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public ProxyImage(String fileName, String mode) {
        this.fileName = fileName;
        this.mode = mode;
    }

    @Override
    public void display() {
        if (mode == "real") {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        } else if (mode == "rotated") {
            if (rotatedImage == null) {
                rotatedImage = new RotatedImage(fileName);
            }
            rotatedImage.display();
        }
    }
}
