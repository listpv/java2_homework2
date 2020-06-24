package ru.geekbrains.MyEnum;

/*4. Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
        С его помощью необходимо решить задачу определения кол-ва рабочих часов
        до конца недели по заднному текущему дню.
        Возвращает кол-во оставшихся рабочих часов до конца
        недели по заданному текущему дню. Считается, что
        текущий день ещё не начался, и рабочие часы за него
        должны учитываться.*/

import ru.geekbrains.MyEnum.DayOfWeek;

public class DayOfWeekMain
{
    public static void main(final String[] args)
    {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    }

    static String getWorkingHours(DayOfWeek day)
    {
        int ordinal = day.ordinal();
        if (ordinal > 4)
        {
            return ( day.getRus() + " - выходной.");
        }

        return ( day.getRus() + " - до конца рабочей недели осталось " + (5-ordinal)*8 + " часов.");
    }
}




