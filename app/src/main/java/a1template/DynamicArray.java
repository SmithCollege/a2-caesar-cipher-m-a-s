// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // Attributes

    /** The base array storage for this class. T represents a generic data type. */
    private T[] arr;

    /** Indexing offset --- add this to a supplied index to get the actual array location. */
    private int offset;

    
    // Constructor

    /** This is the constructor of DynamicArray class. It is used to make a new DynamicArray Object from an array.
     * @param offset indexing offset
     * @param arr pre-defined array
     */
    public DynamicArray(int offset, T[] arr) {
        this.offset = offset;
        this.arr = arr;
    }


    // Implementation of the methods from IndexAccess

    /** Returns the value stored at a given index
     * @param i index of element to read
     * @return value stored at the given index
     */
    public T get(int i) {
        return arr[i];
    }

    /** Returns the value stored at a given index plus the offset
     * @param i index of element to read
     * @param offset adjust index by this value
     * @return value stored at the given index
     */
    public T get(int i, int offset) {
        return arr[i+offset];
    }

    /** Stores the given value at the given index
     * @param i index of locaßtion to store
     * @param val value to store at given index
     */
    public void set(int i, T val) {
        arr[i] = val;
    }

}