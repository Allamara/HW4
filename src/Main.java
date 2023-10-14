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
// TASK_5
        int kidAge = 4;
        if (kidAge <= 5) {
            System.out.println("Если возраст ребёнка равен  " + kidAge + ", то ему нельзя кататься на аттракционе");
        }
        if (kidAge >= 5 && kidAge <= 14) {
            System.out.println("Если возраст ребёнка равен " + kidAge + ",то ему можно кататься на аттракционе в сопровождении");
        }
        if (kidAge >= 14) {
            System.out.println("Если возраст ребёнка равен " + kidAge + ",то ему можно кататься на аттракционе без сопровождения взрослого");
        }

// TASK_6
        int carCapacity = 102;
        int carSeats = 60;
        int carStands = carCapacity - carSeats;
        int passengers = 50;

        if (passengers <= carCapacity  && passengers > 0) {
            if (passengers < carSeats) {
                System.out.println("В вагоне " + passengers + " пассажиров. Сидячие места есть");
            } else {
                System.out.println("В вагоне " + passengers + " пассажиров. Сидячих мест нет");
            }
        }
        else if (passengers > carCapacity){
            System.out.println("Мест нет. Вагон полный. " + (passengers % carCapacity)+ " пассажиров не пеместились в вагон");
        }
        else {
            System.out.println("Некорректно введено число пассажиров");
        }

// TASK_7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("max = " + one);
        }
        if (two > three && two > one) {
            System.out.println("max = " + two);
        }
        else {
            System.out.println("max = " + three);

        }
    }
}