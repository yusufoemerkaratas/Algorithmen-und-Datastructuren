package Lektion2;

public class Ubung2a {
    int[] array = new int[1];
    int size = 0;
    int capacity = 1;

    public int get(int i) {
        return this.array[i];
    }

    public int size() {
        return size;
    }

    public void add(int y) {
        if (size == capacity) {
            this.capacity *= 2 ;
            int neu[] = new int[capacity];
            int i = 0;
            while (i < size) {
                neu[i] = array[i];
                i++;
            }
            array = neu;
        }
        array[size] = y;
        size++;
    }

    public int getLast() {
        if(size==0) throw new IllegalStateException("List is empty");
        int a = array[size - 1];
        size-=1;
        return a;
    }
    public int search(int y){
        for(int i =0;i<size;i++){
            if(array[i]==y){
            return i;
            }
        }
        return  -1;
    }
}


