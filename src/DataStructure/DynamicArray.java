package DataStructure;

public class DynamicArray {

    private final int defaultCapacity = 10;
    private int capacity;
    private int size;
    private int[] dynamicArray;
    private boolean[] isEmpty;


    public DynamicArray(){
        size = defaultCapacity;
        capacity = defaultCapacity;
        dynamicArray = new int[defaultCapacity];
        isEmpty = new boolean[defaultCapacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        dynamicArray = new int[capacity];
        isEmpty = new boolean[capacity];
        size = capacity;
    }

    public int capacity(){return capacity;}

    public int size(){return size;}

    public void show(){
        for (int i = 0; i < capacity; i++){
            System.out.println("index="+i+", value="+isEmpty[i]);
        }
    }

    public void insert(int value){

        if (isEmpty[capacity - 3]){
            scale();
        } else if (!isEmpty[capacity - 3]) {
            for (int i = 0; i < capacity; i++){
                if (!isEmpty[i] && (i < capacity-2)){
                    dynamicArray[i] = value;
                    isEmpty[i] = true;
                    size--;
                    break;
                }
            }
        }
    }

    private void scale(){

        int[] newArray = new int[capacity*2];
        boolean[] newIsEmpty = new boolean[capacity*2];

        System.arraycopy(dynamicArray, 0, newArray, 0, capacity);
        System.arraycopy(isEmpty, 0, newIsEmpty, 0, capacity);

        dynamicArray = newArray;
        isEmpty = newIsEmpty;

        capacity = isEmpty.length;
    }
}
