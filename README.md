# Date Validator App

## Introduction

This Java application provides a simple date validation and adaptation mechanism using the `DateValidator` class. The program allows users to input a date in the format "dd/mm/yyyy" and validates whether it adheres to the specified format and constraints.

## DateValidator Class

The `DateValidator` class is responsible for validating and adapting date strings. Here are some key features:

- **Validation**: The class provides a `isValid` method that checks if a given date string conforms to a specified regular expression.

- **Date Adaptation**: The `adaptDate` method adapts the input date string by replacing various separator characters (e.g., '-', '.', ',', ':') with the standard '/' separator.

- **Constructor**: The class has a constructor that takes a date string as input, validates it, and initializes the `DateValidator` object.

- **Exception Handling**: If the input date is not valid, the constructor throws an exception with an appropriate error message.

- **String Representation**: The `toString` method generates a formatted string representing the date, including the day of the week and month name in Italian.

## MainApp Class

The `MainApp` class serves as the entry point for the application. Here are its main features:

- **User Input**: The program prompts the user to enter a date in the "dd/mm/yyyy" format using a `Scanner` object.

- **Date Validation Loop**: The application continues to prompt the user for input until a valid date is provided.

- **Date Validation**: The `DateValidator` class is used to validate the entered date.

- **Output**: Once a valid date is entered, the program confirms the validation and displays the formatted date using the `toString` method.

## How to Use

1. Run the `MainApp` class.
2. Enter a date in the specified format when prompted.
3. If the date is valid, the program confirms the validation and displays the formatted date.

Note: The application ensures that the entered date is valid and handles exceptions gracefully.

Feel free to use and integrate this date validation mechanism into your Java projects!

## Author

Pintescul Patric
