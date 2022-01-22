import processing.core.PApplet;

public class Four_balls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int centralShifter;

    public static void main(String[] args) {
        PApplet.main("Four_balls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        getEllipse(1);
        getEllipse(2);
        getEllipse(3);
        getEllipse(4);

        centralShifter++;
    }

    private void getEllipse(int speed) {
        ellipse( (centralShifter*speed),(((float)speed)*HEIGHT)/5,15,15);
    }
}
