package com.javacourse.lesson3;
//Написать программу, в которой в консоль будет выводится название месяца и сезон,
        //к которму этот месяц относится (написать с помощью if и с помощью switch)
public class Main {
    public static void main(String[] args) {
        int day = 10;
        switch (day){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        int x = 6;
        if (x > 2 && x < 6)
            System.out.println("весна");
        else if (x > 5  && x < 9)
            System.out.println("лето");
        else if (x > 8 && x < 12)
            System.out.println("осень");
        else
            System.out.println("зима");
    }
}
// Написать программу, которая приветствует пользователя в зависимости
// от его пола и возраста (имя, пол и возраст задаются при старте программы)
        public class Main {
            public static void main(String[] args) {
                String str = "";
                switch (str) {
                    case "Alex 20":
                        System.out.print("Привет Alex ");
                        break;
                    case "Alesia 50":
                        System.out.print("Приветствую мэм ");
                        break;
                    case "Sebastian 89":
                        System.out.print(" ЗДРАВСТВУЙТЕ дедуль.. ");
                        break;
                    case "Elvira 27":
                        System.out.println("Здравствуйте, госпожа ");
                        break;
                }
            }
        }
