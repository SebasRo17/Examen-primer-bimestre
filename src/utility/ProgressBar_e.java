package utility;

import java.io.IOException;
import java.text.DecimalFormat;

public class ProgressBar_e {
    public static void avance_bar() throws IOException, InterruptedException {
        String anim= "o/-\\";
        String sb = "sebastian.roblez@epn.edu.ec";
        int i = 0;
        int y = 0;
        DecimalFormat df = new DecimalFormat("###.##");
        for (double x =0 ; x <= 100 ; x+=3.7) {
            String data = "\r" + anim.charAt((int) (x % anim.length())) + " " + df.format(x)+"%";
            System.out.write(data.getBytes());
            Thread.sleep(50);
            System.out.print(" "+sb.substring(y,i));
            Thread.sleep(50);
            System.out.printf("\t\tLoading "+i+" de 27 caracteres");
            System.out.println();
            i++;
        }
        System.out.printf("Done....! \n");
    }}