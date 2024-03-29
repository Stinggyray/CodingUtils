package Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodeSnippets {
    public static void main(String[] args) throws IOException {

        //-------------------------
        // SCANNER
        //-------------------------
        Scanner sc = new Scanner(System.in);

        //Split by spaces
        ArrayList<String> split2 = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));

        //Split by spaces into an int array
        ArrayList<Integer> splint = new ArrayList<Integer>(IntStream.of(Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()).boxed().collect(Collectors.toList()));

        //Declare 2D ArrayList
        ArrayList<ArrayList<Integer>> twodims = new ArrayList<>();

        //Fill 2D ArrayList
        int a = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < a; i++){
            twodims.add(new ArrayList<Integer>(IntStream.of(Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()).boxed().collect(Collectors.toList())));
            sc.nextLine();
        }


        //Add another dot after the G for the number of chars you want to split by (remainder will be kept)
        ArrayList<String> split = new ArrayList<>(Arrays.asList(sc.nextLine().split("(?<=\\G.)")));

        System.out.println(LoggingUtil.logArrayList(split));

        sc.close();

        //-------------------------
        // BUFFERED READER
        //-------------------------

        //See SpeedyInputs
    }

    //I don't know how this works. It's also really inefficient.
    public static boolean getPrimes (int n) {
        return !new String(new char[n]).matches(".?|(..+?)\\1+");
    }
}
