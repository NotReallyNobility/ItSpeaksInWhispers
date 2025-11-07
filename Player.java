public class Player extends Character {
    private String name;
    private String[] subj = {"he", "she", "they"};
    private String[] obj = {"him", "her", "them"};
    private String[] poss = {"his", "hers", "theirs"};
    private int genderChoice;
    

    public Player() {
        injured = false;
        hungry = true;
        thirsty = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGenderChoice(int choice) {
        genderChoice = choice;
    }

    public String getSubj() {
        return subj[genderChoice];
    }

    public String getObj() {
        return obj[genderChoice];
    }

    public String getPoss() {
        return poss[genderChoice];
    }

    public void printCondition() {
        if (hungry && thirsty && injured) {
                System.out.println("'I'm no medic, but I think I might be fairly doomed. Everything that can go wrong, apparently has.'");
        } else if (hungry && thirsty) {
                System.out.println("'My stomach grumbles, and my mouth is dry, but on the bright side bleeding out is not on the agenda.'");
        } else if (hungry && injured) {
                System.out.println("'Well, the stomach grumbles and the body is injured, but I don't need to drink for now.'");
        } else if (thirsty && injured) {
                System.out.println("'I'm incredibly thirsty and injured. Sadly I'm not feeling vampiric today, so drinking blood doesn't feel like a viable solution here. At least I'm not hungry too.'");
        } else if (hungry) {
                System.out.println("'I've got a case of the munchies, but overall doing good. No injuries of note and I'm not thirsty.'");
        } else if (thirsty) {
                System.out.println("'I could go for a drink. I'm not all that hungry or hurt, so there's that.'");
        } else if (injured) {
                System.out.println("'I'm a bit, well, a lot more battered and beaten than I'd like to be, but I'm not hungry or thirsty.'");
        }
    }
}
