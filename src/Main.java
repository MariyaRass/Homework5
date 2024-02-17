public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        System.out.println("Задание 2");
        int clientOs = 0;
        int clientDeviceYear = 2016;
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите современную версию приложения для Android по ссылке");
        }
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите современную версию приложения для IOS по ссылке");
        }

        System.out.println("Задание 3");
        int year = 2028;
        if (year < 1584) {
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задание 4");
        int deliveryDistance = 200;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >60 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance >100) {
            System.out.println("Доставка не осуществляется");
        }


        System.out.println("Задание 5");
        int monthNumber = 3;
        if (monthNumber > 13){
            System.out.println("Ошибка");}
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Осень.");
                break;




        }










    }




}



