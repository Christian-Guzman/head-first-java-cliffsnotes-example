# Using the Java Library

## Table of Contents
- Array List
- Boolean Expressions
- Using the Library
- Using Packages (import statements, fully-qualified names)
- Using the HTML API docs and reference books.

## Array List
1. 
```java
//Make one.
ArrayList<Egg> myList = new ArrayList<Egg>();

//Put something in it.
Egg s = new Egg();
myList.add(s);

//Put another thing in it.
Egg b = new Egg();
myList.add(b);

//Find out how many things are in it.
int theSize = myList.size();

//Find out if it contains something.
boolean isIn = myList.contains(s);

//Find out where something is (its index).
int idx = myList.indexOf(b);

//Find out if its empty.
boolean empty = myList.isEmpty();

//Remove something from it.
myList.remove(s);
```

### Comparing ArrayList to a regular array.
- An array has to know it's size.
- To put an object in a regular array, you must assign it to a specific location(ie. [index]).
- Arrays use array syntax that's not used anywhere else in Java, but ArrayLists are just objects and have no special syntax.
- ArrayList use parameterized types. (ex: ArrayList<String>).

## Boolean Expressions.

### 'And' and 'Or' Operators (&&, ||).
- And : &&
- Or : ||
```java
if ((zoomType.equals("optical") && 
(zoomDegree >= 3 && zoomDegree <= 8 )) ||
(zoomType.equals("digital") && 
(zoomDegree >= 5 && zoomDegree <= 12))){
    ...
}
```

### Not equals (!= and !).
- != : not equals to
- ! : not 
```java
// not equals to
if (model != 2000){
    ...
}
//or for comparing objects
if (!brand.equals("x")){
    ...
}
```

## Using the Library.
- ArrayList is in the package called java.util.
- java.util.ArrayList is the full name 
- 2 ways to tell Java which ArrayList you want to use.
```java
//Import
import java.util.ArrayList;
public class myClass{...}

//Or type the full name everywhere you use it.
java.util.ArrayList<Dog> list = new java.util.ArrayList<Dog>();
```