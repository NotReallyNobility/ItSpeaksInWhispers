# "It Speaks In Whispers"
A short text based adventure, with four endings.








## Installation/Set-up

Use the "JavaCodingPack" to install visual studio code with the required java dependencies if you don't have it already. This will allow you to open Main.java within visual studio code and run the program. 



## Usage

To run the program, look in the top right for a play arrow, then drag the terminal into full screen mode. This will allow you to now play the game. To interact, click the terminal when prompted for a response and type one of the presented options.






## Features


### Prolouge

4 methods
    int getChoice(String[] list, Scanner temp) at line 8. Allows the user to input a number to choose from a list of items, returning an int to serve as the index variable for that list.

    int getChoice(String[] list, Scanner temp, boolean hidden) at line 25. An overload of the previous method, for when there's a secret final choice.

    printOptions(String[] list, boolean hidden) at line 55. It is used in the previous two methods to print the options the user can choose, hiding the final option if hidden is true.

    printCondition(boolean hungry, boolean thirsty, boolean injured) at line 70. It's used during points where the character assesses their condition, working as a way to remind the player how they're doing during points that condition can change.



Related arrays relating to the characters gender at lines 111 through 113, and line 116

calls the getChoice method at line 118

If statement for if inputted age is too low at line 127

If else if for age flavor text determined by character age at line 140

calls the overload of getChoice at line 166 to get the creature's name, with the true name being a hidden fourth choice



### Chapter 1
Chapter 1 has the character go to a tavern and rest, possibly drinking or eating.

if else if loop for getting the foes bested within range of 15 and 20 at line 218

calls getChoice at line 250 to present the possible tavern choices

switch case statement to get the proper greeting for each tavern at line 253 and 271

A pair switch case statements at lines 310 and line 355 for if the character eats or drinks.

Though the player does not alter the contents of the arrays, they do alter which part of the array is used within the game.






## Future Improvements

The game will have four alternative chapters possible in one run, one of which being the final ending, accessible only by learning secrets hidden in the other three endings. The blinded fox shall speak the creature's true name. The dismembered echidna knows the creature's true role. The cracked egg knows the creature's true goal.

The creature knows you're there.