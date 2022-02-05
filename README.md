# Arrays
### What is an array?

An array is a data structure used to implement a list of elements of the same type.

For example: a class list of 100 names would be an array of Strings

For example: A list of 25 test scores of everyone in the class would be an array of Integers.

Once an array is made, it has a specific size/length. (Immutable)

### Initialization
In Java, an array is an object, therefore we need to use the keyword *new* when creating an array.

The layout for initializing the array is as follows:
```java
double[] data = new double[25];
```
1. **double[]** is the identifier for initializing a new variable with the data type of a Double array.
2. **data** is the variable's name.
3. **new** is the keyword for creating an Array Object.
4. **double[25]** is declaring that the size of the Double array is 25. (There are 25 "spots" in the array for a double.)


### Declaration
To declare an array and fill the array spots with values, you can do the following:

If I wanted to put 5, 6, 7, and 8 into an array in that order...

There are two ways of doing this:
1. 
```java
int[] numbers = new int[4];
numbers[0] = 5;
numbers[1] = 6;
numbers[2] = 7;
numbers[3] = 8;
```

2.
```java 
int[] numbers = {5, 6, 7, 8};
```

With the second way of declaring an array, you do not need the *new* keyword. Also, the second implementation should only be used when you know every value in the array.

**Note:** When we create an array, by default the array is filled with zeroes (integer arrays and double arrays) or empty strings(character array or string array)

**Note:** The greatest index you can use for an array is the length of the array / the total amount of elements you can fit in the array minus 1

Example: If you had an double array of size 100, the greatest index you can use is 99 (100 - 1 = 99)

In this example, you can use values from index 0 to index 99.

Example: In a movie theater row of 15 seats, there is only enough space for 15 people. There is no more space for more than 15 people. This is similar to an array, where you cannot access an index equal to or greater than the size of the array.

### Finding the Length of the Array

To find the length of the array, you can use *.length* to get the array length. The array length is a **VARIABLE** of the Array class, so you do not need to call a length method. 

arrayName.length

Example:
```java
String[] names = {"Nick", "Jonny", "Richard"}; //This has a length of there

int arrayLength = names.length;//arrayLength now equals 3
```
