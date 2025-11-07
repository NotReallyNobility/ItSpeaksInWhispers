import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        Choice chooser = new Choice(in);
        //For multiple choice loops, ensure a proper option is picked. For ease of interactivity, it will always be false. Break statements are used to exit loops, as a "correct your spelling" prints to the console if none of the breaks are triggered
        boolean properChoice = false;



        //Character conditions
        Player player = new Player();

        // --- Collect basic character info ---
        System.out.println("Do see it, do you see me? Good. Before we begin, a few questions.");
        System.out.println("Let's start with a simple one. Enter your character's name: ");
        player.setName(in.nextLine());
        System.out.println("Lovely.\n");
        

        //Allows choice of gender
        System.out.println("Now, we can't always use a name. Choose a gender for your little puppet, type the number for your desired option, you'll be doing so often.");
        String[] genderList = {"male", "female", "other"};
        player.setGenderChoice(chooser.getChoice(genderList));
        

        System.out.println("I'm glad to properly address your character, after all you should be comfortable in your creation's skin, be the fit of that skin loose or tight.");


        
        System.out.println("Now one last question. Enter your character's age: ");
        int age = in.nextInt();
        if (age < 25) {
                System.out.println("That's a tad too young for our purposes. Let's simply go with 25.");
                age = 25;
        }
        System.out.println("Ah, now we begin the story. I wonder how this one will end.\n");

        // An example integer you can reference later (feel free to rename/use differently)
        int gold = 12;

        // --- Prologue paragraph (≥ 5 sentences using ≥ 5 variables) ---
        System.out.println();
        System.out.println("~ ~ ~ Adventure Prologue ~ ~ ~");
        System.out.println(player.getName() + " set out at dawn, " + player.getPoss() + " pack light and hopes high.");
        if (age < 50) {
                System.out.print("At only " + age + " years old, " + player.getSubj() + " already carries stories that most would never dare to tell.");
        } else if (age < 100) {
                System.out.print("At a ripe age of " + age + ", " + player.getSubj() + " carries stories that most would never dare tell.");
        } else {
                System.out.print("At an ancient " + age + " years old, " + player.getSubj() + "'d lived tales you can't even imagine.");
        }
        System.out.println(" How lucky for you to glimpse into this one.");
        System.out.println("In the pouch at " + player.getPoss() + " side clinked " + gold + " gold coins— "
                + "not much, but enough for bread and a bed in a quiet inn. One can only sleep in a tent so many days in a row.");
        System.out.println("A weathered sign pointed toward the Whispering Woods, and " + player.getSubj()
                + " felt a shiver that had nothing to do with the cold.");
        System.out.println("Whatever waited beyond the treeline would test " + player.getObj() + ", but " + player.getName()
                + " walked on without looking back.\n");

        // (You will add TWO more paragraphs below for your submission.)
        // TIP: Use more variables to store place names, items, stats, etc.



        //Important variables introduced: chapter myName, myNameCorrect, myAge, townName, falseMadness, trueMadness, and timeGap. 
        System.out.println("The Whispering Woods are a place " + player.getName() + " had heard of before.");
        System.out.println("It's said a creature lived within, one that took on many names; 'Scarred Torso', 'Otherkin', and 'Stalking Corpse'.");
        System.out.println("Which do you think your character would use? (Scarred Torso/Otherkin/Stalking Corpse): ");
        boolean myNameCorrect = false;
        String[] myNames = {"The Scarred Torso", "The Otherkin", "The Stalking Corpse", "Ethereal"};
        int myNameChoice = chooser.getChoice(myNames, true);
        
        //Determines how the name that is used against the creature.        
        switch (myNameChoice) {
            case 0:
                System.out.println("'The Scarred Torso'... Yes, the mark upon it's quilled chest is often the first the eye is drawn to.");
                System.out.println("It takes the form of the outline of a heart, with a line dripping down from where the two halves meet. A bleeding heart. Though pain seems to follow whatever this think is, it is not without compassion.");
                break;

            case 1:
                System.out.println("'The Otherkin'... Indeed, it is other. It bears close resemblance to the angels and demons for often it takes interest in those of faith, yet how it acts, how it is able to act, show it clearly is neither.");
                System.out.println("There's something lonely in that, isn't there?");
                break;
                
            case 2:
                System.out.println("'The Stalking Corpse'... The most common name. Ever watching, ever frail. The flesh of it's arms bare of skin, it's body emaciated. Torn to expose the spine between the hip bone and rib cage.");
                System.out.println("All those things are horrific to gaze upon, yet worse is the face. It's neck is a stump, the head is disconnected, a floating upper skull with no jaw.");
                System.out.println("It's eyes were hollow. It had ridged two horns going back and slightly out, each forming a semi circle. The shape was entirely inhuman, almost a mix between a deer and a bird is how it's often described, though how this may appear is unknown to " + player.getName() + ".");
                break;
                
            case 3:
                System.out.println("");
                break;
        }
        


        System.out.println("But there was always more to the beast within, after all it's quite ancient.");
        System.out.println("Just how many millenia old do you think it is?: ");
        int myAge = in.nextInt();
        System.out.println((myAge * 1000) + " years old... I would have said older.");
        System.out.println("As " + player.getName() + " made " + player.getObj() + " way to the woods remembering all those tales of " + myNames[myNameChoice] + ", " + player.getSubj() + " couldn't help but recall one of them more clearly than the others.\n");
        
        System.out.println("Once, long, long ago before the forest even had a name, a town was forming. A town that took the name...");
        System.out.println("Hmm, what was it's name again?: ");
        String townName = in.next();
        System.out.println("Ah yes, " + townName + ". That's it. Well, " + townName + " was formed very long ago, when this land was near devoid of settlements.");
        System.out.println("They formed the town at the edge of the forest, in a small field. At the center of that town, the leader of this flock, was a priest, faithful and devout.");
        System.out.println("He was a good man, he believed the word of his book to the fullest, yet the whispering forest is so named for a reason.");
        System.out.println("As time went on, people changed. Crazy old men would claim to hear voices, some hunters would enter the woods and fail to leave."
                + "\nThose that did slowly became the crazy old men.");
        System.out.println("Fancy a guess as to how many hunters went mad in the first ten years?: ");
        int falseMadness = in.nextInt();
        int trueMadness = falseMadness + 3;

        System.out.println("\n" + falseMadness + " is very close. The real number was " + trueMadness + ".");
        System.out.println("The priest was concerned about it for a long time, the subtle madness creeping into the town, and so he too entered the woods.");
        System.out.println("What lived within was surely not holy, but the light of Him was surely enough to drive back the shadow in the tress.");
        System.out.println("He dissapeared, gone like many of the hunters. The town saw the light fail him, and so they fell to despair, to darkness.");
        
        //the timeGap variable is to always ensure a large length of time, even larger based on the character's inputted age. The older the character, the more impossible the situation.
        int timeGap = age + 123;
        System.out.println("Yet time would pass, and so the people died. All that was remembered of the priest was his legacy," 
                + "\nuntil " + timeGap + "years passed. A man in tattered priest's robes.");
        System.out.println("He seemed to speak madness. There was a thing in the forest, more than a voice. A tortured form, one nigh impossible to describe." 
                + "\nIt showed him things, changed the way he saw the light. He preached to cast away the book that shaped his whole life.");
        System.out.println("Obviously this was some trickster, some devious man who wanted to create fear. No one lives " + timeGap + " years.");
        System.out.println("Still, people learned to avoid the forrest. They found other means of resources. Whatever was in the forrest stayed within it. One had to seek out the creature.\n");
        
        
        
        
        
        //Variables introduced: sachelChange, foesBested, sachelPattern, and tavernChosen.
        System.out.println("~ ~ ~ Chapter 1 ~ ~ ~");
        //To keep the experience fresh each time, the sachel will always give a range of 10 - 23 coins. Once if/else statements are implemented, a shop can be too.
        int sachelChange = random.nextInt(13) + 11;
        System.out.println(player.getName() + " thought on this tale for a while, fear overcoming " + player.getObj() + " sense. The chill became a shiver.");
        System.out.println(player.getSubj() + " needed to take " + player.getPoss() + "mind off this, to focus on something else. 'The road. Look at the road'");
        System.out.println("Laying on the ground was a small sachel, something easily missed. Inside were " + sachelChange + " coins. Lucky isn't it? Left at almost the perfect spot.");
        System.out.println("It felt almost, too perfect. Here, at the edge of the forest. The old tales say it waits in the old woods, but what stops it from going anywhere else the trees grow?");
        System.out.println("Most discount such things existing, but not " + player.getName() + ". " + player.getSubj() + "'s seen too many supernatural beasts. Honestly they've become something of an enjoyable nuisance");
        System.out.println("It's to the point he lost track in fact. What was it, somewhere near 15 or 20?: ");
        int foesBested = in.nextInt();
        if (foesBested < 15) {
                foesBested = 15;
                System.out.println("No, that's too low. It must have been 15 then.");        
        } else if (foesBested > 20) {
                foesBested = 20;
                System.out.println("No, that's too high. It must have been 20 then.");  
        }
        System.out.println("Ah, " + foesBested + " is quite the resume. Will you see that number grow, or become meaningless? It's your choice.");
        
        System.out.println("\nRegardless, " + player.getName() + " collected the coins and continued on, pleased to see the coins."
                + "\nThey could be the difference between drowning, or pulling yourself out of the river with the rope barely cheap enough to purchase.");
        System.out.println("Looking further at the sachel left behind there was a symbol smudged onto it. The amount of tears make it a little tough to make out.");
        
        
        System.out.println("Was it a flower or a fox?: ");
        String[] sachelPattern = {"flower", "fox"};
        int sachelChoice = chooser.getChoice(sachelPattern);

        System.out.println("Of course. Everyone loves a good " + sachelPattern[sachelChoice] + ". " + player.getName() + "'ll have to check at one of the upcoming taverns if anyone lost it.");
        System.out.println("Speaking of, there's a few coming up isn't there? Yes, there they are just over the ridge. 'Finally, somewhere to rest my feet!'");

        System.out.println(player.getName() + " took a moment to reflect on " + player.getObj() + " condition.");
        player.printCondition();
        System.out.println("Which tavern would you like to visit, The Slumbering Mound, The Tortured Hog, or The Overflowed Mug? (Mound/Hog/Mug):");
        
        
        //tavern based variables
        
        int drinkPrice = 0;
        int foodPrice = 0;
        //Selects the tavern
        String[] taverns = {"The Slumbering Mound", "The Tortured Hog", "The Overflowed Mug"};
        int tavernChoice = chooser.getChoice(taverns);

        //changes the dialouge based on the chosen tavern
        switch (tavernChoice) {
           case 0:
                drinkPrice = 2;
                foodPrice = 2;
                System.out.println("The Slumbering Mound, named for it's drowsy appearance. As " + player.getName() +" stepped into the establishment, nary a customer could be seen.");
           case 1:
                drinkPrice = 1;
                foodPrice = 3;
                System.out.println("Ah, The Tortured Hog, dirty, disgusting, and the pork is actually quite good from what I've heard.");
           case 2:
                drinkPrice = 4;
                foodPrice = 4;
                System.out.println("The Overflowed Mug, feeling expensive are we? More costly than the others, but certainly worth it for the quality. Well, I suppose they don't charge for the chairs if that's all you need.");
                System.out.println("Just to specify I mean sitting in the chair. You can't just take the chairs.");
        }
        
        
        //tavern intro
        switch (tavernChoice) {
           case 0:
                System.out.println("The barkeek was a short man, with whispy hair and an equally whispy beard too. Somehow he had bags under his eyes despite the fact " + player.getName() + "'s appearance woke them from their nap.");
                System.out.println("'Two coins a drink, 1 for  don't be picky, we ain't got much to choose.' the barkeep spoke through a yawn.");
                System.out.println("Responding with equal enthusiam, " + player.getName() + " said, 'Don't worry. My tastes are road worn, I don't need much.'");
                System.out.println("'Fine fine, just wake me up when you figure out what you want...' And with that the barkeep went back to sleep. 'Well, isn't he a charming fellow.'");
        
           case 1:
                System.out.println("Before " + player.getName() + " could even take a few steps through the door the barkeep shouted out 'Here for some pig? 3 coins. Pint's just a single coin though.'");
                System.out.println("Having a chance to properly get a look, " + player.getName() + " could see the barkeep was a strongly built woman in a bloodstained apron. A smirk came to " + player.getName() + "'s face.");
                System.out.println("'I take it the hog is fresh?'");
                System.out.println("'Everyday. Go ahead and sit down. Ain't a good rest stop if you don't. I'll grab yer grub when yer legs stop wanting you dead.'");
           case 2:
                System.out.println("Walking into the building, a comfortable air hit " + player.getName() + "'s face. Clearly this building was better built than most to retain heat in the fall.");
                System.out.println("'Welcome good patron! A pleasure to have you here. Curious to put your guts grumblings to end?' The barkeep was slightly better dressed than most in the area, better spoken too.");
                System.out.println("Shortcut hair, and slim, he was out of place in this wilderness, but the cordialness wasn't unwelcome in such unbroken forests.");
                System.out.println("A smile on " + player.getName() + "'s face, " + player.getSubj() + " responded, 'Not yet thank you, I'd rather take a moment to enjoy the lack of insects trying to crawl on me anytime I sit down.'");
                System.out.println("'Ah, well when you feel ready to take a drink or meal both cost four coins each. We import some quality beverages and meats.'");
        }


        //Getting food or drink

        System.out.println("Musing to " + player.getObj() + "self, " + player.getName() + " came to the conclusion, 'I probably could go for something. I have enough coins certainly.'");
        if (player.getHungry()) {
                System.out.println("'Should I get some food?' (y/n): ");
                while (properChoice == false) {
                        if (in.next().equals("y")) {
                                break;
                        } else if (in.next().equals("n")) {
                                break;
                        }
                        System.out.println("Please only input y or n.");
                }

                if (in.next().equals("n")) {
                        System.out.println("'Hmmm, no. I'm not that hungry. I can stand to just eat my rations.'");
                } else {
                        gold -= foodPrice;
                        switch (tavernChoice) {
                           case 0:
                                System.out.println("Walking up to the drowsy man, " + player.getName() + " tapped the counter and said 'Barkeep, one meat pie, please.'");
                                System.out.println("Blinking himself back to consiousness, he reached under the counter and pulled out a barely not rotten mush in some sorry excuse for crust.");
                                System.out.println(player.getName() + "'s nose wrinkled in disgust. 'Not very fresh I see...'");
                                System.out.println("'Well, I said not to be picky. Thanks for the gold, I'll be asleep if you need me.'");
                                player.eat();
                                break;

                           case 1:
                                System.out.println("'I'll take you up on that fresh hog now.'");
                                System.out.println("'Ah, you'll find the skin scorched and seasone, with flesh juicy.'");
                                System.out.println("Pleased, " + player.getName() + "answered with 'A proper meal in lands like these. I'll dig in right away.'");
                                System.out.println("'A pleasure serving you.'");
                                player.eat();
                                break;

                           case 2:
                                System.out.println("'Your food is expensive. I'm eager to see if it's worth the price.' " + player.getName() + " said with a grin.");
                                System.out.println("'Right away friend, chicken or beef?' '...Chicken.' 'Right away then.'");
                                System.out.println(player.getName() + " took their time to enjoy the atmosphere of the place for a moment. The chairs were cushioned, rare in these parts. The floor didn't creek, in fact the door was spotless.");
                                System.out.println("As the tavern owner brought the food, " + player.getName() + " couldn't help but ask, 'Out of curiousity, how do you even afford to keep this place this nice? I can't imagine you get much business.'");
                                System.out.println("'Oh you'd certainly be surprised. The Whispering Woods are notoriously supernatural, and that attracts all sorts, often in groups. There was a fellow who looked to be of the magical sort, a wizard or warlock basically.'");
                                System.out.println("'I assume they were trying to capture or negotiate with " + myNames[myNameChoice] + "?'");
                                System.out.println("'That'd be my guess. Didn't ask. Simply accepted my payment and let the spooky fellow on their way. Normally it's a sad thing to lose one to the woods, but he seemed on the darker path of life.'");
                                player.eat();
                        }
                }
        }

        if (player.getThirsty()) {
            System.out.println("'Should I get something to drink?' (y/n): ");
                while (properChoice == false) {
                        if (in.next().equals("y")) {
                                break;
                        } else if (in.next().equals("n")) {
                                break;
                        }
                        System.out.println("Please only input y or n.");
                }

                if (in.next().equals("n")) {
                        System.out.println("'There's still plenty of drink in my canteen, best to save my coin for a shop.'");
                } else {
                        gold -= drinkPrice;
                        switch (tavernChoice) {
                           case 0:
                                System.out.println(player.getName() + " went to the counter and said 'Mind if I try the ale?' startling the raggedy coot awake.");
                                System.out.println("'Sure, sure, whatever.' Reaching down he grabbed a glass and poured out possibly the most vile liquid imaginable.");
                                System.out.println("'Perhaps... I'll look for a river later.'");
                                System.out.println("'Well, no refunds. I'll be sleeping here if you need something.'");
                                break;
                                
                           case 1:
                                System.out.println("'The food here is obviously well made,' " + player.getName() + "said with a question in her voice, 'but what of the drink?'");
                                System.out.println("'Not much of a brewer, more a butcher, so it's nothin special. Still, a good drink before you head on your way seems something you'd want. You're type are always on their way to the Whispering Woods. Trust me when I say a drink here is better than any you'll find out there.");
                                System.out.println("Curiosity filling " + player.getObj() + " mind, " + player.getName() + " couldn't help but ask for an expanation as the drink was passed along the table. Just a simple ale, the standard for bars such as this.");
                                System.out.println("'Well what do you think I mean? The water's... wrong in the woods. I've heard stories that the closer you get to the center, the more red the water becomes until, well, until it isn't water anymore.'");
                                System.out.println("'Look, I haven't traveled through those woods myself. I steer clear of the deeper ends. But I've seen people either come through here and never return, or turn tail once things start getting ominous. At first I'd warn people off the bat, but no one listens. So I don't warn, I do what I can to prepare them with a good rest, good fresh meat, and a lasting drink.'");
                                System.out.println("The barkeeps face seemed troubled as she spoke, years of watching people willingly walk to their presumed deaths does that to someone.\n");
                                System.out.println("After a moments silence, " + player.getName() + " responded. 'I thank you for the warning. You're right. I'm going to explore those woods and find whatever lives within them. But you should know, I'm not coming here out of arrogance. I've seen monsters and unnatural places before. I don't intend to be another lost soul.'");
                                System.out.println("It was clear from her eyes, the barkeep had no faith in that claim. Hope for such things had faded from her long ago, all remained was a desire to enjoy what time was left.");
                                player.drink();
                                break;

                           case 2:
                                System.out.println("'So, you speak highly of your drinks, what do you serve that makes your ale so much better?' " + player.getName() + " asked, as an almost smug look took over the establishment's owner.");
                                System.out.println("'The simple answer is, we don't.'");
                                System.out.println("'I beg your pardon?' " + player.getName() + " responded, quite a bit taken aback by a frankly outlandish notion in these parts, before recovering " + player.getPoss() + "elf.");
                                System.out.println("'We serve wine, a good year too. Tell me how you enjoy it once you finish,' the owner said as he poured the glass and passed it along. The glass had a nice design of an apple tree.");
                                player.drink();
                        }
                }
        }
    }
}
