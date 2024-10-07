package HomeWork2;

public class StringOperations {
    public static void main(String[] args) {
        String str = new String("I study Basic Java!");

        // Предпоследний символ
        System.out.println("Предпоследний символ: " + str.charAt(str.length() - 2));

        // Содержит ли подстроку "Java"
        System.out.println("Содержит ли подстроку Java: " + str.contains("Java"));

        // Вырезать строку "Java"
        int index = str.indexOf("Java");
        String javaSubstring = str.substring(index, index + 4);
        System.out.println("Вырезанная подстрока: " + javaSubstring);

        // Заменить все "а" на "о"
        String replacedString = str.replace("a", "o");
        System.out.println("Замена a на o : " + replacedString);

        // Верхний регистр
        System.out.println("Верхний регистр: " + str.toUpperCase());

        // Нижний регистр
        System.out.println("Нижний регистр: " + str.toLowerCase());
    }
}

