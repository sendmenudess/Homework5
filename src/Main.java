public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        byte clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else
            System.out.println("Установите версию приложения для Android по ссылке");
    }
    public static void task2(){
        byte clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0){
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else
                System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else{
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3(){
        int year = 2100;
        if ((year%4 == 0 && year % 100 !=0)|| year % 400 == 0)
            System.out.printf("%d год является високосным\n", year);
        else
            System.out.printf("%d год не является високосным\n", year);
    }
    public static void task4(){
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance < 20)
            System.out.println("Потребуется дней:" + days);
        else if (deliveryDistance >= 20 && deliveryDistance < 60)
            System.out.println("Потребуется дней:" + (days+1));
        else if (deliveryDistance >= 60 && deliveryDistance < 100)
            System.out.println("Потребуется дней:" + (days+2));
        else
            System.out.println("Доставки нет");
        }
    public static void task5(){
        int monthNumber = 13;
        switch (monthNumber){
            case (1):
                System.out.println("Зима");
                break;
            case (2):
                System.out.println("Зима");
                break;
            case (3):
                System.out.println("Весна");
                break;
            case (4):
                System.out.println("Весна");
                break;
            case (5):
                System.out.println("Весна");
                break;
            case (6):
                System.out.println("Лето");
                break;
            case (7):
                System.out.println("Лето");
                break;
            case (8):
                System.out.println("Лето");
                break;
            case (9):
                System.out.println("Осень");
                break;
            case (10):
                System.out.println("Осень");
                break;
            case (11):
                System.out.println("Осень");
                break;
            case (12):
                System.out.println("Зима");
                break;
            //программа и так не выолняется, если номер не попадает ни под одно условие. Может я не понял условие
            default:
                System.out.println("Введено неверное число");
        }

    }


    }
