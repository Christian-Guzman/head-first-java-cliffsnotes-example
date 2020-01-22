# Extra-Strength Methods

## Table of Contents
- Generating random numbers with Math.random().
- Looping with for loops.
- Casting primitives from large size to a smaller size.
- Converting a String into an int with Integer.parseInt().

## Generating random numbers
```java
    int randomNum = (int) (Math.random() * 5)
```
- int randomNum; Declared an int type variable "randomNum" to hold what we get back.
- (int); This is a cast. Forces things  immediately after to become the type of the cast.
- Math.random(); Math is a built in class and random is a method of that class.
- (Math.random() * 5); Returns a number between 0 - 4.

## Looping with for loops
```java
    for(int i=0; i<100;i++){
        ...
    } 
```
- int i=0; Initialization.
- i<100; Boolean test.
- i++; Iteration expression.
- How the compiler sees it: Create a variable i and set it to 0, repeat while i is less than 100, and at the end of each loop iteration add 1 to i.

### Enhanced Loop
```java
    for (String name : nameArray){
        ...
    }
```
- String name; With each iteration, a different element in the array will be assigned to the variable "name".
- The colon means "IN".
- nameArray; The collection of elements that you want to iterate over.

## Casting Primitive
```java
long y = 42;
int x = y;
```
- This wont compile because a long type is bigger than an int.
- Use a 'cast' operator.
```java
    long y = 42;
    // cast operator is the (int) which makes the value after it of that type.
    int x = (int) y;
```

## Converting a String to an int.
```java
    String num = "2";
    int x = 2;
    if (x == num);
```
- This would literally explode.
- Integer.parseInt("3");
- .parseInt() is a method that knows how to "parse" or change a string into the int it represents.