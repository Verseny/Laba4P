import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {

        int count1 = 0;
        Pattern pp = Pattern.compile("(\\W)*\\d(\\W)*\\d(\\W)*\\d(\\W)*\\d(\\W)*\\d(\\W)*\\d(\\W)*\\d(\\W)*\\d(\\W)*\\d(\\W)*\\d(\\W)*\\d(\\W)*");

        String fileName = "C:\\Users\\User\\Videos\\untitled2\\lal.txt";
        BufferedReader in;
        try
        {
            in = new BufferedReader(new FileReader(fileName));
            String s;
            while ((s = in.readLine()) != null) {

                Matcher matcher1 = pp.matcher(s);
                while (matcher1.find()) {
                    System.out.println(s);
                    String[] result = s.split("-*"+" *"+"");
                    for(int x = 0; x<result.length; x++)
                        System.out.print(result [x] + "");
                    System.out.println("+");
                    System.out.print(result [1]);
                    System.out.print(" (");
                    System.out.print(result [2]);
                    System.out.print(result [3]);
                    System.out.print(result [4]);
                    System.out.print(") ");
                    for(int x = 5; x<result.length; x++)
                        System.out.print(result [x]);
                    System.out.println();
                }
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}