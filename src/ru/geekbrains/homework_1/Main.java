package ru.geekbrains.homework_1;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculate(5.67f,6.28f,8.5f,4.15f));
        System.out.println(task10and20(7, 6));
        isPositiveOrNegative(25);
        isNegative(25);
        sayHello("Оби Ван Киноби");
        year(800);

        byte a = 99;
            System.out.println(a);
        short b = 999;
            System.out.println(b);
        int c = 9999;
            System.out.println(c);
        long l = 999999L;
            System.out.println(l);
        float f = 1.23456789f;
            System.out.println(f);
        double d = 1.2345678910;
            System.out.println(d);
        char m = '\u1323';
            System.out.println(m);
        boolean bool = true;
            System.out.println(bool);
    }

    public static int calculate(float a, float b, float c, float d){
        return (int)(a * (b + (c / d)));
    }

    public static boolean task10and20(int x1, int x2){
        if ((x1 + x2) >= 10 && (x1 + x2) <= 20){
            return true;
        }   else
            return false;
    }

    public static void isPositiveOrNegative(int j) {
        if (j <= 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
    public static boolean isNegative(int n){
        if (n < 0) {
            System.out.println("Число отрицательное");
            return true;
        } else
            System.out.println("Число положительное");
        return false;
    }// не совсем понимаю, как без sout в данном случае вывести информацию о том, что число отрицательное и это true.

    public static void sayHello(String name){
        System.out.println("Приветствую тебя, мой юный падаван " + name + "!!!");
    }

    public static void year (int g){
        if(g%4 == 0 || g%400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }
    }
}
