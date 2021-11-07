public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;

        System.out.println("b равно" + b);

        // Переменная логического типа может стоять
        // В условии оператора if
        if (b) System.out.println("Как думаете, вы увидите эту строку?");

        // Операторы сравнения возвращают логическое значение
        System.out.println("Выражение 10 > 9 имеет значение " + (10 > 9));

    } // main(String[] args)

} // BoolDemo class
