import myfirstpackage.*;
class MyFirstClass {
 public static void main(String[] args) {
        MySecondClass o = new MySecondClass(5, 3); // Создание и инициализация объекта “o” типа MySecondClass
        System.out.println(o.findMin()); // Вызов метода, реализующего действие над числами
        
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setNum1(i); // Установка значения первого числового поля
                o.setNum2(j); // Установка значения второго числового поля
                System.out.print(o.findMin()); // Вызов метода, реализующего действие над числами
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

