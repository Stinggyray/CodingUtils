package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//A collection of really fast methods of input.
public class SpeedyInputs {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine());


        //Basically scanner but better

        int bruh = Integer.parseInt(st.nextToken());

        long bruh2 = Long.parseLong(st.nextToken());

        String bruh3 = st.nextToken();

        double bruh4 = Double.parseDouble(st.nextToken());


        //Fill arrays

        ArrayList<Integer> ints = new ArrayList<>();

        while(buf.readLine() != null){
            st = new StringTokenizer(buf.readLine());
            //fill here
            ints.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Long> longs = new ArrayList<>();

        while(buf.readLine() != null){
            st = new StringTokenizer(buf.readLine());
            //fill here

            longs.add(Long.parseLong(st.nextToken()));
        }

        ArrayList<String> strings  = new ArrayList<>();

        while(buf.readLine() != null){
            st = new StringTokenizer(buf.readLine());
            //fill here
            strings.add(st.nextToken());
        }

        ArrayList<Double> doubles = new ArrayList<>();

        while(buf.readLine() != null){
            st = new StringTokenizer(buf.readLine());
            //fill here
            doubles.add(Double.parseDouble(st.nextToken()));
        }


        //Split with stringtokenizer

        while(buf.readLine() != null){
            st = new StringTokenizer(buf.readLine());

            while(st.hasMoreTokens()){
                strings.add(st.nextToken());
            }
        }


        //Timing code

        long startTime = System.nanoTime();


        long endTime = System.nanoTime();
        System.out.println("Execution time: " + ((double)(endTime - startTime) / 1000000) + " ms");
    }
}
