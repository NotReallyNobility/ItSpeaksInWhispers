import javax.swing.*;

public class Printer {
    private static JTextArea displayArea;

    public Printer (JTextArea displayArea) {
        this.displayArea = displayArea;
    }

    public Printer () {}

    public void setText(String text) {
        displayArea.setText(text);
    }

    public String getText() {
        return displayArea.getText();
    }

    
    //This method prints a line one letter at a time, making the story more readable and immersive.
    public void printNormal(String line) {
        int index = 0;
        
        
        try {
                Thread.sleep(100); // Creates a slight delay between the next letter.
        } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore the interrupted status
        }
        

        if (index == line.length()) {
                setText(line);
                System.out.println();
        } else if (index == 0) {
                setText(line.substring(0, index));
                
                System.out.print(line.charAt(index));
                printNormal(line, index + 1);
        } else {
                setText(line.substring(0, index));

                System.out.print(line.charAt(index));
                printNormal(line, index + 1);
        }
    }
    
    
    public void printNormal(String line, int index) {
        
        
        try {
                Thread.sleep(50); // Creates a slight delay between the next letter.
        } catch (InterruptedException e) {
                printNormal("Thread was interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore the interrupted status
        }
        

        if (index == line.length()) {
                setText(line);
                System.out.println();
        } else {
                setText(line.substring(0, index));

                System.out.print(line.charAt(index));
                printNormal(line, index + 1);
        }
    }
    
}