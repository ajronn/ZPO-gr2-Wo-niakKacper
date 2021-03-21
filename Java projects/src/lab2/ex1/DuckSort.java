package lab2.ex1;

import java.util.ArrayList;

public class DuckSort {
    DuckSort(ArrayList<Duck> ducks, ISort sort) {
        Duck[] arr = new Duck[ducks.size()];
        arr = ducks.toArray(arr);
        this.listOfDucks = arr;
        this.sort = sort;
    }

    public void sort(){
        this.sort.sort(listOfDucks);
    }

    public void changeSortMethod(ISort s) {
        this.sort = s;
    }

    private Duck[] listOfDucks;
    private ISort sort;
}