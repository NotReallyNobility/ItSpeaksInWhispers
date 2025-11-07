import java.util.Scanner;

public class Choice {
    Scanner scnr;

    public Choice(Scanner scnr) {
        this.scnr = scnr;
    }

    public int getChoice(String[] list) {
        printOptions(list, false);
        int choice = scnr.nextInt() - 1;
        while (choice < 0 || choice > (list.length - 1)) { 
                System.out.println("Please, pick a proper choice.");
                
                choice = scnr.nextInt() - 1;
        }



        return choice;
    }
    
    //For a select few choices there will be a hidden choice. 
    //Since in most cases it won't be hidden, boolean hidden is false by default but the overloaded method can be used instead to get the true value.
    public int getChoice(String[] list, boolean hidden) {
        printOptions(list, hidden);
        /*int i = 1;
        for (String listItem : list) {
                if (i < list.length) {
                        System.out.println(i + ": " + listItem);
                        i++;
                }
        }*/
        int choice = scnr.nextInt() - 1;
        while (choice < 0 || choice > (list.length - 1)) { 
                System.out.println("Please, pick a proper choice.");

                printOptions(list, hidden);
                /*i = 1;
                for (String listItem : list) {
                        if (i < list.length) {
                            System.out.println(i + ": " + listItem);
                            i++;
                        }
                }*/
                choice = scnr.nextInt() - 1;
        }



        return choice;
    }

    //Prints out the options for choosing, used in the previous two methods
    public void printOptions(String[] list, boolean hidden) {
        for (int i = 0; i < list.length; i++) {
                if (i < list.length - 1) {
                    System.out.println((i + 1) + ": " + list[i]);
                }
                if ((i == list.length - 1) && (hidden == false)) {
                    System.out.println((i + 1) + ": " + list[i]);
                }
        }
    }
}
