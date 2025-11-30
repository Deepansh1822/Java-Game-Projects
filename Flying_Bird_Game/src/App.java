import javax.swing.JFrame;

public class App {
    public App()
    {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flying Bird");
        // frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Flying_Bird flyingBird = new Flying_Bird();
        frame.add(flyingBird);
        frame.pack();
        flyingBird.requestFocus();
        frame.setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
