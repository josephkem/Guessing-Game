
package guess;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;


public class Guess extends JFrame{
    
    private JPanel g;
    private JPanel bu;
    private JLabel one;
    private JTextField gu;
    private JButton b;
    
    
    
    

    public Guess()
    {
        setTitle("Guessing Game");
        setVisible(true);
        setSize(800,550);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        g = new JPanel();
        g.setBorder(BorderFactory.createTitledBorder("Can You Guess The Number?"));
        g.setLayout(new FlowLayout(FlowLayout.CENTER,10,0));
        
        
        
        bu = new JPanel();
        bu.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        click in = new click();
       
        
        
        
        b = new JButton("Guess");
        b.addActionListener(in);
        one = new JLabel("Enter your guess");
        gu = new JTextField(5);
        
        g.add(one);
        g.add(gu);
        
        
        bu.add(b);
        
        g.setBackground(Color.GREEN);
        bu.setBackground(Color.YELLOW);
        
        add(g,BorderLayout.CENTER);
        add(bu,BorderLayout.SOUTH);
        
        
        
        
        
    }
    
    private class click implements ActionListener
        {
            public void actionPerformed(ActionEvent g)
            {
                String guess;
                int guess1;
                int myst;
                myst = 50;
                
                
                guess = gu.getText();
                
                
                
                guess1 = Integer.parseInt(guess);
                
                if(guess1>myst&&guess1<=(myst+10)||guess1<myst&&guess1>=(myst-10))
                {
                    bu.setBackground(Color.RED);
                    gu.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(null,"YOUR'RE HOT","Guess",JOptionPane.INFORMATION_MESSAGE);
                   
                }
                else if(guess1>(myst+10)&&guess1<=(myst+20)||guess1<(myst-10)&&guess1>=(myst-20))
                {
                    bu.setBackground(Color.ORANGE);
                    gu.setBackground(Color.ORANGE);
                    JOptionPane.showMessageDialog(null,"YOU'RE WARM","Guess",JOptionPane.INFORMATION_MESSAGE);
                    
                }
                else if(guess1>(myst+20)&&guess1<=(myst+30)||guess1<(myst-20)&&guess1>=(myst-30))
                {
                    bu.setBackground(Color.BLUE);
                    gu.setBackground(Color.BLUE);
                    JOptionPane.showMessageDialog(null,"YOU'RE COLD!!","Guess",JOptionPane.INFORMATION_MESSAGE);
                    
                }
                
                else if(guess1>(myst+30)&&guess1<=(myst+40)||guess1<(myst-30)&&guess1>=(myst-40))
                {
                    
                    bu.setBackground(Color.CYAN);
                    gu.setBackground(Color.CYAN);
                    JOptionPane.showMessageDialog(null,"YOU'RE VERY COLD!!","Guess",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(guess1>(myst+40)&&guess1<=(myst+50)||guess1<(myst-40)&&guess1>=(myst-50))
                {
                    
                    bu.setBackground(Color.CYAN);
                    gu.setBackground(Color.CYAN);
                    JOptionPane.showMessageDialog(null,"YOU'RE SUPER COLD!!","Guess",JOptionPane.INFORMATION_MESSAGE);
                }
                
                else if(guess1>(myst+50)||guess1<(myst-50))
                {
                    
                    bu.setBackground(Color.WHITE);
                    gu.setBackground(Color.WHITE);
                    JOptionPane.showMessageDialog(null,"YOU'RE FREEZING COLD!!","Guess",JOptionPane.INFORMATION_MESSAGE);    
                }
                else if(guess1==myst)
                {
                    
                    bu.setBackground(Color.MAGENTA);
                    gu.setBackground(Color.MAGENTA);
                    JOptionPane.showMessageDialog(null,"YOU GOT IT!!","Guess",JOptionPane.INFORMATION_MESSAGE);    
                }
                
                gu.setText("");
                
                System.out.println(myst);
    
            }
        }
        
    public static void main(String[] args) {
        
        Guess play = new Guess();
        
    }
    
}
