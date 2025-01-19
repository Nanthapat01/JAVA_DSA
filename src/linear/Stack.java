package linear;

public class Stack<T> extends Obj<T> {
    public Stack(int size){
        super(size);
    }

    public void push(T data){
        if(isFull()){
            System.out.println("Error: Stack is full");
            return;
        }
        this.data[getElementCount()+1] = data;
        incrementElementCount();
        return;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Error: Stack is empty!");
            return;
        }
        this.data[getElementCount()] = null;
        decrementElementCount();
        return;
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Error: Stack is empty!");
            return null;
        }
        return this.data[getElementCount()];
    }

    public int size(){
        return getElementCount()+1;
    }
}
