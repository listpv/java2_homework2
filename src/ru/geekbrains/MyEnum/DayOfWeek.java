package ru.geekbrains.MyEnum;

public enum DayOfWeek
{
    MONDAY ("Понедельник") , TUESDAY ("Вторник"), WEDNESDAY ("Среда"), THURSDAY ("Четверг"),
    FRIDAY ("Пятница"), SATTUDAY ("Суббота"), SUNDAY ("Воскресенье");

    private String rus;

    public String getRus()
    {
        return rus;
    }

    DayOfWeek(String rus) {
        this.rus = rus;
    }
}
