# Know Your Variables

## Table of Contents

- Declaring Variable
- Primitive Types
- Java Keywords
- Object Declaration
- Objects on the garbage-collectible heap
- Arrays 
- Make an array of Dogs

## Declaring Variable

- Variables come in two variations (Primitive and Object Reference).
- 2 Rules to follow: Variables must have a type and Variables must have a name.
```java
    // int being the type and count being the name 
    int count;
```

## Primitive Types

- Variables are like a cups they "hold" something.
- Primitive Variables are like coffee cups they come in different sizes
- There are 8: boolean , byte , char , short , int , long , float and double types.
- You can't mix types. Ex( int x = false).
- That wont work because you declared x to be an integer and gave it a value of a boolean type.
- 1) int x = 32 (int is the type, "x" is the name, 32 is the value).
- 2) char initial = 'j', (char is the type, "initial" is the name, "j" is the value)
- 3) double d = 456.709, (double is the type, "d" is the name, 456.709 is the value)
- 4) boolean isCrazy, (boolean is the type, isCrazy is the name, no value).
- 5) isCrazy = true, (variable isCrazy with boolean type is set to a boolean value of true)
- 6) int y = x + 456, (declared a int type in to the variable 'y' then assigned it to the value of x + 456)

## Java Keywords

- What can you use a variable names?
- It must start with a letter, underscore, or a dollar sign. Can't start with a number.
- Can't be Java's reserved words.
- Reserved Words: boolean, byte, char, double, float, int, long, short, public, private, protected, abstract, final, native, static, strictfp, synchronized, transient, valatile, if, else, do, while, switch, case, default, for, break, continue, assert, class, extends, implements, import, instanceof,interface, new, package, super, this, catch, finally, try, throw, throws,return, void, const, goto, enum.

## Object Declaration; 3 steps of object declaration, creation, and assignment

### 1) Declare a reference variable 
```java
    Dog myDog = new Dog();
```
- This tells the JVM to allocate space for a refernce variable named "myDog".
- The reference variable is, forever, of type dog.
- In other words a remote control that has buttons to control a dog, but not a cat.

### 2) Create an object
```java
    Dog myDog = new Dog();
```
- Tells the JVM to allocate space for a new Dog object on the heap.

### 3) Assignment
```java
    Dog myDog = new Dog();
```
- Assigns the new Dog to the refernce variable myDog.
- In other words, programs the remote control.

## Objects on the garbage-collectible heap

Book b = new Book();
Book c = new Book();
- Declared 2 Book reference variables. Created two new Book objects. Assigned the Book objects to the reference variables.
- The 2 Book objects are now living on the heap.

Book d = c;
- Declared a new Book reference Variable. Instead of creating a new third Book object it was assigned to the value of variable c. 
- Both c and d refer to the same object.
- Ex) It's like 2 remtoes programmed to one TV.

c = b;
- Assigned the value of variable b to variable c.
- Both b and c refer to the same object.

## Arrays

- An array is like a list of things.
1. Delcared an int array variable. An array variable is a remote control to an array object.
int[] nums;
2. Created a new int array with a length of 7, and assigned it to the previously-declared int[] variable nums.
nums = new int[7];
3. Gave each element in the arry (or in easier terms gave each item in the list) an int value.
nums[0] = 6;
nums[1] = 19;
nums[2] = 44;
nums[3] = 42;
nums[4] = 10;
nums[5] = 20;
nums[6] = 1;

### Arrays are obejects too
- Arrays (ordered, list of things) give you fast random access by letting you use an index position to get any element in the array. Anything you would put in a variable of that type can be assigned to an array element of that type. So in an array of type int (int[]), each element can hold an int. In a Dog array (Dog[]) each element can hold... a Dog? No, remember that a reference variable just holds a reference (a remote control), not the object itself. So in a Dog array, each element can hold a remote control to a Dog.
- The array is an object, even though it's an array of primitives.
- Arrays are always objects, whether they're declared to hold primitives or object references. But you can have an array of object that's declared to hold primitive values. In other words, the array object can have elements which are primitives, but the array itself is never a primitive. Regardless of what the array holds, the array itself is always an object. 

## An array of Dogs
```java
class Dog {
    String name;
    public static void main (String[] args) {
        // makes a Dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // Makes a Dog array with the length of 3 items
        Dog[] myDogs = new Dog[3];
        // Puts things into it starting at index 0
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // access the Dogs using the array references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // myDogs[2]'s name will equal dog1's name (Bart)
        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);

        // Loop through as long as 'x' is less than the length of myDogs 
        // after each iteration at the end of the loop 'x' is added by 1
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " says Ruff!");
    }
}
```