/*
Необходимо реализовать метод разворота связного списка.
Автор: Чубченко Светлана
*/

public class Main {
    public static void main(String[] args) {
        list List1 = new list();
        // заполняем список
        List1.add(15);
        List1.add(80);
        List1.add(11);
        List1.add(159);
        // выводим на экран
        System.out.println("Before revert: ");
        System.out.println(List1);
        // делаем разворот
        List1.revert();
        // выводим результат
        System.out.println("After revert: ");
        System.out.println(List1);
    }
}

