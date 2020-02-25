package soft.village.incrementor;

import androidx.core.widget.TextViewCompat;

/**
 * Класс  инкрементор со свойствами <b>num</b> и <b>maxValue</b>.
 * @autor Саша
 */

public class Incrementor {

    /** Поле основного числа */
    private int num = 0;

    /** Поле максимального значения поля {@link Incrementor#num} */
    private int maxValue = Integer.MAX_VALUE;

    /**
     * Функция получения значения поля {@link Incrementor#num}
     * @return возвращает значение основного числа
     */
    int getNumber(){
        return num;
    }

    /**
     * Функция увеличения значения поля {@link Incrementor#num}
     * Если значение поля {@link Incrementor#num} будет достигнуто значения поля {@link Incrementor#maxValue}
     * то значение поля {@link Incrementor#num} будет обнулено
     */
    void incrementNumber(){
        if(num + 1 >= maxValue)
            num = 0;
        else
            num++;
    }

    /**
     * Функция установления значения поля {@link Incrementor#maxValue}
     * @param value - устанавлимое значение
     */
    public void setMaximumValue(int value) {
        maxValue = value;
    }

}
