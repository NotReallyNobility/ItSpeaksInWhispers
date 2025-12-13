public abstract class Character {
    protected boolean injured;
    protected boolean hungry;
    protected boolean thirsty;
    protected boolean dead = false;
    protected Printer printer = new Printer();

    public boolean getInjured() {
        return injured;
    }

    public boolean getHungry() {
        return hungry;
    }

    public boolean getThirsty() {
        return thirsty;
    }

    public boolean getDead() {
        return dead;
    }


    public void makeInjured() {
        if (injured == false) {
            injured = true;
        } else {
            dead = true;
        }
    }

    public void heal() {
        injured = false;
    }

    public void makeHungry() {
        if (hungry == false) {
            hungry = true;
        } else {
            dead = true;
        }
    }

    public void eat() {
        hungry = false;
    }

    public void makeThirsty() {
        if (thirsty == false) {
            thirsty = true;
        } else {
            dead = true;
        }
    }

    public void drink() {
        thirsty = false;
    }

    public void makeDead() {
        dead = true;
    }


    abstract void printCondition();
}
