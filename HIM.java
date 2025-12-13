public class HIM extends Character{
    public HIM() {
        injured = false;
        hungry = true;
        thirsty = true;
    }

    @Override
    public void printCondition() {
        if (hungry && thirsty && injured) {
                printer.printNormal("It looks like I'm not in the best condition. What will you do next?");
        } else if (hungry && thirsty) {
                printer.printNormal("Ever I hunger, ever I thirst.");
        } else if (hungry && injured) {
                printer.printNormal("The thirst is gone... but this body is breaking.");
        } else if (thirsty && injured) {
                printer.printNormal("No hunger? Interesting. But now it is more than my heart that bleeds.");
        } else if (hungry) {
                printer.printNormal("The thirst is gone for now, intriguing.");
        } else if (thirsty) {
                printer.printNormal("So, very, thirsty.");
        } else if (injured) {
                printer.printNormal("This body isn't eternal, in fact it's end seems near.");
        }
    }
}
