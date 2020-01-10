# How Objects Behave

## Table of Contents
- Methods use object state (bark different)
- Method arguments and return types
- Pass-by-value (the variable is always copied)
- Getters and Setters
- Using References in an array

## Methods use object state
### You can send things to a method
- You can pass values into your methods
- Ex: Tell a dog to bark 3 times

d.bark(3);

- Method used parameters. A caller passes arguments.
- Arguments are things you pass into methods (values like: 2, "foo", or a reference to a Dog)
- Parameter is nothing more than a local variable. A variable with a type and a name, that can be used in the body of the mothod
1. Calling the bark method on the Dog reference and passing the value 3 as an argument
Dog Reference >> Dog d = new Dog();

d.bark(3) >> 3 is the arguement that is being passed.

2. Using the numOfBarks Parameter as the variable in the method
```java
// numOfBarks is the parameter (variable)
    void bark(int numOfBarks){
        // if 3 is the value that is passed through this method that means numOfBarks is equal to 3
        while (numOfBarks > 0){
            System.out.println("ruff");
            numOfBarks = numOfBarks - 1;
        }
    }
```

### You can get things back from a method
- Methods can return values unless they are made with a void return type, meaning they don't give anything back.
void go(){

}
- We can declare a method to give a specific type of value back to the caller.
int giveSecret(){
    return 42
}
- The int value 42 is then returned.
- You must return a value that is "compatible" with the declared type!

### You can send more than one thing to a method
- Methods can have multiple arguments
- Comma seperated when declared and passed
- The arguments passed have to be of the same type and in right order.
1. Calling a 2 pararmeter method, and sending 2 arguments.
```java
    void go() {
        TestStuff t = new TestStuff();
        t.takeTwo(12, 34);
        // the arguments being passed (12, 34) land in the method in the same order that they are passed
    }
    // x is now equal to 12, and y to 34 because of the order they were passed in
    boid takeTwo(int x, int y) {
        int z = x + y;
        System.out.println("Total is" + z);
    }
```

2. You can pass variables into a method, as long as that variables type matches the parameter type.
```java
    void go(){
        int foo = 7;
        int bar = 3;
        t.takeTwo(foo, bar);
        // here foo's and bar's type is an int
    }

    void takeTwo(int x, int y){
        // foo and bar match the type of the parameters
        int z = x + y;
        System.out.println("Total is" + z);
    }
```

## Pass by Value
1. An int variable 'x' is declared and assigned 7
int x = 7;

2. Method is declared with an int type pararmeter named 'z'.
void go(int z) {}

3. Method go() is called, passing the variable int 'x' as the argument. After being passed x is coppied into z. So x = z

foo.go(x);
- x is equal to 7

void go(int z){}
- z is 7

4. Even if the value of z is changed x stays its original value

## Getters and Setters

- Better known as Accessors and Mutators
- Getters = purpose is to send back, as a return value is the value of whatever "Getter" was getting.
- Setters take an argument value and use it to set the value of an instance variable.
- Can't use your instance variables for the dot operator.
theCat.Height = 27;
```java
    class ElectricGuitar{
        // declared variables with types
        String brand; 
        int numOfPickups;
        boolean rockStarUsesIt;
    
        String getBrand(){
            return brand;
        }
        void setBrand(String aBrand){
            brand = aBrand;
        }
        
        int getNumOfPickups(){
            return numOfPickups;
        }
        void setNumofPickups(int num){
            numOfPickups = num;
        }
        boolean getRockStarUsesIt(){
            return rockstarUsesIt;
        }
        void setRockStarUsesIt(boolean yesOrNo){
            rockStarUsesIt = yesOrNo
        }
    }
```

## Encapsulation
- Instance variables are exposed with the dot variable
theCat.height = 27;

- Building setter methods is how being exposed to the dot operator be avoided
```java
    public void setHeight(int ht){
        if (ht > 9){
            height = ht;
        }
    }
```
- This works by using either the public or private access modifiers
- Mark Instance variables as `private` and provide `public` getters.
```java
    class GoodDog{
        // makes the instance variable private so it can't be changed through a dot operator
        private int size;
        // makes size into a getSize() method
        public int getSize(){
            return size;
        }
        // this lets the size be changed through a method which takes an argument
        public void setSize(int s){
            size = s;
        }

        void bark(){
            if (size > 60){
                System.out.println("Woof");
            }
            else if (size > 14){
                System.out.println("RUff");
            }
            else {
                System.out.println("yip");
            }
        }
    }
```
```java
    class GoodDogTestDrive{
        public static void main (String[] args){
            // this is declaring a new object of the same type with the name of 'one'
            GoodDog one = new GoodDog();
            // setting the size of 'one' to 70
            one.setSize(70);
            GoodDog two = new GoodDog();
            two.setSize(8);
            System.out.println("Dog one: " + one.getSize());
            System.out.println("Dog two: " + two.getSize());
            one.bark();
            two.bark();
        }
    }
```

## Using References in an array 
- Only difference in the way objects behace in an arry is how you 'get' to them
1. Declaring and creating a Dog array of 7 items.
Dog[] pets;
pets = new Dog[7]

2. Creating two new Dog objects, and assinging them to the first 2 array elemets.
pets[0] = new Dog();
pets[1] = new Dog();

3. Calling methods on the two Dog objects
pets[0].setSize(30);
int x = pets[0].getSize();
pets[1].setSieze(8);

