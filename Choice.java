import java.util.Scanner;

public class Choice {
    Scanner scnr;
    MainScreen mainScreen;
    private Printer printer = new Printer();
    private String wrongChoice = "That's not one of the options in the list, try one of these.";
    public Choice(Scanner scnr, MainScreen mainScreen) {
        this.scnr = scnr;
        this.mainScreen = mainScreen;
    }

    
    
    
    
    public int getChoice(String[] list) {
        printOptions(list, false);
        int choiceMade = 0;
        while (mainScreen.getChoice() == -1) {
            System.out.println(choiceMade + " is the current status of line. For unknown reasons this line of code is need for functionality.");
            choiceMade = mainScreen.getChoice();
            if (choiceMade >= list.length) {
                printer.printNormal(wrongChoice);
                printOptions(list, false);
            }
        }
        mainScreen.resetChoice();
        System.out.println(mainScreen.getChoice());

        return choiceMade;
    }
    
    //For a select few choices there will be a hidden choice. 
    //Since in most cases it won't be hidden, boolean hidden is false by default but the overloaded method can be used instead to get the true value.
    public int getChoice(String[] list, boolean hidden) {
        printOptions(list, false);
        int choiceMade = 0;
        while (mainScreen.getChoice() == -1) {
            System.out.println(choiceMade + " is the current status of line. For unknown reasons this line of code is need for functionality.");
            choiceMade = mainScreen.getChoice();
            if (choiceMade >= list.length) {
                printer.printNormal(wrongChoice);
                printOptions(list, hidden);
            }
        }
        mainScreen.resetChoice();
        System.out.println(mainScreen.getChoice());

        return choiceMade;
    }

    //Prints out the options for choosing, used in the previous two methods
    public void printOptions(String[] list, boolean hidden) {
        String print = printer.getText() + "\n";
        for (int i = 0; i < list.length; i++) {
                if (i < list.length - 1) {
                    print += (i + 1) + ": " + list[i] + "\n";
                    System.out.println((i + 1) + ": " + list[i]);
                }
                if ((i == list.length - 1) && (hidden == false)) {
                    print += (i + 1) + ": " + list[i] + "\n";
                    System.out.println((i + 1) + ": " + list[i]);
                }
        }

        printer.setText(print);
    }

    public String yesOrNo() {
        String yOrN = mainScreen.getText().toLowerCase();
        do {
            yOrN = mainScreen.getText().toLowerCase();
            if ((!(yOrN.equals("y"))) || (!(yOrN.equals("n")))) {
                printer.printNormal("Please only input y or n.");
                mainScreen.resetText();
            }
            


        } while (yOrN == null);
        return yOrN;
    }

    public String grabLine() {
        String line = mainScreen.getText();
        do {
            System.out.println(line + " is the current status of line. For unknown reasons this line of code is need for functionality.");
            line = mainScreen.getText();
            if (line != null) {
                if (line.equals("")) {
                    mainScreen.resetText();
                }
            }


        } while (line == null);

        mainScreen.resetText();
        return line;
    }

    public int grabInt() {
        int num = mainScreen.getNumber();
        boolean numInput = mainScreen.getNumInput();
        while (numInput == false) {
            System.out.println(num + " is the current status of line. For unknown reasons this line of code is need for functionality.");
            num = mainScreen.getNumber();
            numInput = mainScreen.getNumInput();
        }
        System.out.println(numInput);
        mainScreen.resetText();
        return num;
    }
}
