package DataStructure;

public class Main {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(10);
        dynamicArray.show();

        dynamicArray.insert(1);
        dynamicArray.insert(1);
        dynamicArray.insert(1);
        dynamicArray.insert(1);
        dynamicArray.insert(1);
        dynamicArray.insert(1);
        dynamicArray.insert(1);
        dynamicArray.insert(1);
        dynamicArray.insert(1);
        dynamicArray.insert(1);
        dynamicArray.insert(1);

        System.out.println("AFTER INSERTING");
        dynamicArray.show();

    }
}
