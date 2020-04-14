package LinkList_Practice;

public class MyFuckingLinked {
    private Skull head;
    private int numberEyes;
    public MyFuckingLinked(Object bone ){
       this.head = new Skull(bone);
    }
    private class Skull{
        Skull next;
        Object bone;
        public Skull(Object bone){
            this.bone = bone;
        }
        public Object getBone(){
            return this.bone;
        }
    }
    public void addFirst(Object bone){
        Skull hat = head;
        head = new Skull(bone);
        head.next = hat;
        numberEyes++;
    }
    public void addLast(Object bone){
        Skull hat = head;
        for (int i = 0; i <= numberEyes -1  ; i++) {
            hat = hat.next;
        }
        hat.next = new Skull(bone);
        numberEyes++;
    }
    public  void  add(int where,Object bone){
        Skull hat = head;
        Skull bucket ;
        for (int i = 0; i < where -1 && hat.next != null ; i++) {
            hat = hat.next;
        }
        bucket = hat.next;
        hat.next =  new Skull(bone);
        hat.next.next = bucket;

    }
    public Object getIndex(int index){
        Skull hat = head;
        for (int i = 0; i < index ; i++) {
            hat = hat.next;
        }
        return hat.bone;
    }
    public int ofIndex(Object what){
        int count = 0 ;
        Skull hat = head;
        if( hat.bone == what)
            return count;
        for (int i = 0; i <= numberEyes ; i++) {
            hat = hat.next;
            count++;
            if(hat.bone == what)
                return count;
        }
        return count -1;
    }
    public boolean isContain(Object what){
        Skull hat = head;
        if( hat.bone == what)
            return true;
        for (int i = 0; i <= numberEyes ; i++) {
            hat = hat.next;
            if(hat.bone == what)
                return true;
        }
        return false;
    }
//    public void remove(Object what){
//        Skull hat = head;
//        Object bucket;
//        for (int i = 0; i <= numberEyes ; i++) {
//              if( hat.bone != what){
//                  bucket = hat.next.bone;
//                  hat.next.bone = hat.next.next.bone;
//                  hat.bone = bucket;
//              } else {
//                  hat.bone = hat.next.bone;
//              }
//
//        }
//    }
    public void print(){
        Skull hat = head;
        while (hat!=null){
            System.out.println(hat.bone);
            hat = hat.next;
        }
    }
}
