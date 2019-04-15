import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("aminul");
        array.add("ahmed");
        array.add("nayeem");
        array.add("Rahman");
        array.add("Imtiaz");

        System.out.println(array.get(0)+" "+array.get(1)+" "+array.get(2)+" "+array.get(3));

        ArrayList<Integer> Newarray = new ArrayList<Integer>();
        Newarray.add(10);
        Newarray.add(15);
        Newarray.add(20);
        Newarray.add(30);
        Newarray.add(35);
        System.out.println("id"+"\t" +"name"+"\t"+"age");
        for (int b=0; b<1;b++){
            for (int a=0; a<array.size();a++){

                System.out.println(a+"\t"+array.get(a)+"\t"+Newarray.get(a));
            }

        }















   /*





      ArrayList<Integer> Newarray = new ArrayList<Integer>();
            Newarray.add(10);
     /*    ewarray.add(20);
        Newarray.add(30);
        Newarray.add(40);
        for (int b=0; b<Newarray.size();b++){

            ArrayList<String> Array = new ArrayList<String>();
            Array.add("Ahmed");
            Array.add("Apu");
            Array.add("Samian");
            Array.add("adnan");
            for(int a=0;a<Array.size();a++) {
                System.out.println(a+"\t"+Array.get(a));
       */
        }












        }








