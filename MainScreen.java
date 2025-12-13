import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;






public class MainScreen implements ActionListener {
    private int choice = -1;
    private String text = null;
    private int num;
    private boolean numInput = false;
    
    
    
    private JFrame mainScreen;
    private JTextArea displayArea;
    private JTextField textInputField;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private Border whiteBorder = BorderFactory.createLineBorder(Color.white, 2, false);

    public MainScreen () {
        mainScreen = new JFrame();

        // Set the frame's width (400) and height (250) in pixels
        mainScreen.setSize(950, 500);
      
        // Set the frame's title
        mainScreen.setTitle("It Speaks In Whispers");
      
        // Set the program to exit when the user
        // closes the frame
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainScreen.getContentPane().setBackground(Color.black);

        //Code for the Text display area
        displayArea = new JTextArea(15, 80);

        textInputField = new JTextField("");

        button1 = new JButton("Choice 1");
        button2 = new JButton("Choice 2");
        button3 = new JButton("Choice 3");
        button4 = new JButton("Choice 4");



        mainScreen.setLayout(null);

        displayArea.setText("Bob");
        displayArea.setEditable(false);
        displayArea.setBackground(Color.black);
        displayArea.setForeground(Color.white);
        displayArea.setBorder(whiteBorder);

        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);

        displayArea.setBounds(200, 100, 500, 200);

        mainScreen.add(displayArea);
        

        textInputField.setBackground(Color.black);
        textInputField.setForeground(Color.white);
        textInputField.setBorder(whiteBorder);

        textInputField.setBounds(400, 310, 100, 30);
        textInputField.addActionListener(this);

        mainScreen.add(textInputField);

        button1.setBackground(Color.black);
        button1.setForeground(Color.white);
        button1.setBorder(whiteBorder);

        button1.setBounds(200, 350, 100, 30);
        button1.addActionListener(this);

        mainScreen.add(button1);



        
      
        

        button2.setBackground(Color.black);
        button2.setForeground(Color.white);
        button2.setBorder(whiteBorder);

        button2.setBounds(333, 350, 100, 30);
        button2.addActionListener(this);

        mainScreen.add(button2);


        button3.setBackground(Color.black);
        button3.setForeground(Color.white);
        button3.setBorder(whiteBorder);

        button3.setBounds(466, 350, 100, 30);
        button3.addActionListener(this);

        mainScreen.add(button3);


        button4.setBackground(Color.black);
        button4.setForeground(Color.white);
        button4.setBorder(whiteBorder);

        button4.setBounds(600, 350, 100, 30);
        button4.addActionListener(this);

        mainScreen.add(button4);

        mainScreen.setVisible(true);
    }

    public JTextArea getDisplayArea() {
        return displayArea;
    }

    public int getChoice() {
        return choice;
    }

    public void resetChoice() {
        choice = -1;
    }

    public String getText() {
        return text;
    }

    public int getNumber() {
        return num;
    }

    public boolean getNumInput() {
        return numInput;
    }

    public void resetText() {
        text = null;
        numInput = false;
        textInputField.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
      Object source = event.getSource();
      System.out.println("Event processed");
      if (source == button1) {
        choice = 0;
      } else if (source == button2) {
        choice = 1;
      } else if (source == button3) {
        choice = 2;
      } else if (source == button4) {
        choice = 3;
      } else if (source == textInputField) {
          text = textInputField.getText();
          try {
            num = Integer.parseInt(textInputField.getText());
            numInput = true;
          }
          catch (NumberFormatException e) {
            System.out.println("That ain't a number");
            numInput = false;
          }
      }
   }
}