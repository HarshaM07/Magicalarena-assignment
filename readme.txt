#Magical arena

This is a simple java implementation of the Magical arena game.

#Description
This project demonstrates a simple battle simulation between two players (PlayerA and PlayerB) in a magical arena. 
Each player has attributes such as health, strength, and attack power, and they engage in combat until one player's health drops to zero

#requirements
Java Development Kit(JDK)
Eclipse IDE
Junit 4

#Project Structure
src/assignment/java (main.java)
src/test/java (Playertest.java and MagicalArena.java)

=>To import the project into Eclipse:
1. Open Eclipse IDE.
2. Select "File" -> "Import" -> "Existing projects".
3. Browse to the project directory and select it.
4. Click "Finish".

## How to Run

To run the game, follow these steps:

Run the 'Main.java'(src/main/java) file as a Java application to start the game.

Right click on Main.java class => Run as => select Java Application

## How to Play

1. Two players are created with initial attributes (health, strength, and attack).
2. Players take turns attacking and defending.
3. Each player rolls a 6-sided die for attack and defense.
4. Damage is calculated based on the dice rolls and player attributes.
5. The game continues until one player's health reaches 0.


## Unit Tests
Unit tests are provided to ensure the correctness of the code. JUnit 4 and Hamcrest libraries are used for testing.

##Steps to do Unit Testing:
Right click on Testing class Name => Run as => select Junit Test Case =>It will show Unit Test cases

