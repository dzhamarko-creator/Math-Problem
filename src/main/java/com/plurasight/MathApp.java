package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1: Highest salary
        double bobSalary = 50000;
        double garySalary = 60000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Question 2: Smallest price
        double carPrice = 20000;
        double truckPrice = 25000;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestPrice);

        // Question 3: Area of a circle with radius 7.25
        double radius = 7.25;
        double areaOfCircle = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + areaOfCircle);

        // Question 4: Square root of 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

        // Question 5: Distance between (5,10) and (85,50)
        double x1 = 5, y1 = 10;
        double x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is " + distance);

        // Question 6: Absolute value of -3.8
        double value = -3.8;
        double absoluteValue = Math.abs(value);
        System.out.println("The absolute value is " + absoluteValue);

        // Question 7: Random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("A random number is " + randomNumber);

        // Question 8: Minutes and milliseconds in 24 days
        int days = 24;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        int millisecondsInSecond = 1000;

        int totalMinutes = days * hoursInDay * minutesInHour;
        long totalMilliseconds = (long) days * hoursInDay * minutesInHour * secondsInMinute * millisecondsInSecond;

        System.out.println("There are " + totalMinutes + " minutes in " + days + " days.");
        System.out.println("There are " + totalMilliseconds + " milliseconds in " + days + " days.");
    }
}
