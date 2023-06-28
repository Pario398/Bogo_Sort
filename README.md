# Bogo Sort

This is a Java program that implements the Bogo Sort algorithm. Bogo Sort is a sorting algorithm that can be described as "stupid" because it relies on pure luck. It works by randomly shuffling the elements of an array over and over again until, by chance, the array ends up sorted. Due to its complete lack of a systematic approach, Bogo Sort is extremely inefficient and impractical for any serious sorting tasks. It serves more as a cautionary example rather than a useful algorithm.

## Usage

1. Make sure you have Java installed on your system.
2. Compile the program using the following command:
```terminal
javac BogoSort.java
```
3. Run the program using the following command:
```terminal
java BogoSort
```
##How it works

The program prompts the user to enter a list of numbers separated by commas. It then converts the input into an array of integers. The Bogo Sort algorithm is then applied to the array until it becomes sorted.

The `shuffle` method randomly shuffles the elements of the array by swapping each element with a random element from the array.

The `isSorted` method checks if the array is sorted in ascending order.

##Example
```
Enter a list of numbers: 5,2,8,1,4

Sorted array: 1 2 4 5 8
```
