import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class demo{
    JFrame frame;
    JTextField textField;

    double num1, num2, result;
    char operator;

    demo(){
        createGUI();
    }
    public final void createGUI(){
        frame = new JFrame("Example");
        frame.setSize(300,300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.GREEN);

        JLabel label=new JLabel();
        JPanel panel=new JPanel();
        panel.add(label);
        frame.add(label,BorderLayout.CENTER);
        
        panel.setLayout(new GridLayout(0, 4, 2, 2));
        panel.setSize(50,20);
       
        textField= new JTextField();
        textField.setSize(3,60);
        textField.setEditable(false);
        frame.add(textField,BorderLayout.NORTH);
        frame.setBackground(Color.CYAN);
        // JButton button=new JButton("Click");
        // button.setBounds(5,5,5,6);
        // // button.setPreferredSize(new Dimension(50, 5));
        // panel.add(button,BorderLayout.EAST);


        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton bplus=new JButton("+");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton bminus=new JButton("-");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");
        JButton binto=new JButton("*");
        JButton b0=new JButton("0");
        JButton bdivide=new JButton("/");
        JButton bequal=new JButton("=");
        JButton bc=new JButton("c");



        // b0.setBounds(0,1,3,4);
        // b1.setBounds(5,5,5,6);
        // b2.setBounds(5,5,5,6);
        // b3.setBounds(5,5,5,6);
        // b4.setBounds(5,5,5,6);
        // b5.setBounds(5,5,5,6);
        // b6.setBounds(5,5,5,6);
        // b7.setBounds(5,5,5,6);
        // b8.setBounds(5,5,5,6);
        // b9.setBounds(5,5,5,6);
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bplus);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bminus);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(binto);
        panel.add(bdivide);
        panel.add(b0);
        panel.add(bequal);
        panel.add(bc);
        frame.add(panel,BorderLayout.CENTER);
        frame.setVisible(true);

        b1.addActionListener(new NumberAction());
        b2.addActionListener(new NumberAction());
        b3.addActionListener(new NumberAction());
        b4.addActionListener(new NumberAction());
        b5.addActionListener(new NumberAction());
        b6.addActionListener(new NumberAction());
        b7.addActionListener(new NumberAction());
        b8.addActionListener(new NumberAction());
        b9.addActionListener(new NumberAction());
        b0.addActionListener(new NumberAction());


        bplus.addActionListener(new OperaterAction());
        bminus.addActionListener(new OperaterAction());
        binto.addActionListener(new OperaterAction());
        bdivide.addActionListener(new OperaterAction());

        bequal.addActionListener(new Equalsmethod());
        bc.addActionListener(new ClearMethod());
    }
    public static void main(String[] args) {
        new demo();
        // System.out.println("HELLO");
    }

    class NumberAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            textField.setText(textField.getText()+command);
        }
    }

    class OperaterAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            num1 = Double.parseDouble(textField.getText());
            operator = command.charAt(0);
            textField.setText("");
        }
    }

    class Equalsmethod implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            num2 = Double.parseDouble(textField.getText());
            
            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
            }

            textField.setText(String.valueOf(result));
        }
    }

    class ClearMethod implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("");
            num1 = num2 = result = 0;
            operator = '\0';
        }
    }
}