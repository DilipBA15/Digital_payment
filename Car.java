public class Car {
String name;
String model;
int age;

public static void main(String[] args) {
    Car car1 = new Car();
    car1.name = "Honda";
    car1.model = "City 1 2017";
    car1.age = 15;

   System.out.println("Car - " + car1.name + ", Model - " + car1.model + ", Old - " + car1.age + " years");
}}