import java.util.Arrays;

public class MyArrayList<T> {
    public static final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;

    private Object[] data;
    public int size;

    public MyArrayList(int size) {
        data = new Object[size];
        size = 0;
    }

    public MyArrayList() {
        this(16);
    }

    public T get(int index) {
        return (T)data[index];
    }

    public void add(T object) {
        if(data.length < size+1) {
            grow();
        }
        data[size] = object;
        size ++;
    }

    public T remove(int index) {
        var deleted = data[index];
        if(index < 0 || index >= size) {throw new ArrayIndexOutOfBoundsException();}
        for (int i = index+1; i < size; i++) {
            data[i-1] = data[i];
        }
        data[size-1] = null;
        size--;
        return (T)deleted;
    }

    private void grow() {
        long newSize = data.length*2;
        if(newSize > MAX_ARRAY_LENGTH) {
            newSize = MAX_ARRAY_LENGTH;
        }
        data = Arrays.copyOf(data, (int)newSize);
    }

    public int indexOf(T objet) {
        for (int i = 0; i < size; i++) {
            if(data[i] == objet) return i;
        }
        return -1;
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < size; i++) {
            s+= "{"+data[i].toString()+"},";
        }
        s+="]";
        return s;
    }

    public Integer getSize() {
        return size;
    }


}
