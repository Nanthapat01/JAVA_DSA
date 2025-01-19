package linear;

public class LinearQueue<T> extends Obj<T>{
    public LinearQueue(int size){
        super(size);
    }

    public void enqueue(T data){
        if(isFull()){
            System.out.println("Error: Queue is full!");
            return;
        }
        this.data[getElementCount() + 1] = data;
        incrementElementCount();
    }

    public T dequeue(){
        if(isEmpty()){
            System.out.println("Error: Queue is empty!");
            return null;
        }
        T result = this.data[0];
        for(int i = 0;i<getElementCount();i++){
            this.data[i] = this.data[i+1];
        }
        this.data[getElementCount()] = null;
        decrementElementCount();
        return result;
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Error: Queue is empty!");
            return null;
        }
        return this.data[0];
    }

    public int size(){
        return getElementCount() + 1;
    }
}
