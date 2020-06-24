package ru.geekbrains.MyExeption;

public class MyArrayDataExeption extends Exception
{
    private SpecialForData[] sfd;
    private int result;

    public SpecialForData[] getSfd() {
        return sfd;
    }

    public void info()
    {
        try
        {
            for(SpecialForData o : sfd)
            {
                    System.out.println("Элемент " + "'" +  o.getString() + "' , находящийся в ячейке с координатами "
                           +"[" + o.getResult()[0] + "," + o.getResult()[1] + "] , не является числом.");
            }
        }
        catch (NullPointerException e)
        {

        }
        System.out.println("Сумма элементов массива " + result);
    }

    public int getResult() {
        return result;
    }

    public MyArrayDataExeption(String message , SpecialForData[] sfd , int result)
    {
        super(message);
        this.sfd = sfd;
        this.result = result;
    }
}
