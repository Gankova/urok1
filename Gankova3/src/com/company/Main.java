package com.company;

public class Main {

    public static void main(String[] args) {
	int month  = 5;
	// входной аргумент, должен быть переменной
    //после  case указывается одна константа
    //тип данных этой константы должен совпадать с типом данных входного аргумента
    // тип входного аргумента должен быть целочисленным (char - подходит) либо перечислением, либо строкой
	switch (month) {
        case 1 :
            // код выполнится только в том случае, если переменная month == 1
            System.out.println("january");
            break; //останавливает выполнение switch
        case 2 :
            System.out.println("February");
            break;
        case 3 :
            System.out.println("March");
            break;
        case 4 :
            System.out.println("apryl");
            break;
        case 5 :
            System.out.println("May");
            break;
        case 6 :
            System.out.println("june");
            break;
        case 7 :
            System.out.println("july");
            break;
        case 8 :
            System.out.println("August");
            break;
        case 9 :
            System.out.println("сентябрь");
            break;
        case 10 :
            System.out.println("октябрь");
            break;
        case 11 :
            System.out.println("ноябрь");
            break;
        case 12 :
            System.out.println("декабрь");
            break;
        default:
            //выполнится в том случае, если не сработает ни один из cas-ов
            System.out.println("такого месяца не существует");
    }
    String s = "hello";
	switch (s){
        case "hello":
            System.out.println("привет");
            break;
        case "Goodbuy":
            System.out.println("пока");
            break;
        default:
            System.out.println("??????");
    }

    // вывести по номеру месяца пора года
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
        }

        //МАССИВЫ
        // Массив -совокупность элементов одного типа

        int[] arr = new int[5];
		//new -динамически выделяет память
        // размер массив - количество элементов в массиве
        // все массивы в джава должны иметь фиксированный размер
        // индексация элементов массива начинается с 0
        arr [0] = 123;
        arr [4] = 321;
        arr [2] = arr[0] + arr [4];
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        System.out.println(arr[2]);
        int i = 3;
        arr [i] = 56;
        System.out.println(arr[3]);
        System.out.println(arr.length); //количество элементов массива

        //многомерные массивы
        float[][] m = new float [3] [4];
        m [1] [0] = 12.45f;
        // m[1].lengch  = 4 (кол-во столбцов)
        // m.lengch = 3 (кол-во строк)
        System.out.println(m[0].length* m.length );

        // inline объявление массивов
        int[] arr2 = {1,4,7,8,9};
        System.out.println(arr2[2]);
        String[] arr3 ={"hello", "world"};
        System.out.println(arr3[1]);
        int[][] arr4 = {{1,2},{3,4},{5,6}};

        //Циклы
        // () указывается логическое выражение
        // пока истинно - цикл продолжается, как только ложно - прекращается
        // {} - указывается код который нужно повторять
        int k = 0;
        while ( k < 5 ){
            System.out.println(k);
            k = k + 1;
        // k = 5 после предыдущего цикла
        // do while  - цикл с постпроверкой условия
        }
        do {
            System.out.println(k);
        }while (k < 5);

        // условие цикла for состоит из трех частей
        // каждая из частей не обязательна
        // в первой части происходит объявление и/или инициализация переменной
        // областью видимости переменной объявленной в первой части являются {} цикла for
        // во второй части показывается условие выполнения цикла
        // в третьей части указывается одно действие
        // порядок выполнения цикла
        // 1- часть (один раз) затем 2 часть - если истинно запуститься цикл затем 3 часть
        for (int j = 0;j < 7;j = j + 1) {
            System.out.println(j*j);
        // for(;;) - бесконечный цикл
        }
        for (int j = 0;j< arr.length; j = j + 1) {
            System.out.println(arr [j]);
        }



        }
}
