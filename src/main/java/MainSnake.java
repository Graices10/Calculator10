import javax.swing.*;

public class MainSnake extends JFrame {
    public MainSnake(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400, 400);
        add(new GameSnake());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainSnake ms = new MainSnake();
    }
}
