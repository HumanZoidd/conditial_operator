public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte age = 17;
        if (age >=18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний.");
        }else {
            System.out.println("Если возраст человека равен " + age + " лет, он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte temperatyra = 5; // в градусах цельсия
        if (temperatyra <=5) {
            System.out.println("На улице холодно " + temperatyra + " градусов, нужно надеть шапку.");
        }else {
            System.out.println("Сегодня тепло "+ temperatyra+" градусов, можно идти без шапки.");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte speedVelocity = 60;
        if (speedVelocity <= 60){
            System.out.println("Если скорость " +speedVelocity+ " км/ч, можно ездить спокойно");
        } else {
            System.out.println("Если скорость "+ speedVelocity+ " км/ч, придется заплатить штраф.");
        }
    }public static void task4 () {
        System.out.println("Задача 4");
        byte age = 19;
        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен "+age+ " лет, то ему нужно ходить в детский сад.");
        }
        if (age >=7 && age <=18 ){
            System.out.println("Если возраст человека равен "+age+ " лет, то ему нужно ходить в школу.");
        }
        if (age > 18 && age <=24){
            System.out.println("Если возраст человека равен "+age+ " лет, то ему нужно ходить в университет.");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен "+age+" лет, то ему нужно ходить на работу.");
        }

    }public static void task5 () {
        System.out.println("Задача 5");
        byte age = 5;
        if (age > 5 && age <=14){
            System.out.println("Если возраст ребенка равен " +age+" лет, то ребенку можно кататься на аттракционе только в сопровождении взрослого.");
        }
        if (age > 14 ){
            System.out.println("Если возраст ребенка равен " +age+" лет, то ребенку можно кататься на аттракционе.");
        }else {
            System.out.println("Если возраст ребенка равен " + age+" лет, то ребенку нельзя кататься на аттракционе.");
        }
    }public static void task6 () {
        System.out.println("Задача 6");
        byte carCapacity = 102;//вместимость вагона
        byte seating = 60;// количество сидящих мест в вагоне
        byte seatsOccupied = 101;// мест в вагоне занято
        if (seatsOccupied <= seating ) {
            System.out.println("В вагоне осталось " + (seating - seatsOccupied) + " сидящих мест и осталось " +(carCapacity-seatsOccupied)+ " стоящих мест.");
        } if (seatsOccupied >60 && seatsOccupied <102){
            System.out.println("В вагоне осталось только "+(carCapacity-seatsOccupied)+" стоящих мест.");
        }else {
            System.out.println("Вагон заполнен.");
        }
    }public static void task7 () {
        System.out.println("Задача 7");
        int one =  7;
        int two = 2;
        int three = 18;
        if (one > two && one > three){
            System.out.println("Максимальное число " + one);
        }
        if (two > one && two >three) {
            System.out.println("Максимальное число " + two);
        }
        if (three>one && three>two) {
            System.out.println("Максимальное число " + three);
        }
    }
}