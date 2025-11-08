# "It Speaks In Whispers"
A short text based adventure, with four endings.








## Installation/Set-up

Use the "JavaCodingPack" to install visual studio code with the required java dependencies if you don't have it already. This will allow you to open Main.java within visual studio code and run the program. 



## Usage

To run the program, look in the top right for a play arrow, then drag the terminal into full screen mode. This will allow you to now play the game. To interact, click the terminal when prompted for a response and type one of the presented options.






## Features
It currently holds three classes outside of Main.
1. Choice: It stores methods for printing out and returning variables related to the multiple choices in the program.

2. Character: The basis for a character, including basic info as if they're alive, injured, hungry, or thirsty. It can also alter and get those values. It holds two constructors, one where the values can be shifted as desired, and an empty constructor where the character is fully healthy.

3. Player: An extension of the Character class adding the variables for the players chosen gender as well as their name. The gender choice can be set but not retrieved. The players name and pronouns are able to be returned as strings through "get" methods. "printCondition()" is used to print the players conditions, stating if they're hungry, thirsty, and/or injured.

### Prolouge

If statement for if inputted age is too low at line 34

If else if for age flavor text determined by character age at line 47

calls the overload of getChoice at line 73 to get the creature's name, with the true name being a hidden fourth choice



### Chapter 1
Chapter 1 has the character go to a tavern and rest, possibly drinking or eating.

if else if loop for getting the foes bested within range of 15 and 20 at line 147

calls getChoice at line 179 to present the possible tavern choices

switch case statement to get the proper greeting for each tavern at line 182 and 200

A pair of yes or no question using the yesOrNO() Choice method at lines 226 and 264

A pair switch case statements at lines 232 and line 270 for if the character eats or drinks.

Though the player does not alter the contents of the arrays, they do alter which part of the array is used within the game.

### Chapter 2
Chapter 2 has the character wander through the forest after leaving the bar. They encounter a river which they can choose to peer into. If they didn't drink at the bar, they can drink from the water.

After this they encounter an eyeless man who's dialog is different based on which satchel design they chose, leading them to the idea that there is a right choice.




## Future Improvements

The game will have multiple endings based on how many of the secrets they unlock, which should grow progressively more difficult. If possible, it would be nice to make the text output at a somewhat steadier pace, easier to read and keep track of.


The creature knows you're there.
