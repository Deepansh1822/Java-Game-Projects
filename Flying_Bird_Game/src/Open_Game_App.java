import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

class RoundedBorder implements Border {
    private int radius;

    RoundedBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}

public class Open_Game_App extends JFrame {

    public Open_Game_App() {
        // Frame setup
        setTitle("Main Frame");
        setSize(400, 225);
        getContentPane().setBackground(new Color(25, 38, 50));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null); // Center on screen
        setLayout(new BorderLayout());


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(245, 247, 250));
        mainPanel.setOpaque(false);

        // ===== Title Label =====
        JLabel titleLabel = new JLabel("Flying Bird", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 32));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setOpaque(true);
        titleLabel.setBorder(new RoundedBorder(20));
        titleLabel.setBackground(new Color(33, 47, 61));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setMaximumSize(new Dimension(300, 60));

        // ===== Button =====
        JButton startButton = new JButton("START");
        // startButton.setFont(new Font("Arial", Font.BOLD, 20));
        startButton.setForeground(Color.WHITE);
        Color normalColor = new Color(41, 128, 185);   // Green
        Color hoverColor = new Color(31, 97, 141);    // Darker green
        // startButton.setBorder(new RoundedBorder(20));
        startButton.setBackground(normalColor);
        startButton.setFocusPainted(false);
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));

        // ===== Hover Effect =====
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButton.setBackground(hoverColor);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startButton.setBackground(normalColor);
            }
        });

        mainPanel.add(Box.createRigidArea(new Dimension(0, 20))); // space from top
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 40))); // space between title & button
        mainPanel.add(startButton);

        // Add to frame
        add(mainPanel);

        // ===== Button Action =====
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                App app = new App();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) throws Exception{
        new Open_Game_App();
    }
}