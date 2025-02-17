// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // What instance variables do you need?
    T[] baseArray;
    int offset; 

    // Write a constructor to make a new DynamicArray Object from an array
    public DynamicArray(int offset,T[] baseArray){
        this.offset=offset;
        this.baseArray=(T[])new Character[baseArray.length];
        int i=0;
        int o=0;
        while (i<baseArray.length){
            o=i+(offset % baseArray.length);
            this.baseArray[i]=baseArray[o];
        }
        
    }

    public T get(int index){
        return this.baseArray[index];
    }

    public T get(int index, int offset){
        int x = 0;
        if (index + offset >= baseArray.length){
            x = offset % baseArray.length;
        }
        return this.baseArray[index+x];
    }

    public void set(int index, T element){
        this.baseArray[index] = element;
    }
}

