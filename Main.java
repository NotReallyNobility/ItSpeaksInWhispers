import java.util.Random;
import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) {
        MainScreen mainScreen = new MainScreen();
        Printer printer = new Printer(mainScreen.getDisplayArea());
   
        
        //variables/objects used interimittently throughout.
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        Choice chooser = new Choice(in, mainScreen);
        String yOrN;

        //Character conditions
        Player player = new Player();

        // --- Collect basic character info ---
        printer.printNormal("Do you see it, do you see me? Good. Before we begin, a few questions." +
        " Let's start with a simple one. Enter your character's name in the box below: ");
        player.setName(chooser.grabLine());
        printer.printNormal("Lovely.");
        System.out.println();
        

        //Allows choice of gender
        printer.printNormal("Now, we can't always use a name. Choose a gender for your little puppet, press the button with the corresponding number, you'll be doing so often.");
        String[] genderList = {"male", "female", "other"};
        player.setGenderChoice(chooser.getChoice(genderList));

        printer.printNormal("I'm glad to properly address your character, after all you should be comfortable in your creation's skin, be the fit of that skin loose or tight.");


        
        printer.printNormal("Now one last question. Enter your character's age: ");
        int age = chooser.grabInt();
        if (age < 25) {
                printer.printNormal("That's a tad too young for our purposes. Let's simply go with 25.");
                age = 25;
        }
        printer.printNormal("Ah, now we begin the story. I wonder how this one will end.\n");

        // An example integer you can reference later (feel free to rename/use differently)
        int gold = 12;

        // --- Prologue paragraph (≥ 5 sentences using ≥ 5 variables) ---
        System.out.println();
        System.out.println("~ ~ ~ Adventure Prologue ~ ~ ~");
        printer.printNormal(player.getName() + " set out at dawn, " + player.getPoss() + " pack light and hopes high.");

        String halfString;
        if (age < 50) {
                halfString = "At only " + age + " years old, " + player.getSubj() + " already carries stories that most would never dare to tell.";
        } else if (age < 100) {
                halfString = "At a ripe age of " + age + ", " + player.getSubj() + " carries stories that most would never dare tell.";
        } else {
                halfString = "At an ancient " + age + " years old, " + player.getSubj() + "'d lived tales you can't even imagine.";
        }
        printer.printNormal(halfString + " How lucky for you to glimpse into this one.");
        printer.printNormal("In the pouch at " + player.getPoss() + " side clinked " + gold + " gold coins— "
                + "not much, but enough for bread and a bed in a quiet inn. One can only sleep in a tent so many days in a row.");
        printer.printNormal("A weathered sign pointed toward the Whispering Woods, and " + player.getSubj()
                + " felt a shiver that had nothing to do with the cold.");
        printer.printNormal("Whatever waited beyond the treeline would test " + player.getObj() + ", but " + player.getName()
                + " walked on without looking back.\n");

        // (You will add TWO more paragraphs below for your submission.)
        // TIP: Use more variables to store place names, items, stats, etc.



        //Important variables introduced: chapter myName, myNameCorrect, myAge, townName, falseMadness, trueMadness, and timeGap. 
        printer.printNormal("The Whispering Woods are a place " + player.getName() + " had heard of before.");
        printer.printNormal("It's said a creature lived within, one that took on many names; 'Scarred Torso', 'Otherkin', and 'Stalking Corpse'.");
        printer.printNormal("Which do you think your character would use? (Scarred Torso/Otherkin/Stalking Corpse): ");
        boolean myNameCorrect = false;
        String[] myNames = {"The Scarred Torso", "The Otherkin", "The Stalking Corpse", "Ethereal"};
        int myNameChoice = chooser.getChoice(myNames, true);
        
        //Determines the name that is used for the creature.        
        switch (myNameChoice) {
            case 0:
                printer.printNormal("'The Scarred Torso'... Yes, the mark upon it's quilled chest is often the first the eye is drawn to.");
                printer.printNormal("It takes the form of the outline of a heart, with a line dripping down from where the two halves meet. A bleeding heart. Though pain seems to follow whatever this think is, it is not without compassion.");
                break;

            case 1:
                printer.printNormal("'The Otherkin'... Indeed, it is other. It bears close resemblance to the angels and demons for often it takes interest in those of faith, yet how it acts, how it is able to act, show it clearly is neither.");
                printer.printNormal("There's something lonely in that, isn't there?");
                break;
                
            case 2:
                printer.printNormal("'The Stalking Corpse'... The most common name. Ever watching, ever frail. The flesh of it's arms bare of skin, it's body emaciated. Torn to expose the spine between the hip bone and rib cage.");
                printer.printNormal("All those things are horrific to gaze upon, yet worse is the face. It's neck is a stump, the head is disconnected, a floating upper skull with no jaw.");
                printer.printNormal("It's eyes were hollow. It had ridged two horns going back and slightly out, each forming a semi circle. The shape was entirely inhuman, almost a mix between a deer and a bird is how it's often described, though how this may appear is unknown to " + player.getName() + ".");
                break;
                
            case 3:
                System.out.println();
                break;
        }
        


        printer.printNormal("But there was always more to the beast within, after all it's quite ancient.");
        printer.printNormal("Just how many millenia old do you think it is?: ");
        int myAge = chooser.grabInt();
        printer.printNormal((myAge * 1000) + " years old... I would have said older.");
        printer.printNormal("As " + player.getName() + " made " + player.getObj() + " way to the woods remembering all those tales of " + myNames[myNameChoice] + ", " + player.getSubj() + " couldn't help but recall one of them more clearly than the others.\n");
        
        printer.printNormal("Once, long, long ago before the forest even had a name, a town was forming. A town that took the name...");
        printer.printNormal("Hmm, what was it's name again?: ");
        String townName = chooser.grabLine();
        printer.printNormal("Ah yes, " + townName + ". That's it. Well, " + townName + " was formed very long ago, when this land was near devoid of settlements.");
        printer.printNormal("They formed the town at the edge of the forest, in a small field. At the center of that town, the leader of this flock, was a priest, faithful and devout.");
        printer.printNormal("He was a good man, he believed the word of his book to the fullest, yet the whispering forest is so named for a reason.");
        printer.printNormal("As time went on, people changed. Crazy old men would claim to hear voices, some hunters would enter the woods and fail to leave.");
        printer.printNormal("Those that did slowly became the crazy old men.");
        printer.printNormal("Fancy a guess as to how many hunters went mad in the first ten years?: ");
        int falseMadness = chooser.grabInt();
        int trueMadness = falseMadness + 3;

        printer.printNormal(falseMadness + " is very close. The real number was " + trueMadness + ".");
        printer.printNormal("The priest was concerned about it for a long time, the subtle madness creeping into the town, and so he too entered the woods.");
        printer.printNormal("What lived within was surely not holy, but the light of Him was surely enough to drive back the shadow in the tress.");
        printer.printNormal("He dissapeared, gone like many of the hunters. The town saw the light fail him, and so they fell to despair, to darkness.");
        
        //the timeGap variable is to always ensure a large length of time, even larger based on the character's inputted age. The older the character, the more impossible the situation.
        int timeGap = age + 123;
        printer.printNormal("Yet time would pass, and so the people died. All that was remembered of the priest was his legacy,");
        printer.printNormal("until " + timeGap + "years passed. A man in tattered priest's robes.");
        printer.printNormal("He seemed to speak madness. There was a thing in the forest, more than a voice. A tortured form, one nigh impossible to describe.");
        printer.printNormal("It showed him things, changed the way he saw the light. He preached to cast away the book that shaped his whole life.");
        printer.printNormal("Obviously this was some trickster, some devious man who wanted to create fear. No one lives " + timeGap + " years.");
        printer.printNormal("Still, people learned to avoid the forrest. They found other means of resources. Whatever was in the forrest stayed within it. One had to seek out the creature.\n");
        
        
        
        
        
        //Variables introduced: sachelChange, foesBested, sachelPattern, and tavernChosen.
        System.out.println("~ ~ ~ Chapter 1 ~ ~ ~");
        //To keep the experience fresh each time, the sachel will always give a range of 10 - 23 coins. Once if/else statements are implemented, a shop can be too.
        int sachelChange = random.nextInt(13) + 11;
        printer.printNormal(player.getName() + " thought on this tale for a while, fear overcoming " + player.getObj() + " sense. The chill became a shiver.");

        printer.printNormal("It was a moment of weakness, but " + player.getName() + " considered leaving this journey, after all would it really be worth it to continue? (enter y/n)");

        yOrN = chooser.yesOrNo();

        if (yOrN.equals("n")) {
                printer.printNormal("No, " + player.getName() + " decided. " + player.getSubj() + " knew whatever lay ahead was not worth whatever lay ahead would be worse than all that had come before.");
                printer.printNormal("And so " + player.getName() + "'s journey ended before the start, likely for the best, for them at least. Of course, you've been robbed of a story, but you made that choice, as you've made so many others.");
                printer.printNormal("THE END");
                return;
        }

        printer.printNormal(player.getSubj() + " needed to take " + player.getPoss() + "mind off this, to focus on something else. 'The road. Look at the road'");
        printer.printNormal("Laying on the ground was a small sachel, something easily missed. Inside were " + sachelChange + " coins. Lucky isn't it? Left at almost the perfect spot.");
        printer.printNormal("It felt almost, too perfect. Here, at the edge of the forest. The old tales say it waits in the old woods, but what stops it from going anywhere else the trees grow?");
        printer.printNormal("Most discount such things existing, but not " + player.getName() + ". " + player.getSubj() + "'s seen too many supernatural beasts. Honestly they've become something of an enjoyable nuisance");
        printer.printNormal("It's to the point he lost track in fact. What was it, somewhere near 15 or 20?: ");
        int foesBested = in.nextInt();
        if (foesBested < 15) {
                foesBested = 15;
                printer.printNormal("No, that's too low. It must have been 15 then.");        
        } else if (foesBested > 20) {
                foesBested = 20;
                printer.printNormal("No, that's too high. It must have been 20 then.");  
        }
        printer.printNormal("Ah, " + foesBested + " is quite the resume. Will you see that number grow, or become meaningless? It's your choice.");
        
        System.out.println();
        System.out.println();
        printer.printNormal("Regardless, " + player.getName() + " collected the coins and continued on, pleased to see the coins.");
        printer.printNormal("They could be the difference between drowning, or pulling yourself out of the river with the rope barely cheap enough to purchase.");
        printer.printNormal("Looking further at the sachel left behind there was a symbol smudged onto it. The amount of tears make it a little tough to make out.");
        
        
        printer.printNormal("Was it a flower or a fox?: ");
        String[] sachelPattern = {"flower", "fox"};
        int satchelChoice = chooser.getChoice(sachelPattern);

        printer.printNormal("Of course. Everyone loves a good " + sachelPattern[satchelChoice] + ". " + player.getName() + "'ll have to check at one of the upcoming taverns if anyone lost it.");
        printer.printNormal("Speaking of, there's a few coming up isn't there? Yes, there they are just over the ridge. 'Finally, somewhere to rest my feet!'");

        printer.printNormal(player.getName() + " took a moment to reflect on " + player.getObj() + " condition.");
        player.printCondition();
        printer.printNormal("Which tavern would you like to visit, The Slumbering Mound, The Tortured Hog, or The Overflowed Mug? (Mound/Hog/Mug):");
        
        
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
                printer.printNormal("The Slumbering Mound, named for it's drowsy appearance. As " + player.getName() +" stepped into the establishment, nary a customer could be seen.");
           case 1:
                drinkPrice = 1;
                foodPrice = 3;
                printer.printNormal("Ah, The Tortured Hog, dirty, disgusting, and the pork is actually quite good from what I've heard.");
           case 2:
                drinkPrice = 4;
                foodPrice = 4;
                printer.printNormal("The Overflowed Mug, feeling expensive are we? More costly than the others, but certainly worth it for the quality. Well, I suppose they don't charge for the chairs if that's all you need.");
                printer.printNormal("Just to specify I mean sitting in the chair. You can't just take the chairs.");
        }
        
        
        //tavern intro
        switch (tavernChoice) {
           case 0:
                printer.printNormal("The barkeek was a short man, with whispy hair and an equally whispy beard too. Somehow he had bags under his eyes despite the fact " + player.getName() + "'s appearance woke them from their nap.");
                printer.printNormal("'Two coins a drink, 1 for  don't be picky, we ain't got much to choose.' the barkeep spoke through a yawn.");
                printer.printNormal("Responding with equal enthusiam, " + player.getName() + " said, 'Don't worry. My tastes are road worn, I don't need much.'");
                printer.printNormal("'Fine fine, just wake me up when you figure out what you want...' And with that the barkeep went back to sleep. 'Well, isn't he a charming fellow.'");
        
           case 1:
                printer.printNormal("Before " + player.getName() + " could even take a few steps through the door the barkeep shouted out 'Here for some pig? 3 coins. Pint's just a single coin though.'");
                printer.printNormal("Having a chance to properly get a look, " + player.getName() + " could see the barkeep was a strongly built woman in a bloodstained apron. A smirk came to " + player.getName() + "'s face.");
                printer.printNormal("'I take it the hog is fresh?'");
                printer.printNormal("'Everyday. Go ahead and sit down. Ain't a good rest stop if you don't. I'll grab yer grub when yer legs stop wanting you dead.'");
           case 2:
                printer.printNormal("Walking into the building, a comfortable air hit " + player.getName() + "'s face. Clearly this building was better built than most to retain heat in the fall.");
                printer.printNormal("'Welcome good patron! A pleasure to have you here. Curious to put your guts grumblings to end?' The barkeep was slightly better dressed than most in the area, better spoken too.");
                printer.printNormal("Shortcut hair, and slim, he was out of place in this wilderness, but the cordialness wasn't unwelcome in such unbroken forests.");
                printer.printNormal("A smile on " + player.getName() + "'s face, " + player.getSubj() + " responded, 'Not yet thank you, I'd rather take a moment to enjoy the lack of insects trying to crawl on me anytime I sit down.'");
                printer.printNormal("'Ah, well when you feel ready to take a drink or meal both cost four coins each. We import some quality beverages and meats.'");
        }


        //Getting food or drink

        printer.printNormal("Musing to " + player.getObj() + "self, " + player.getName() + " came to the conclusion, 'I probably could go for something. I have enough coins certainly.'");
        if (player.getHungry()) {
                printer.printNormal("'Should I get some food?' (y/n): ");
                yOrN = chooser.yesOrNo();

                if (yOrN.equals("n")) {
                        printer.printNormal("'Hmmm, no. I'm not that hungry. I can stand to just eat my rations.'");
                } else {
                        gold -= foodPrice;
                        switch (tavernChoice) {
                           case 0:
                                printer.printNormal("Walking up to the drowsy man, " + player.getName() + " tapped the counter and said 'Barkeep, one meat pie, please.'");
                                printer.printNormal("Blinking himself back to consiousness, he reached under the counter and pulled out a barely not rotten mush in some sorry excuse for crust.");
                                printer.printNormal(player.getName() + "'s nose wrinkled in disgust. 'Not very fresh I see...'");
                                printer.printNormal("'Well, I said not to be picky. Thanks for the gold, I'll be asleep if you need me.'");
                                player.eat();
                                break;

                           case 1:
                                printer.printNormal("'I'll take you up on that fresh hog now.'");
                                printer.printNormal("'Ah, you'll find the skin scorched and seasone, with flesh juicy.'");
                                printer.printNormal("Pleased, " + player.getName() + "answered with 'A proper meal in lands like these. I'll dig in right away.'");
                                printer.printNormal("'A pleasure serving you.'");
                                player.eat();
                                break;

                           case 2:
                                printer.printNormal("'Your food is expensive. I'm eager to see if it's worth the price.' " + player.getName() + " said with a grin.");
                                printer.printNormal("'Right away friend, chicken or beef?' '...Chicken.' 'Right away then.'");
                                printer.printNormal(player.getName() + " took their time to enjoy the atmosphere of the place for a moment. The chairs were cushioned, rare in these parts. The floor didn't creek, in fact the door was spotless.");
                                printer.printNormal("As the tavern owner brought the food, " + player.getName() + " couldn't help but ask, 'Out of curiousity, how do you even afford to keep this place this nice? I can't imagine you get much business.'");
                                printer.printNormal("'Oh you'd certainly be surprised. The Whispering Woods are notoriously supernatural, and that attracts all sorts, often in groups. There was a fellow who looked to be of the magical sort, a wizard or warlock basically.'");
                                printer.printNormal("'I assume they were trying to capture or negotiate with " + myNames[myNameChoice] + "?'");
                                printer.printNormal("'That'd be my guess. Didn't ask. Simply accepted my payment and let the spooky fellow on their way. Normally it's a sad thing to lose one to the woods, but he seemed on the darker path of life.'");
                                player.eat();
                        }
                }
        }

        if (player.getThirsty()) {
            printer.printNormal("'Should I get something to drink?' (y/n): ");
                yOrN = chooser.yesOrNo();

                if (yOrN.equals("n")) {
                        printer.printNormal("'There's still plenty of drink in my canteen, best to save my coin for a shop.'");
                } else {
                        gold -= drinkPrice;
                        switch (tavernChoice) {
                           case 0:
                                printer.printNormal(player.getName() + " went to the counter and said 'Mind if I try the ale?' startling the raggedy coot awake.");
                                printer.printNormal("'Sure, sure, whatever.' Reaching down he grabbed a glass and poured out possibly the most vile liquid imaginable.");
                                printer.printNormal("'Perhaps... I'll look for a river later.'");
                                printer.printNormal("'Well, no refunds. I'll be sleeping here if you need something.'");
                                break;
                                
                           case 1:
                                printer.printNormal("'The food here is obviously well made,' " + player.getName() + "said with a question in her voice, 'but what of the drink?'");
                                printer.printNormal("'Not much of a brewer, more a butcher, so it's nothin special. Still, a good drink before you head on your way seems something you'd want. You're type are always on their way to the Whispering Woods. Trust me when I say a drink here is better than any you'll find out there.");
                                printer.printNormal("Curiosity filling " + player.getObj() + " mind, " + player.getName() + " couldn't help but ask for an expanation as the drink was passed along the table. Just a simple ale, the standard for bars such as this.");
                                printer.printNormal("'Well what do you think I mean? The water's... wrong in the woods. I've heard stories that the closer you get to the center, the more red the water becomes until, well, until it isn't water anymore.'");
                                printer.printNormal("'Look, I haven't traveled through those woods myself. I steer clear of the deeper ends. But I've seen people either come through here and never return, or turn tail once things start getting ominous. At first I'd warn people off the bat, but no one listens. So I don't warn, I do what I can to prepare them with a good rest, good fresh meat, and a lasting drink.'");
                                printer.printNormal("The barkeeps face seemed troubled as she spoke, years of watching people willingly walk to their presumed deaths does that to someone.\n");
                                printer.printNormal("After a moments silence, " + player.getName() + " responded. 'I thank you for the warning. You're right. I'm going to explore those woods and find whatever lives within them. But you should know, I'm not coming here out of arrogance. I've seen monsters and unnatural places before. I don't intend to be another lost soul.'");
                                printer.printNormal("It was clear from her eyes, the barkeep had no faith in that claim. Hope for such things had faded from her long ago, all remained was a desire to enjoy what time was left.");
                                player.drink();
                                break;

                           case 2:
                                printer.printNormal("'So, you speak highly of your drinks, what do you serve that makes your ale so much better?' " + player.getName() + " asked, as an almost smug look took over the establishment's owner.");
                                printer.printNormal("'The simple answer is, we don't.'");
                                printer.printNormal("'I beg your pardon?' " + player.getName() + " responded, quite a bit taken aback by a frankly outlandish notion in these parts, before recovering " + player.getObj() + "elf.");
                                printer.printNormal("'We serve wine, a good year too. Tell me how you enjoy it once you finish,' the owner said as he poured the glass and passed it along. The glass had a nice design of an apple tree.");
                                player.drink();
                                printer.printNormal("Taking a long sip, " + player.getSubj() + " had nothing to say except 'very well brewed.");
                        }
                }
        }



        System.out.println("~ ~ ~ Chapter 2 ~ ~ ~");

        printer.printNormal(player.getName() + " took a good while in " + taverns[tavernChoice] + ", resting for the upcoming travels. Eventually " + player.getSubj() + " got up and simply walked out the door, off to the next leg of the adventure.");
        printer.printNormal("Unfortunately, the nature of time is that it passes, whether you need it too or not. The morning sun had reached it's apex and become that of the noon sky. No more time for dilly dallying."); 
        printer.printNormal("If the goal is reaching the heart and discovering what it is, then best not to wait too long.\n");

        printer.printNormal("Fearless as ever, the journey began again. Step by step, fallen branches crunched underfoot, the verdant green of the trees a welcome shade from a sun doing its best to still shine through.");
        printer.printNormal("Upon the forest floor it created a patchwork design of shadow and light, almost like a stained glass painting.");
        printer.printNormal("Often " + player.getName() + " would come to contact with a strange stream that seemed to wind and circle back on itself noticably, based simply on how many times it crossed " + player.getPoss() + " path. It crossed " + player.getName() + "'s mind that perhaps there's more to it.");
        printer.printNormal("Will you peer closer into the water? (y/n)");
        yOrN = chooser.yesOrNo();
        if (yOrN.equals("y")) {
                printer.printNormal("Curiousity is a wonderful thing, but it's rewards can be... interesting. The water was slightly murky at it's bottom, but beyond that was something concerning.");
                printer.printNormal("Where are the fish?");
                if (player.getThirsty()) {
                        printer.printNormal("Despite the concern creeping into " + player.getPoss() + " mind, it was undeniable the thirst that plagued " + player.getObj() + ". Surely it would be fine to quench the thirst with this river, certainly better here at the outskirts.");
                        printer.printNormal("Partake in the stream? (y/n)");
                        yOrN = chooser.yesOrNo();
                        if (yOrN.equals("y")) {
                                printer.printNormal("Cupping " + player.getPoss() + " hands, " + player.getName() + " brought the water to " + player.getPoss() + " mouth.");
                                printer.printNormal("The water tasted peculiarly clean of dirt, yet the faintest hint of iron is there. Looking closer, " + player.getName() + " noticed a slight pink hue to the... 'This water is not clean.'");
                                player.drink();
                        } else {
                                printer.printNormal("Mystic forest rivers often bear curses. This one has already shown peculiarities, best not to risk it.");
                        }
                }
        } else {
                printer.printNormal("It's a river in a mystical forest, looking into it will do nothing but disquiet you.");
        }

        System.out.println("\n");
        printer.printNormal("Keeping pace onwards, hours passed. Yet, in the distance a hooded figure could be seen. " + player.getName() + " kept on guard, knowing the risk of a stranger in this setting.");
        printer.printNormal("As " + player.getName() + " approached, the figure didn't move. They simply waited for " + player.getName() + " to approach.");
        printer.printNormal("'Greetings stranger, its an odd place you've chosen to stand. Even as a foreigner I know the tales of these woods. Are you lost, do you need help out?'");
        printer.printNormal("As " + player.getSubj() + " spoke to the hooded figure, " + player.getSubj() + " took the time to look closer. He was frail, and though the hood shrouded most of the face the mouth could be seen clearly.");
        printer.printNormal("It looked sickly, pale and cracked, though curled in a smile. In an aged voice he spoke.");
        printer.printNormal("Lost? No... Or perhaps I am? I suppose it depends on how one wishes to define, 'lost'. I would prefer to define myself as merely... taking a parallel path.");
        printer.printNormal("He raised his head as he spoke, revealing empty eye sockets and hollow cheeks. With his toothy grin, his face looked nearly like a skull if not for the nose still attached.");
        printer.printNormal("Unphased, or simply knowing better than to draw attention to the peculiarity, " + player.getName() + " simply responded, 'If that's what you would prefer. Tell me, how long have you been in these woods?'");
        printer.printNormal("Oh, not too long. Though I suppose it's easy to lose track of time when one's having fun! Say, have you seen the purple flowers that grow near the water further in?");
        printer.printNormal("'It's my first visit into these woods, I can't say I have.'");
        printer.printNormal("That's alright. I haven't either!");
        printer.printNormal("He gave a hearty chuckle that seemed to hurt him as his laughs turned to bloodied coughs.");
        System.out.println();
        
        printer.printNormal("It had become clear to " + player.getName() + " that this was one of the one's who'd gone mad wandering too long in the forest. Of course the stories neglected to mention the removal of the eyes. Because why would they mention important details like that?");
        printer.printNormal("'Sir, I think you need to leave this place, immediately.'");
        printer.printNormal("Oh, but I'm still searching! 'Searching?' Why yes, I lost some things, there was something quite beautiful to them...");
        printer.printNormal("Thinking a moment, an idea struck " + player.getName() + ". 'Could this be one of the things you're searching for?");
        printer.printNormal("As " + player.getSubj() + " pulled out the satchel they found so many hours before, the old man held out his hands to grasp it.");
        
        if (satchelChoice == 0) {
                printer.printNormal("...No. No this is not it. You've already passed Miles on your journey I'm afraid to say, you will not find what I seek for now.");
        } else {
                printer.printNormal("Ah, so you've found it! Such a beautiful thing, a two tailed fox. So much nicer than a nine tailed one wouldn't you say? Too cluttered, those ones. But there's a genius to simply, two.");
                printer.printNormal("'So that's what it was meant to be?' " + player.getName() + " asked, intrigued about the original design of the faded artwork.");
                printer.printNormal("Indeed. The piece is only a mimicry though, I could never truly replicate the soul of the original no matter how hard I tried. Though I like to think I gave it one of its own. Thank you " + player.getName() + ", I've waited for someone to bring the right gift for so very long.");
                printer.printNormal("'You're welcome stranger, it's an honor to help... How do you know my-'");
        }
        printer.printNormal("With that the old man left chuckling again. Whatever lives in this forest is certainly strange, the forces definitively unnatural. But one thing stays true, where there is day there is night. It's time to set up camp.");


        //Chapter three, set up camp, go into the woods searching for drier branches, find a dead rabbit if you go one direction, find no branches and go further in a chosen direction, encounter a creature with varying stats based on direction gone, need to somehow evade the creature.
        //If it's thirsty, you can outrun it, if it's injured, you can kill it. If hungry, you need to use the dead rabbit or fight it off, but it'll attack you back, making it run off but deal damage to you.

        System.out.println("~ ~ ~ Chapter 3 ~ ~ ~");
        String[] twoWayPath = {"South", "West"};
        int twoWayPathChosen;

        String[] threeWayPath = {"South", "West", "North"};
        int threeWayPathChosen;

        String[] encounterChoiceStrings = {
                "Attempt to distract it with food",
                "Try to outrun it, you have an axe at your camp.",
                "Use a solid piece of wood as a club.",
        };

        int encounterChoice;

        boolean haveRabbit = false;

        BasicEnemy firstEncounter = new BasicEnemy();


        printer.printNormal("'Finally. It took time, but the tent is set up. Now, about the fire, I'd rather not be lost to darkness in these woods. It's only an hour or two before nightfall. The old cook proves these woods aren't safe, even here barely in.'");
        printer.printNormal("Looking around nearby, " + player.getName() + " realized they'd made a grave mistake. 'These branches aren't even close to dry... But they look so gnarled! Hmm, I'll have to look elsewhere for branches.'");
        printer.printNormal("'Well... I'd rather avoid treading too far ahead of the camp, and I don't think moving closer to the river will get me drier branches. That leaves south and west according to the compass. '");
        twoWayPathChosen = chooser.getChoice(twoWayPath);

        System.out.println();
        switch (twoWayPathChosen) {
            case 0:
                //south
                printer.printNormal(player.getName() + "walked back the way " + player.getSubj() + " came, carefully examining it. Yet so close to the water, nothing could be found.");
                printer.printNormal("'Ugh, the river still hasn't wound far enough away for the branches to properly dry...'");
                printer.printNormal("'Okay. I need to reassess my options... Go further south since the river does curve outward, head back north and just be a bit less stingy on what qualifies, or go west, directly away from the water.");
                break;
            case 1:
                //west
                printer.printNormal(player.getName() + " moved west, hoping that by increasing " + player.getPoss() + " distance from the water, the trees would hopefully be less alive.");
                printer.printNormal("Unfortunately there was something else dead too.");
                printer.printNormal("'Oh, poor little rabbit... It looks like you hit your head on this rock, jagged rock too... You must have been pretty scared of whatever was behind you to run this fast.'");
                printer.printNormal(player.getName() + " took the young rabbit's carcass, careful not to waste nature's gift. The meat hadn't begun to rot.");
                haveRabbit = true;
                printer.printNormal("'Ugh, the river still hasn't wound far enough away for the branches to properly dry...'");
                printer.printNormal("'Okay. I need to reassess my options... Go south since the river does curve outward and the woods are possibly less mystically enchanced, head north and see if this is a forest where the further in the faster plants wither, or go west further west, trying to get away from the water.");
                break;
        }

        threeWayPathChosen = chooser.getChoice(threeWayPath);

        switch (threeWayPathChosen) {
            case 0:
                //south
                firstEncounter.makeThirsty();

                printer.printNormal("Filler");
                break;
            case 1:
                //west

                printer.printNormal("Filler");
                firstEncounter.makeInjured();
                break;
            case 2:
                //north

                printer.printNormal("Filler");
                firstEncounter.makeHungry();
                break;
        }

        //Meet the creature.
        printer.printNormal("Filler");
        firstEncounter.printCondition();
        encounterChoice = chooser.getChoice(encounterChoiceStrings);

        switch (encounterChoice) {
            case 0:
                //Distract
                if (haveRabbit) {
                        if (firstEncounter.getHungry()) {
                                printer.printNormal("filler");
                        } else {
                                printer.printNormal("Filler");
                                player.makeInjured();
                        }
                } else {
                        printer.printNormal("Filler");
                        player.makeInjured();
                }
                break;
            case 1:
                //Outrun
                if (firstEncounter.getThirsty()) {
                        printer.printNormal(player.getName() + " tried to run, tried to get away as swiftly as possible. But the creature was able to catch up eventually.");
                        printer.printNormal("It caught up to " + player.getName() + " at a bank of the river, the woods all look so similar, it's easy to get a little lost.");
                        printer.printNormal("It seemed intent to claw at " + player.getPoss() + ", but upon hearing the water seemed to cry out in a distorted version of joy. " + player.getName() + " stepped aside, allowing the thing to move past towards the river.");
                        printer.printNormal("As it drank from the water, desperately and eagerly as if it hadn't drunk in days, " + player.getObj() + " crept up behind. Then " + player.getObj() + " kicked it into the water, quickly, cleanly. No fight, no injury.");
                        printer.printNormal("There was no splash, and there was no clawing to get out of the water. The thing simply drifted downstream.");
                } else {
                        printer.printNormal(player.getName() + " tried to run, tried to get away as swiftly as possible. But the creature was able to catch up eventually.");
                        printer.printNormal("It caught up to " + player.getName() + " at a bank of the river, the woods all look so similar, it's easy to get a little lost.");
                        printer.printNormal("It clawed at " + player.getPoss() + " back, tearing the flesh. " + player.getName() + " couldn't help but scream, but a scream does not mean defenselessness.");
                        printer.printNormal("'CLAW THIS YOU HANDSY CRETIN!' " + player.getObj() + " cried as " + player.getObj() + " spun back and pulled then pushed the creature into the water they stood just at the edge of.");
                        printer.printNormal("There was no splash, and there was no clawing to get out of the water. The thing simply drifted downstream.");
                        player.makeInjured();
                }
                break;
            case 2:
                //Fight
                printer.printNormal(player.getName() + " grabbed one of the sturdy pieces of wood, carefully to avoid a fight or flight response from the thing, then swung down hard on the creatures skull.");
                firstEncounter.makeInjured();
                if (firstEncounter.getDead()) {
                        printer.printNormal("The already existing crack ruptured. Despite having a newly made concave head it didn't die immediately.");
                        printer.printNormal(player.getName() + " recoiled and covered " + player.getPoss() + " ears as the creature let out a blood curdling cry, a piercing wail as the soul within left the body.");
                        printer.printNormal("'So the deathless can die...'");
                } else {
                        printer.printNormal("The clump of wood certainly cracked the skull. It cracked itself too.");
                        printer.printNormal("'Oh for the love of-' The creature grabbed " + player.getName() + " and tried to bite down hard on the neck.");
                        printer.printNormal(player.getName() + " was able to use the creature's momentum against them, slamming them both onto their sides, hitting a section of exposed rock on the ground. The brunt hit the creature, but enough hit " + player.getName() + " so that it caused some serious damage.");
                        printer.printNormal("The force was enough to dislodge " + player.getName() + ", enough to stun the creature so " + player.getObj() + " could get away unnoticed, but not unbruised.");
                        player.makeInjured();
                }
                break;
        }

        //Describe the walk back to the camp
        printer.printNormal("Filler");


        if (haveRabbit) {
                printer.printNormal("Unfortunately, as they went to rest in their tent, " + player.getName() + " failed to hear the rustle from the underbrush. Blindness heightens the senses, including smell. Dead rabbit is quite pungent, isn't it?");
                printer.printNormal("THE END");
        } else {
                printer.printNormal(player.getName() + " laid their head to rest, content to dream for this one night. Quite the escapade they'd already been on, quite the escapade indeed.");
                printer.printNormal("Sadly, this is where your part of the voyage ends, for now. I look forward to seeing you again. But with that said, TO BE CONTINUED.");
        }

        return;
    }
}
