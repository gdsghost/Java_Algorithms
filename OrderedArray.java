
package data.and.algorithm.lab2;


public class DataAndAlgorithmLab2 {

  
    public static void main(String[] args) {
        
        OrdArray ord = new OrdArray(7);
        ord.insert(2);
        ord.insert(9);
        ord.insert(7);
        ord.insert(3);
        ord.display();
        ord.delete(7);
        ord.display();
    }

}

class OrdArray {

    private long[] a; // ref to array a
    private int nElements; //number of data items

    public OrdArray(int max) {
        this.a = new long[max];
        this.nElements = 0;
    }

    public int size() { // return max size of the array
        //Fill the body
        return this.a.length;
    }

    public int find(long searchKey) {
        //Fill the body
        for (int i = 0; i < nElements; i++) {
            if (a[i] == searchKey) {
                return i;
            }
        }
        return -1; //this means no serch value in array.we indicate it as minus value.
    }

    public void insert(long value) { // put element into arrray
        //Fill the body
        if (this.nElements == size()) {
            System.out.println("array is full.insertion terminated");
            return;
        }
        for (int i = 0; i < nElements; i++) {
            if (value < a[i]) {
                for (int j = nElements - 1; j >= i; j--) {
                    this.a[j + 1] = a[j];
                }
                this.a[i] = value;
                this.nElements++;
                return;
            }
        }
        this.a[nElements] = value;
        nElements++;

    }

    public boolean delete(long value) {
        //Fill the body
        int index = find(value);
        if (index == -1) {
            System.out.println("value not found.deletion terminated");
            return false;
        } else {
            for (int i = index; i < nElements - 1; i++) {
                this.a[i] = this.a[i + 1];
            }
            this.nElements--;
            return true;
        }

    }

    void display() { // display array contents
        //Fill the body
        for (int i = 0; i < this.nElements; i++) {
            System.out.print(this.a[i] + " ");
        }
        System.out.println();
    }
}
