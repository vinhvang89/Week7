package LinkList_Practice;

public class MyFuckingLinkedTest {
    public static void main(String[] args) {
        MyFuckingLinked skeleton = new  MyFuckingLinked(12);
        skeleton.addFirst(15);
        skeleton.addLast(12);
        skeleton.addLast(16);
        skeleton.addLast(31);
        skeleton.addLast(35);
        skeleton.add(1,8);
        skeleton.print();
        System.out.println(skeleton.ofIndex(16));


    }
}
