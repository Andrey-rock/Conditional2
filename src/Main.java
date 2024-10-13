public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        byte clientOS1 = 1;
        int clientDeviceYear = 2015;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 3
        int year = 1704;
        if ((year > 1584) && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4
        int deliveryDistance = 95;
        int deliveryTime = 1; //сутки
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        } else if (deliveryDistance > 100){
            System.out.println("Доставки нет");
        }

        //Задание 5
        byte monthNumber = 13;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Сейчас зима");
                break;
            case 3, 4, 5:
                System.out.println("Сейчас весна");
                break;
            case 6, 7, 8:
                System.out.println("Сейчас лето");
                break;
            case 9, 10, 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Неверный месяц");
        }

    }
}