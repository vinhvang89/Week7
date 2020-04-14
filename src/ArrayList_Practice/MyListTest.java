package ArrayList_Practice;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> MyLotto = new MyList<Integer>(4);
        MyLotto.add(39);
        MyLotto.add(48);
        MyLotto.add(12);
//        MyLotto.addIndex(6,12);

        System.out.println(Arrays.toString(MyLotto.getArray()));
        MyList<Double> Boy = new MyList<Double>(3);
        System.out.println(Arrays.toString(Boy.getArray()));
    }


}
