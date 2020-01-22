# A Quick Dip

## Table of Contents

- How does Java work?
- How should Java code be structured?
- What is the anatomy of a class?
- The main() method.
- Looping.
- Conditional Branching.
- Coding the "10 milk bottles" app.


## How does Java work?

- Java works by creating a source document (where some of the code will go).
- Document is ran through a source code compiler. It checks for errors and wont let you run until it's satisfied.
- The compiler creates a new document coded into Java byte-code.
- A Java virtual machine (JVM) interprets compiled Java binary code (called bytecode) for a computer's processor so that it can perform a Java program's instructions.

## How should Java code be structured

- Source code file holds one class definition. The class represents a piece of your program. The class must go within a pair of curly braces.
    ```java
    public class MyFirstApp { }
    ```

- A class can have one more or methods they must be declared inside the class.
    ```java
    public class MyFirstApp{
        public static void main(String[] args){

        }
    }
    ```
## What is the anatomy of a class?

- Everything runs between the curly braces { } of your main method. Every Java application has to have at least one class, and at least one main method (one main() per application).

    ```java
    public class MyFistApp{ 
        public static void main (String[] args){
            System.out.print("I Rule!")
        }
    }
    ```

## The main() method

- Running a program means telling the Java Virtual Machine(JVM) to "load the MyFirstApp class, then start executing its main() method. Keep running 'till all the code in the main is finished."
- There always has to be a main() method.
- The main() method is where your program starts to running.
- You can say anything inside the main() method; Statements, Loops, Branching etc..
    ```java
    public class MyFirstApp{
        // Main() Method
        public static void main(String[] args){

        }
    }
    ```

## While Looping

- As long as the condition is true you do what is inside the block.
```java
    while(true){
        break
    }
```
- Conditional test comes out as a boolean value, true or false.
```java 
    // condition is going to check the 'truthness' of `christianIsAwesome`
    // if it's true the block gets ran otherwise it doesn't.
    while(christianIsAwesome){
        all.dance()
    }
```

## Conditional Branching

- the If conditional is similar to the while condition. 
- Instead of saying "while theres still daylight" it's "if there is still daylight".
```java
    class IfTest {
        public static void main (Stirng[] args){
            int x = 3;
            // this is saying 'if' x is equal('==') to 3 run that block
            // If its not the block doesn't get run and the next line outside the block is ran
            if (x == 3){
                System.out.println("x must be 3");
            }
            System.out.println("This runs no matter what")
        }
    }
```

## 10 Bottles of Milk

- an application that prints out starting from 10 the amount of bottles left.
- each iteration (loop) a bottle is substracted and then the same lines print out.
```java
// Class MilkBottles
public class MilkBottles {
    // main() method
    public static void main(String[] args) {
        // new int variable 'milk' is declared
        // milk is bound to 10
        int milk = 10;
        // new string variable 'word' is decaled
        // word is bound to the string "bottles"
        String word = "bottles";
        // while milk is greater than 0 run this block
        // while checks for the truthness in that condition
        while (milk > 0) {
            // if the milk variable is equal to 1 run this block 
            if (milk == 1) {
                word = "bottle";
            }
            // this is run either way as long as milk is greater than 0
            System.out.println(milk + " " + word + " of milk on the wall");
            System.out.println(milk + " " + word + " of milk");
            System.out.println("take one down.");
            System.out.println("Pass it around.");
            // milk then is subtracted by 1 
            milk = milk - 1;
        }
        // this is ran if milk is no longer greater than 0
        System.out.println("NO MORE MILK!!");
    }
}
```