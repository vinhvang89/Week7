package Stack_DecimalToBinary;

import java.util.Arrays;

public class ConvertFromDecimal {
    private int index = 0;
    private int size;
    private Object[] array;

    public ConvertFromDecimal(int size) {
        this.size = size;
        array = new Object[this.size];
    }

    private void ensureSize() {
        int new_size = this.size * 2;
        if (index == size - 1)
            array = Arrays.copyOf(array, new_size);
    }

    public void push(Object element) {
        if (index == size - 1)
            ensureSize();
        array[index] = element;
        index++;
    }

    public Object[] getArray() {
        return this.array;
    }

    public void toBinary(int number) {
        int number1 = number;
        int balances = number1 % 2;
        push(balances);
        int integers = (number1 - balances) / 2;
        int temp;
        for (int i = 0; i < number; i++) {
            if (integers == 1) {
                this.push(integers);
                break;
            } else {
                temp = integers;
                number1 = temp;
                balances = number1 % 2;
                this.push(balances);
                integers = (number1 - balances) / 2;
            }
        }
    }

    public void checkBalance(int number) {
        if (number > 9) {
            switch (number) {
                case 10:
                    this.push('A');
                    return;
                case 11:
                    this.push('B');
                    return;
                case 12:
                    this.push('C');
                    return;
                case 13:
                    this.push('D');
                    return;
                case 14:
                    this.push('E');
                    return;
                case 15:
                    this.push('F');

            }
        } else {
            this.push(number);


        }
    }
    public void toHexadecimal(int number) {
        int number1 = number;
        int balances = number1 % 16;
        int integers = (number1 - balances) / 2;
        int temp;
        if (number > 16) {
            push(balances);
            for (int i = 0; i < number; i++) {
                if (integers > 15) {
                    temp = integers;
                    number1 = temp;
                    balances = number1 % 16;
                    checkBalance(balances);
                    integers = (number1 - balances) / 16;
                } else {
                    checkBalance(integers);
                    break;
                }
            }
        }
    }
    public void getResult(){
        Object[] temp = new Object[index];
        int j = 0;
        for (int i = index -1 ; i >=0 ; i--) {
            temp[j] = array[i];
           j++;
        }
        for (Object o : temp) {
            System.out.print(o);
        }
    }
}

