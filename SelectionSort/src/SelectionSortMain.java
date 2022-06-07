import Model.SelectionSort;

public class SelectionSortMain {

    public static void main(String[] args) {
        String[] nameRandom = {"Shinta", "Jefri", "Oliv", "Surya", "Dani", "Winda"};
        System.out.println("Data asli : ");
        for(int i=0; i<nameRandom.length; i++){
            System.out.println(nameRandom[i] + ",");
        }
        System.out.println(" ");

        SelectionSort seleksi = new SelectionSort();
        seleksi.setData(nameRandom);
        seleksi.sortingData();
        seleksi.printData();
    }
}
