package ru.geekbrains.MyExeption;


// класс для создания объектов для нечмсловых элементов.
public class SpecialForData
{
    private String string;           //  переменная для значения нечисленного элемента.
    private int[] result;            //  массив для координат вышеуказанной переменной.

    public SpecialForData(String string, int[] result)
    {
        this.string = string;
        this.result = result;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setResult(int[] result) {
        this.result = result;
    }

    public String getString() {
        return string;
    }

    public int[] getResult() {
        return result;
    }
}
