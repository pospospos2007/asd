package lab2;

/**
 * Created by Wenqiang on 5/1/18.
 *
 * lab 3-1
 */
public class Client1 {
    public static void main(String[]args){
//        new Adapter(new Adaptee()).request();
        Target stack = new Adapter(new Adaptee());
        QueueTarget queue = new Adapter(new Adaptee());
        stack.push("aaa");
        stack.push("bbb");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        queue.add("ccc");
        queue.add("ddd");
        System.out.println(queue.peek());
    }
}
class Adapter implements Target,QueueTarget  {
    private Adaptee adaptee;

    Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void push(String str) {
        adaptee.add(str);
    }
    @Override
    public String pop() {
        int end = adaptee.getEnd();
        String str = adaptee.get(end);
        adaptee.remove(end);
        return str;
    }


    @Override
    public void add(String str) {
        adaptee.add(str);
    }

    @Override
    public String peek() {
        int start = adaptee.getStart();
        String str = adaptee.get(start);
        adaptee.remove(start);
        return str;
    }

    @Override
    public boolean isEmpty() {
        return adaptee.empty();
    }
}
interface Target {
    public void push(String str);
    public String pop();
    public boolean isEmpty();

}


interface QueueTarget {
    public void add(String str);
    public String peek();
    public boolean isEmpty();
}



class Adaptee {
    private String[] data;
    private int start;
    private int end;

    Adaptee(){
        data = new String[10000];
        start = 0;
        end = -1;
    }

    public String startString() {
        return data[start];
    }

    public String endString() {
        return data[end];
    }

    public boolean empty() {
        return (end == -1);
    }

    public void add(String str) {
        data[end] = str;
        end++;
    }

    public void remove(int pos) {
//remove the String object at position 'pos' and bring
//forward all items after it
        for (int i = pos; i < end; i++) {
            data[i] = data[i + 1];
        }
    }

    public String get(int pos) {
        return data[pos];
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }
}