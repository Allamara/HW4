public class Main {
    public static void main(String[] args) {
// TASK_1
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия," +
                    " нужно немного подождать");
        }

// TASK_2
        int temp = 20;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

// TASK_3
        int speed = 150;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф");
        }

// TASK_4
        int personAge = 20;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + " ,то ему нужно ходить в детский сад");
        }
        if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + " ,то ему нужно ходить в школу");
        }
        if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + " ,то ему нужно ходить в университет");
        }
        if (personAge >= 24) {
            System.out.println("Если возраст человека равен " + personAge + " ,то ему нужно ходить на работу");
        }
    }
}