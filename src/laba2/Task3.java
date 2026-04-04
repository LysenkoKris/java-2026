package laba2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String text = sc.nextLine();

        System.out.println("Введите ключ");
        int key = sc.nextInt();
        sc.nextLine(); // съесть перевод строки

        String encrypted = caesar(text, key);
        System.out.println("Текст после преобразования: " + encrypted);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = sc.nextLine().trim().toLowerCase();

        if ("y".equals(answer)) {
            String decrypted = caesar(encrypted, -key);
            System.out.println("Обратное преобразование: " + decrypted);
        } else if ("n".equals(answer)) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

        sc.close();
    }

    // Сдвигаем каждый символ на key позиций в таблице Unicode
    private static String caesar(String text, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char shifted = (char) (c + key);
            sb.append(shifted);
        }
        return sb.toString();
    }
}