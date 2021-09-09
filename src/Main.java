public class Main {

    public static void main(String[] args) {
        MyArrayList<String> myArrayList =new MyArrayList<>();
        myArrayList.add("Square");
        myArrayList.add("Circle");
        myArrayList.add("Triangle");
        myArrayList.add("Hexagon");

        System.out.println("-->array size is: "+ myArrayList.getSize());
        System.out.println("Array to string:");
        System.out.println(myArrayList.toString());

        myArrayList.remove(2);
        System.out.println("\nS-->array size after deleting is: "+ myArrayList.getSize());
        System.out.println("Array to string after remove:");
        System.out.println(myArrayList.toString());

    }
}
