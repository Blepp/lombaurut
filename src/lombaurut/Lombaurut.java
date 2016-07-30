package lombaurut;

import com.mkdika.Xutil;
import java.io.IOException;

public class Lombaurut {

    public static void main(String[] args) throws IOException {

        // Baca text file, masukan isi text file kedalam variable array.       
        int[] x = Xutil.readTxtFileToArray("random.dat");
        if (x == null || x.length <= 0) {
            System.out.println("Error read text file. try again.");
            return;
        }else {
            System.out.println("Array Length: " + x.length);
        }
        
        long start = Xutil.getTime();
        // BEGIN - YOUR CODE HERE
        // =====================================================================

        // Baseline Example - Used Bubble Sort Algorithm
        int n = x.length, c, d, swap;
        for (c = 0; c < (n - 1); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (x[d] > x[d + 1]) {
                    swap = x[d];
                    x[d] = x[d + 1];
                    x[d + 1] = swap;
                }
            }
        }        
        
        // =====================================================================
        // END
        long end = Xutil.getTime();

        System.out.println("Total execution time (nano sec): " + Xutil.executionTime(start, end));       
        Xutil.writeTxtFileFromArray(x, "sorted.dat");
    }

}
