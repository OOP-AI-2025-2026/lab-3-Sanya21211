package org.example.task2;

public class Main {
    public static void main(String[] args) {
        try {
            Box box = new Box(3, 4, 5);

            System.out.println("Загальна площа коробки: " + box.surfaceArea());
            System.out.println("Площа бічних граней: " + box.lateralSurfaceArea());
            System.out.println("Об'єм коробки: " + box.volume());
        } catch (IllegalArgumentException e) {
            System.out.println("Не вдалося створити коробку: " + e.getMessage());
        }

        Cart cart = new Cart(new Item[10]);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.removeById(9);

        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);
    }
}