package ru.geekbrains.MyExeption;

/*      1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
        при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
        Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
        должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
        3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
         и вывести результат расчета.*/

import org.jetbrains.annotations.NotNull;

public class MyExeptionMain
{

    public static void main(String[] args)
    {
	// write your code here
//       Массив с буквами.
        System.out.println("Массив №1.");
        try
        {
            System.out.println("Сумма элементов массива " + sumOfArray(fullfillArray1()));
        }
        catch (MyArraySizeExeption e) {
            e.printStackTrace();
            e.info();
        }
        catch (MyArrayDataExeption e)
        {
            e.printStackTrace();
            e.info();
        }
        System.out.println();

//      Массив без букв.
        System.out.println("Массив №2.");
        try
        {
            System.out.println("Сумма элементов массива " + sumOfArray(fullfillArray2()));
        }
        catch (MyArraySizeExeption e) {
            e.printStackTrace();
            e.info();
        }
        catch (MyArrayDataExeption e)
        {
            e.printStackTrace();
            e.info();
        }
        System.out.println();

//      Массив другого размера.
        System.out.println("Массив №3.");
        try
        {
            System.out.println("Сумма элементов массива " + sumOfArray(fullfillArray3()));
        }
        catch (MyArraySizeExeption e)
        {
            e.printStackTrace();
            e.info();
        }
        catch (MyArrayDataExeption e)
        {
            e.printStackTrace();
            e.info();
        }

    }


    static int sumOfArray(String[] @NotNull [] mass) throws MyArraySizeExeption , MyArrayDataExeption
    {
        //  проверка на размер.
        for(int i = 0; i < mass.length; i++)
        {
            if (mass[i].length != 4 || mass.length != 4)
            {
                throw new MyArraySizeExeption("Массив не соответствует заданному размеру.");
            }
        }

        // проверка на наличие нечмсел.
        SpecialForData[] spd = new SpecialForData[16];   //  массив для вероятных нечисленных элементов.
        int varForSpd = -1;                              //  индекс для вышеуказанного массива.
        int result = 0;                                  //  переменная для подсчёта суммы.

        for(int i = 0; i < mass.length; i++)
        {
            for(int j = 0; j < mass[i].length; j++)
            {
                try
                {
                    result += Integer.parseInt(mass[i][j]);
                }
                catch (NumberFormatException e)
                {
                    varForSpd++;
                    spd[varForSpd] = new SpecialForData(mass[i][j], new int[]{i , j});
                }
            }

        }
        if (varForSpd > -1)
        {
            throw new MyArrayDataExeption("Не все элементы являются числами.", spd , result);
        }
        return result;
    }

    //  Заполняется массив№1, не только с числами, необходимого размера.
    static String[][] fullfillArray1()
    {
        String[][] mass = {{"abc","2","3","4"},{"5","*&","7","8"},{"9","10","def","12"},{"13","14","15","[}"}};
        return mass;
    }

    //  Заполняется массив№2, с числами, неоходимого размера.
    static String[][] fullfillArray2()
    {
        String[][] mass = {{"1","2","3","4"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15","16"}};
        return mass;
    }

    // Заполняется массив№3, размер не подходит.
    static String[][] fullfillArray3()
    {
        String[][] mass = {{"abc","1","2","3","4"},{"5","6","7","8"},{"abc","10","11","12"},{"13","14","15","16"}};
        return mass;
    }
}
