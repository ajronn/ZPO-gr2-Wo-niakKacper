package lab2.ex1;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Duck> listOfDucks = new ArrayList<Duck>();
        int numberOfDucks = r.nextInt(100)+1;
        for(int i=0;i<numberOfDucks;i++){
            listOfDucks.add(new Duck(new Flightable(), new Quack(),r.nextInt(1000)+1));
        }

        DuckSort duckSortBubble = new DuckSort(listOfDucks, new BubbleSort());

        System.out.println("Number of ducks: "+numberOfDucks);
        for(int i = 0; i<5;i++){
            if(r.nextInt(100) % 2 == 0){
                duckSortBubble.changeSortMethod(new BubbleSort());
            } else {
                duckSortBubble.changeSortMethod(new Quicksort());
            }
            duckSortBubble.sort();
        }
    }
}