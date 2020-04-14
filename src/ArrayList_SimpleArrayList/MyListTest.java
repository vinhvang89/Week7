package ArrayList_SimpleArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> Lotto = new MyList<Integer>();
        Lotto.add(33);
        Lotto.add(44);
        Lotto.add(12);
        Lotto.add(71);
        Lotto.add(97);
        Lotto.add(63);
        System.out.println(Lotto.get(5));
    }
}
