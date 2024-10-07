package test;

public class Task1 {
    public static void main(String[] args) {
        // Примитивные типы
        char charValue = 'G';
        int intValue = 89;
        byte byteValue = 4;
        short shortValue = 56;
        float floatValue = 4.7333436f;
        double doubleValue = 4.355453532;
        long longValue = 12121;


        // Не примитивные типы (обертки)
        Character charObj = 'G';
        Integer intObj = 89;
        Byte byteObj = 4;
        Short shortObj = 56;
        Float floatObj = 4.7333436f;
        Double doubleObj = 4.355453532;
        Long mylong = Long.valueOf(12121);

        // Вывод в консоль
        System.out.println("char: " + charValue);
        System.out.println("int: " + intValue);
        System.out.println("byte: " + intValue);
        System.out.println("short: " + intValue);
        System.out.println("float: " + intValue);
        System.out.println("double: " + intValue);
        System.out.println("long: " + intValue);
        // ... аналогично для остальных
        System.out.println("Character: " + charObj);
        System.out.println("Integer: " + intObj);
        System.out.println("Byte: " + intValue);
        System.out.println("Short: " + intValue);
        System.out.println("Float: " + intValue);
        System.out.println("Double: " + intValue);
        System.out.println("Long: " + intValue);
    }
}