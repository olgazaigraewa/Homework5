public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке. ");
        } else if (clientOs == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке.  ");
        }

        //Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear >= 2015) ;
        {
            System.out.println(" Установите версию приложения для iOS по ссылке. ");
            if (clientOs == 0 && clientDeviceYear < 2015) ;
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке. ");
        }
        if (clientOs == 1 && clientDeviceYear >= 2015) ;
        {
            System.out.println(" Установите версию приложения для Android по ссылке.  ");
            if (clientOs == 1 && clientDeviceYear < 2015) ;
            System.out.println(" Установите облегченную версию приложения для Android по ссылке. ");
        }


        //Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0));
        {
            System.out.println(year + " год  является високосным. ");
        }
            else if((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0));
            {
                {
                    System.out.println(year + " год  является високосным. ");
                }
              else
                {
                    System.out.println(year + " год не является високосным. ");
                }



                //Задание 4




            }


            //Задание 5
            System.out.println("Задание 5");
            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                    System.out.println(" Зима ");
                    break;
                case 2:
                    System.out.println(" Зима ");
                    break;
                case 3:
                    System.out.println(" Весна ");
                    break;
                case 4:
                    System.out.println(" Весна ");
                    break;
                case 5:
                    System.out.println(" Весна ");
                    break;
                case 6:
                    System.out.println(" Лето ");
                    break;
                case 7:
                    System.out.println(" Лето ");
                    break;
                case 8:
                    System.out.println(" Лето ");
                    break;
                case 9:
                    System.out.println(" Осень ");
                    break;
                case 10:
                    System.out.println(" Осень ");
                    break;
                case 11:
                    System.out.println(" Осень ");
                    break;
                case 12:
                    System.out.println(" Зима ");
                    break;
                default:
                    System.out.println("Такого сезона не существует");

            }


        }
    }
