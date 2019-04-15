import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        Stack  stack = new Stack();
        stack.add(5);
        stack.add(1);
        stack.add(9);
        stack.add(98);
        stack.add(23);
        Stack Stack = new Stack();
        Stack.add("ahmed");
        Stack.add("sowrov");
        Stack.add("Opu");
        Stack.add("nayem");
        System.out.println(Stack.search(""));
        for(int aa=0;aa<1;aa++){
            for(int bb=0;bb<Stack.size();bb++){
                System.out.println(bb+"\t"+stack.get(bb)+"\t"+Stack.get(bb));
            }
        }
        //System.out.println(stack.search(1));
    }
}
