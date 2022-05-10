public class Main {
//к заданию 3
    public static int deliveryDays(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1");
            return 1;
        } else {
            if (distance <= 60) {
                System.out.println("Потребуется дней: 2");
                return 2;
            } else {
                if (distance <= 100) {
                    System.out.println("Потребуется дней: 3");
                    return 3;
                }
            }
        }
        return 0;
    }

// к заданию2
    public static void printOS(int clientOsIOS) {
        boolean OsIOS = isOsIOS(clientOsIOS);
        clientOsIOSResult(clientOsIOS, OsIOS);
    }
    public static void printOSYear(int clientOsVersionIOS) {
        boolean clientDeviceYear = isOsVersionIOS(clientOsVersionIOS);
        clientOsVersionIOSResult(clientOsVersionIOS, clientDeviceYear);
    }
    private static boolean isOsIOS(int clientOsIOS) {
        return clientOsIOS == 0;
    }
    private static boolean isOsVersionIOS(int clientOsVersionIOS) {
        return clientOsVersionIOS >= 2015;
    }
    private static void clientOsVersionIOSResult(int clientOsVersionIOS, boolean clientDeviceYear) {
        if (clientDeviceYear) {
            System.out.print("Установите приложение по ссылке");
        } else {
            System.out.print("Установите облегченную версию приложения по ссылке");
        }
    }
    private static void clientOsIOSResult(int clientOsIOS, boolean OsIOS) {
        if (OsIOS) {
            System.out.println(" для IOS");
        } else {
            System.out.println(" для Android");
        }
    }

//   к заданию1
    public static void printIsHighYear(int year) {
        boolean highYear = isHighYear(year);
        printIsHighYearResult(year, highYear);
    }
    private static boolean isHighYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void printIsHighYearResult(int year, boolean highYear) {
        if (highYear) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }


    public static void main(String[] args) {
        System.out.println("Задание 1.методы");
        printIsHighYear(2020);

        System.out.println("Задание 2.методы");
        printOSYear(2022);
        printOS(1);

        System.out.println("Задание 3.методы");
        deliveryDays(96);


    }
}



