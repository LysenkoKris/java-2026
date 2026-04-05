package laba3;
import java.util.*;

public class Main {
    static final int N = 400_000;  // 4 * 1_000_000 по варианту

    public static void main(String[] args) {
        System.out.println("Количество элементов: " + N + "\n");

        testAddFirst();
        testAddMiddle();
        testAddLast();
        testRemoveFirst();
        testRemoveMiddle();
        testRemoveLast();
        testGetByIndex();
    }

    // 1. Добавление в начало
    static void testAddFirst() {
        System.out.println("1. Добавление в НАЧАЛО коллекции:");

        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arrayList.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.printf("ArrayList:   %8d ms%n", end - start);

        List<Integer> linkedList = new LinkedList<>();  // для ArrayList
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList.add(0, i);
        }
        end = System.currentTimeMillis();
        System.out.printf("LinkedList:  %8d ms%n", end - start);

        NavigableSet<Integer> treeSet = new TreeSet<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            treeSet.add(i);  // TreeSet не поддерживает индексы
        }
        end = System.currentTimeMillis();
        System.out.printf("TreeSet:     %8d ms%n", end - start);

        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            hashMap.put(i, i);  // Map добавляет по ключу
        }
        end = System.currentTimeMillis();
        System.out.printf("LinkedHashMap:%8d ms%n", end - start);

        System.out.println();
    }

    // 2. Добавление в середину
    static void testAddMiddle() {
        System.out.println("2. Добавление в СЕРЕДИНУ коллекции:");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N/2; i++) arrayList.add(i);  // заполняем
        long start = System.currentTimeMillis();
        for (int i = N/2; i < N; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        long end = System.currentTimeMillis();
        System.out.printf("ArrayList:   %8d ms%n", end - start);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N/2; i++) linkedList.add(i);
        start = System.currentTimeMillis();
        for (int i = N/2; i < N; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        end = System.currentTimeMillis();
        System.out.printf("LinkedList:  %8d ms%n", end - start);

        System.out.println("TreeSet/Map: не поддерживают вставку по индексу");
        System.out.println();
    }

    // 3. Добавление в конец
    static void testAddLast() {
        System.out.println("3. Добавление в КОНЕЦ коллекции:");

        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.printf("ArrayList:   %8d ms%n", end - start);

        List<Integer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.printf("LinkedList:  %8d ms%n", end - start);

        NavigableSet<Integer> treeSet = new TreeSet<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            treeSet.add(i);
        }
        end = System.currentTimeMillis();
        System.out.printf("TreeSet:     %8d ms%n", end - start);

        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            hashMap.put(i, i);
        }
        end = System.currentTimeMillis();
        System.out.printf("LinkedHashMap:%8d ms%n", end - start);

        System.out.println();
    }

    // 4. Удаление из начала
    static void testRemoveFirst() {
        System.out.println("4. Удаление из НАЧАЛА коллекции:");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < N/2; i++) {
            arrayList.remove(0);
        }
        long end = System.currentTimeMillis();
        System.out.printf("ArrayList:   %8d ms%n", end - start);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < N/2; i++) {
            linkedList.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.printf("LinkedList:  %8d ms%n", end - start);

        System.out.println("TreeSet/Map: другое поведение удаления");
        System.out.println();
    }

    // 5. Удаление из середины
    static void testRemoveMiddle() {
        System.out.println("5. Удаление из СЕРЕДИНЫ коллекции:");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < N/4; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        long end = System.currentTimeMillis();
        System.out.printf("ArrayList:   %8d ms%n", end - start);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < N/4; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        end = System.currentTimeMillis();
        System.out.printf("LinkedList:  %8d ms%n", end - start);

        System.out.println("TreeSet/Map: другое поведение удаления");
        System.out.println();
    }

    // 6. Удаление из конца
    static void testRemoveLast() {
        System.out.println("6. Удаление из КОНЦА коллекции:");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < N/2; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        long end = System.currentTimeMillis();
        System.out.printf("ArrayList:   %8d ms%n", end - start);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < N/2; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        end = System.currentTimeMillis();
        System.out.printf("LinkedList:  %8d ms%n", end - start);

        System.out.println("TreeSet/Map: другое поведение удаления");
        System.out.println();
    }

    // 7. Получение по индексу
    static void testGetByIndex() {
        System.out.println("7. ПОЛУЧЕНИЕ ЭЛЕМЕНТА ПО ИНДЕКСУ:");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long start = System.currentTimeMillis();
        for (int i = 0; i < N/10; i++) {
            int idx = (int)(Math.random() * arrayList.size());
            arrayList.get(idx);
        }
        long end = System.currentTimeMillis();
        System.out.printf("ArrayList:   %8d ms%n", end - start);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) linkedList.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < N/10; i++) {
            int idx = (int)(Math.random() * linkedList.size());
            linkedList.get(idx);
        }
        end = System.currentTimeMillis();
        System.out.printf("LinkedList:  %8d ms%n", end - start);

        System.out.println("TreeSet/Map: не поддерживают get(index)");
    }
}