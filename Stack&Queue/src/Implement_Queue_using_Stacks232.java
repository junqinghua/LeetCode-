public class Implement_Queue_using_Stacks232 {
    Stack<Integer> sIn;
    Stack<Integer> sOut;

    public MyQueue() {
        sIn = new Stack<>();
        sOut = new Stack<>();
    }

    public void push(int x) {
        sIn.push(x);
    }

    public int pop() {
        dumpSin();
        return sOut.pop();

    }

    public int peek() {
        dumpSin();
        return sOut.peek();
    }

    public boolean empty() {
        return sIn.isEmpty() && sOut.isEmpty();
    }

    public void dumpSin(){
        if(!sOut.isEmpty()) return;
       while(!sIn.isEmpty()){
           sOut.push(sIn.pop());
       }

    }


}
