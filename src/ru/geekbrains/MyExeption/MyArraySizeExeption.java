package ru.geekbrains.MyExeption;

public class MyArraySizeExeption extends Exception
{
    public MyArraySizeExeption(String message)
    {
        super(message);
    }

    public void info()
    {
        System.out.println("Массив другого размера.");
    }
}
