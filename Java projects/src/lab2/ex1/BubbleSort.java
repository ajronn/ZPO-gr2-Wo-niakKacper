package lab2.ex1;

public class BubbleSort implements ISort{
    @Override
    public void sort(Duck[] ducks) {
        bubbleSort(ducks);
    }

    public void bubbleSort(Duck[] collection) {
        long startTime = System.nanoTime();
        for (int i = 0; i < collection.length; i++) {
            for (int j = 1; j < collection.length; j++) {
                if (collection[j].age < collection[j - 1].age) {
                    Duck higer = collection[j - 1];
                    collection[j - 1] = collection[j];
                    collection[j] = higer;
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Bubble sort time: " + duration + "µs");
        System.out.println("-----------------");
    }
}
