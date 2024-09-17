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

class MySecondClass {
private int num1;
private int num2;

public MySecondClass(int num1, int num2) {  //Конструктор
this.num1 = num1;
this.num2 = num2;
}

public int getNum1() { //Метод для получения значения первого числа
return num1;
}

public void setNum1(int num1) {  //Метод для модификации значения первого числа
this.num1 = num1;
}

public int getNum2() { //Метод для получения значения второго числа
return num2;
}

public void setNum2(int num2) { //Метод для модификации значения второго числа
this.num2 = num2;
}

public int findMin() { //Метод для нахождения минимума из двух чисел
if (num1 < num2) {
return num1;
} else {
return num2;
}
}
}
