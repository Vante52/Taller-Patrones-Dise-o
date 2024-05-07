package src;

import java.util.Stack;
public class Caretaker {
    private Stack<Memento> mementoStack = new Stack<>();
    public void guardarMemento(Memento m) {
        mementoStack.push(m);
    }
    public Memento getMemento() {
        return mementoStack.pop();
    }
}
