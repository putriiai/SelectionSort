package Model;
public class SelectionSort {

    private String[] array;
    public SelectionSort(){

    }
    public String[] getData(){
        return array;
    }

    public void setData(String[] arr){
        this.array = arr;
    }

    public void sortingData(){
        String small;
        int n = this.array.length;
        for(int x=0; x<n-2; x++){
            int index = x;
            for(int y=x+1; y<n; y++){
                if(this.array[y].compareTo(this.array[index])<0){
                    small = this.array[y];
                    String temp = this.array[y];
                    this.array[y] = this.array[x];
                    this.array[x] = temp;
                }
            }
        }
    }


    public void printData(){
        System.out.println("Sorting Data : ");
        for(int i=0; i<this.array.length; i++){
            System.out.println(this.array[i]+",");
        }
    }
}
