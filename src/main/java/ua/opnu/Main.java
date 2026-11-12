package ua.opnu;

public class Main {
    public static void main(String[] args) {

        // Завдання 1: Перевірка MyOptional
        System.out.println("Завдання 1: MyOptional ");
        MyOptional<String> middleName = new MyOptional<>();
        System.out.println(middleName); // MyOptional[empty]
        System.out.println("isPresent: " + middleName.isPresent()); // false
        System.out.println("orElse: " + middleName.orElse("немає")); // "немає"

        MyOptional<String> username = new MyOptional<>("admin");
        System.out.println(username); // MyOptional[value=admin]
        System.out.println("isPresent: " + username.isPresent()); // true
        System.out.println("get(): " + username.get()); // "admin"
        System.out.println("orElse: " + username.orElse("guest")); // "admin"

        try {
            String test = middleName.get();
            System.out.println("unexpected: " + test);
        } catch (IllegalStateException ex) {
            System.out.println("Очікуваний виняток: " + ex.getMessage());
        }

        try {
            MyOptional<String> broken = new MyOptional<>(null);
            System.out.println("unexpected: " + broken);
        } catch (IllegalArgumentException ex) {
            System.out.println("Правильно не дозволив null: " + ex.getMessage());
        }

        // Завдання 3: Перевірка Printer
        System.out.println("\nЗавдання 3: Printer ");
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

        // Завдання 6: Перевірка кортежів
        System.out.println("\n Завдання 6: Кортежі");
        GenericTwoTuple<String, Integer> studentTuple = new GenericTwoTuple<>("Іванов Петро", 95);
        System.out.println("TwoTuple: " + studentTuple);

        GenericThreeTuple<String, Integer, String> detailedTuple = new GenericThreeTuple<>("Іванов Петро", 95, "Група КН-21");
        System.out.println("ThreeTuple: " + detailedTuple);
    }
}