import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Open_Calc2 extends JWindow
{
    private JButton openbtn;
    private JLabel title;
    
    public Open_Calc2()
    {
        setSize(400,200);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);
        
        title = new JLabel("Created By - Deepansh", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(Color.DARK_GRAY);
        
        openbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                My_Calc_App calc = new My_Calc_App();
                calc.setVisible(true);
                dispose();
            }
        });
        
        panel.add(title, BorderLayout.CENTER);
        panel.add(openbtn, BorderLayout.SOUTH);
        
        add(panel);
    }
    public static void main(String [] args)
    {
        new Open_Calc2().setVisible(true);
    }
}

