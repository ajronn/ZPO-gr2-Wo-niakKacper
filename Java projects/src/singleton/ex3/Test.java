package singleton.ex3;
import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args)throws Exception
    {
        /*Read file*/
        File file = new File("singleton/ex3/data.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        ArrayList<String[]> value = new ArrayList<>();
        while ((st = br.readLine()) != null) {
            value.add(st.split(";"));
        }
        /*Read file*/

        Singleton singleton = Singleton.getInstance(value);
        Singleton anotherSingleton = Singleton.getInstance(new ArrayList<String[]>());

        for (String[] array: anotherSingleton.value) {
            for(String s: array) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
