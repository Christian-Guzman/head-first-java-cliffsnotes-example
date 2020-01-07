# Trip to Objectiville

## Table of Contents

- Inheritance 
- Overriding methods
- What's in a class?
- Making your first object
- Using main()
- Guessing Game code

## Inheritance
- We need different shapes that rotate and play a sound.
- Subtracted the common feature and put them into a new class called Shape.
- Superclass is Shape
    ```java 
    public class Shape{
        
    }
    ```
- Subclasses are Square, Circle, Triangle, Amoeba, and Rectangle.
- You can read this as, "Square (or circle etc..) inherits from Shape"
    ```java
    // subclass is square for this example
    public class Square extends Shape{

    }
    ```
- Shape has a 2 methods, rotate() and playSound()
- The subclasses inherit from both methods. Giving both the same functionality.

## Overriding Methods

- How can the Amoeba rotate different if it inherits its functionality from Shape?
- The Amoeba class overrides the methods of the Shape class. 
- It overrode by redefining one of its inherited methods when it needs to change or extend.
- Then the JVM knows exactly how rotate()

## What's in a class?

- When creating a class, think about the objects that will be created from that class type.
- What does the object know and do.
- What the object knows about itself is called 'Instance Variables'.
- Things the object can do are called 'Methods'.

### Instance Variables and Methods.

- Instance Variables represent an objects state and can have unique values for each object of that type.
- Methods are things you would want to operate on that data.
- Ex: Alarm clock has an instance variable of 'alarmTime' and 2 methods 'getting' and 'setting' the 'alarmTime'.

### Difference between a Class and an Object

- A class is not an object but is used to construct them.
- Class is a "blueprint" for an object. It tells the virtual machine how to make an object of that type.
- Each object can have its own values for the instance variables of that class.
- Ex: You might want to make 10 different buttons (each button being an object) and each button might have its own color, size, shape, and label (each variable being an 'instance variable')

## Making your first Object

- Need two classes.
- One for the type of object you want to use (ex: Dog, AlarmClock, Television)
```java
    class Dog{
        // instance variables
        int size;
        String breed;
        String name;

        void bark(){
            System.out.println("ruff Ruff");
        }
    }
```
- Another class to test your new class. 
```java
    class DogTestDrive {
        public static void main (String[] args){
            // test code goes here
        }
    }
```
- Tester class is the where you put the main method.
```java 
    class DogTestDrive {
        public static void main (String[] args){
            Dog d = new Dog();
            // sets the size of the dog
            d.size = 40;
            // calls the bark method
            d.bark();
        }
    }
```
- In that main method you created you can access objects of your new class type with the dot operator (ex: `d.size` or `d.bark()`)

## Using Main()

- Two uses of Main(); Test your real class and to launch/start your java application.

## Guessing Game

- Contains 3 classes corresponding with the file name.
- GameLauncher class is where the application starts. It contains the main() method.
```java
    public class GameLauncher {
        //Main() method
        public static void main(String[] args) {
            // New GuessGame created 'game'
            GuessGame game = new GuessGame();
            // Calls the GuessGame object game's startGame() method
            game.startGame();
        }
}
```
- Player class contains one instance variable 'number'
```java
    public class Player {
        int number = 0;
    }
```
- Player also contains a guess() method where a number is guessed between 0 - 9 (Math.random is exclusive)
```java
    public class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
```
- GuessGame Class has 3 instance varaibles each corresponding with a player.
```java
    public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    }
```
- Creates 3 Player objects and assigns them to the instance variables
```java
// startGame() method created 
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        // 3 new variables declared to keep count of guesses per player
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        // 3 new variables declared to keep track if the the player is right or not
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        // The number that is supposed to be guessed (Target Number)
        // Math.random exlusive. Randomly chooses a number between 0-9
        // and bounds that number to targetNumber
        int targetNumber = (int) (Math.random() * 10);
        // prints out in a new line 
        System.out.println("I'm thinking of a number between 0 and 9...");
    }
```
- While loop is implimented so that anything inside it runs as long as while is true.
```java 
    while (true) {
            System.out.println("Number to guess is " + guessp1);
            /// calls each players guess() method
            p1.guess();
            p2.guess();
            p3.guess();
            /// binds the players guesses to the number returned from their guess() method
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);
            // checks for validation using conditionals if and else
            // validation being if x player's number is equal to the targetNumber
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            // this if below is equavalent to the if's above 
            // Double pipes || is equal to using or.
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is Over");
                // break is telling the loop to end
                break;
            // the else is saying if the if statements are not true do what is in the else block.
            } else {
                System.out.println("Players will have to try again.");
            }

```