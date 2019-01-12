# A-Dice-Game-That-is-Hard
Exercise from Introduction to Java Programming and Data Structures by Y. Daniel Liang. 
Class: INTRO TO PROGRAMMING 

6.30 - (no input needed, output is done via command window) Follow the rules for the game as outlined below and in the book. You MUST have at least one method that is called rollDie() that emulates the roll of ONE die. You will have to call this method many times throughout your program. You can use many more methods as you see fit.

Role dice
If you role:
- 2, 3, or 12 you lose
- If you role 7 or 11 you win
- If you role 4, 5, 6, 8, 9, 10 you store the total value of the two die rolled as point, this point will not change with the next roles (ex. if you initially rolled a 2 & 3 then "point" is equal to 5)
   - Continue to roll the dice until you either roll a 7 and you lose
or you role the value of the point (in the example in step 3 that would be 5) and you win.
