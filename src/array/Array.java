package array;

public class Array<T> {
    private T[] data;
    private boolean is_valid;
    private int size;
    private int count_element;

    public Array(int size){
        if(size <= 0){
            System.out.println("Error: size can't lower than 0!");
            this.is_valid = false;
            return;
        }
        this.data = (T[]) new Object[size];
        this.count_element = -1;
        this.size = size;
        this.is_valid = true;
    }

    public void print(){
        if(!this.is_valid){
            System.out.println("Error: Invalid array!");
            return;
        }
        System.out.print("[");
        for(int i=0;i<=count_element;i++){
            if(i == this.count_element){
                System.out.print(this.data[i]);
                continue;
            }
            System.out.print(this.data[i]+", ");
        }
        System.out.print("]\n");
    }

    public void append(T data){
        if(!this.is_valid){
            System.out.println("Error: Invalid array!");
            return;
        }
        if(this.count_element == this.size - 1){
            System.out.println("Error: Array is full!");
            return;
        }
        this.data[++this.count_element] = data;
    }

    public void insert(int pos, T data){
        if(!this.is_valid){
            System.out.println("Error: Invalid array!");
            return;
        }
        if(this.count_element == this.size - 1){
            System.out.println("Error: Array is full!");
            return;
        }
        if(pos > this.count_element || pos < 0){
            System.out.println("Error: Invalid position!");
            return;
        }
        for(int i = this.size-1;i>pos;i--){
            this.data[i] = this.data[i-1];
        }
        this.data[pos] = data;
        this.count_element+=1;
    }

    public void delete(int pos){
        if(!this.is_valid){
            System.out.println("Error: Invalid array!");
            return;
        }
        if(this.count_element == -1){
            System.out.println("Error: Array is empty!");
        }
        if(pos > this.count_element || pos < 0){
            System.out.println("Error: Invalid position");
            return;
        }
        for(int i=pos;i<this.count_element;i++){
            this.data[i] = this.data[i+1];
        }
        this.count_element -= 1;
    }

    public void update(int pos, T data){
        if(!this.is_valid){
            System.out.println("Error: Invalid array!");
            return;
        }
        if(this.count_element == -1){
            System.out.println("Error: Array is empty!");
        }
        if(pos < 0 || pos >this.count_element){
            System.out.println("Error: Invalid position!");
            return;
        }
        this.data[pos] = data;
    }

    public int search(T key){
        if(!this.is_valid){
            System.out.println("Error: Invalid array!");
            return -1;
        }
        if(this.count_element == -1){
            System.out.println("Error: Array is empty!");
            return -1;
        }
        for(int i = 0;i<=this.count_element;i++){
            if(this.data[i] == key){
                return i;
            }
        }
        System.out.println("Error: Can't find this data in array!");
        return -1;
    }
}
