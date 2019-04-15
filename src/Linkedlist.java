import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {

        LinkedList linklist = new LinkedList();
        linklist.add(15);
        linklist.add(20);
        linklist.add(23);
        linklist.add(25);
        linklist.add(30);

        System.out.println(linklist);
        System.out.println(linklist.get(4));
        System.out.println(linklist.size());


        LinkedList linklist2 = new LinkedList();
        linklist2.add("queens       ");
        linklist2.add("brooklyn     ");
        linklist2.add("bronx        ");
        linklist2.add("manhattan    ");
        linklist2.add("statan island");
        System.out.println("tag"+"\t"+"borough"+"\t"+"\t"+"mile distance");

        for (int c=0; c<1;c++) {
            for (int d=0; d<linklist2.size();d++){
                System.out.println(d+"\t"+linklist2.get(d)+"\t"+linklist.get(d));
            }
        }


    }


}
