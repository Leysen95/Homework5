public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS ==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такого приложения нет");
        }
        System.out.println("Task 2");
        int year = 2015;
        int clientOS2 = 1;
        int clientDeviceYear = 2014;
        if (clientOS2 == 0 && clientDeviceYear < year){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear >= year){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < year){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear >= year){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такого приложения нет");
        }
        System.out.println("Task 3");
        int yearNew = 2021;
        boolean yearIsValid = yearNew >= 1584;
        boolean yearIsLeap = yearNew % 4 == 0 && yearNew % 100 != 0 || yearNew % 400 == 0;
        if (yearIsValid && yearIsLeap){
            System.out.println("Год является вискосоным");
        } else {
            System.out.println(" Год не является високосным");
        }
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней:" + deliveryDays);
        } else if (deliveryDistance < 60){
            deliveryDays++;
            System.out.println("Потребуется дней:" + deliveryDays);
        } else if (deliveryDistance < 100){
            deliveryDays += 2;
            System.out.println("Потребуется дней:" + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого сезона нет");
        }
    }
}