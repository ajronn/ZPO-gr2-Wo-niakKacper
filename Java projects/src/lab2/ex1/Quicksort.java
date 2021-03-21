package lab2.ex1;

public class Quicksort implements ISort{
    @Override
    public void sort(Duck[] ducks) {
        this.tab = ducks;
        long startTime = System.nanoTime();
        QuickSort(0, ducks.length-1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Quicksort sort time: " + duration + "µs");
        System.out.println("-----------------");
    }

    private void QuickSort(int left, int right) {
        if (right <= left)
            return;
        else {
            int q = Partition(left, right);
            QuickSort(left, q - 1);
            QuickSort(q + 1, right);
        }
    }

    private int Partition(int left, int right) {
        long x = tab[left].age;
        int i = left;

        for (int j = left + 1; j <= right; j++)
            if (tab[j].age <= x) {
                i = i + 1;
                swap(i, j);
            }
        swap(i, left);
        return i;
    }

    private void swap(int i, int j) {
        Duck tmp = tab[i];
        tab[i] = tab[j];
        tab[j] = tmp;
    }

    private Duck[] tab;
}
