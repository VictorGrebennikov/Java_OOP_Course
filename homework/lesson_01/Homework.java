package homework.lesson_01;

public class Homework {
    // Создать наследника реализованного класса ГорячийНапиток с дополнительным
    // полем int температура.
    // Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
    // реализовать
    // перегруженный метод getProduct(int name, int volume, int temperature)
    // выдающий продукт соответствующий имени, объему и температуре
    // В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
    // и воспроизвести логику заложенную в программе
    // Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
    public static void main(String[] args) throws Exception {
        HotDrinkMachine m = new HotDrinkMachine();
        m.addProduct(new HotDrink("Black tea", 100, 85, 0.25));
        m.addProduct(new HotDrink("Green tea", 100, 80, 0.25));
        m.addProduct(new HotDrink("Cappucino", 150, 65, 0.3));
        m.addProduct(new HotDrink("Americano", 100, 75, 0.15));
        m.addProduct(new HotDrink("Espresso", 100, 70, 0.04));
        for (Product product : m.getProducts()) {
            System.out.println(product);
        }
        System.out.println();
        System.out.println(m.getProduct(75));
        System.out.println(m.getProduct("Green tea"));
        System.out.println(m.getProduct(0.30));
    }
}