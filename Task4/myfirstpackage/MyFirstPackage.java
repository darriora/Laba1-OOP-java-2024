package myfirstpackage;
public class MySecondClass {
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
