public class BasicEnemy extends Character{

    public BasicEnemy() {
        injured = false;
        hungry = false;
        thirsty = false;
    }

    public BasicEnemy(boolean injured, boolean hungry, boolean thirsty) {
        this.injured = injured;
        this.hungry = hungry;
        this.thirsty = thirsty;
    }

    @Override
    public void printCondition() {
        if (hungry && thirsty && injured) {
                printer.printNormal("'This thing is obviously in horrible condition, through and through. Best not give it a chance to recover.'");
        } else if (hungry && thirsty) {
                printer.printNormal("'Oh, just great. It's hungry and thirsty, and I'm made of blood and meat.'");
        } else if (hungry && injured) {
                printer.printNormal("'It's injured and hungry, a cornered animal. That's not good.'");
        } else if (thirsty && injured) {
                printer.printNormal("'It's thirsty and injured. In other words, not on its A game. I need to take care of this quick.'");
        } else if (hungry) {
                printer.printNormal("'Based on the drool from its maw, the thing is hungry... well I'm not planning to be made a meal.'");
        } else if (thirsty) {
                printer.printNormal("'Hmm, cracked lips. I think it's thirsty. It's not going to think entirely rationally.'");
        } else if (injured) {
                printer.printNormal("'It's hurt pretty bad, that could be useful.'");
        }
    }
}
