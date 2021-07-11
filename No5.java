import java.util.*;

public class No5 {
    public static void main(String args[]) {
        
        String Original;
        String Leave = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Input kata atau kalimat disini : ");
        Original = input.nextLine();
        for (int i = Original.length() - 1; i >= 0; i--)
        {
            Leave += Original.charAt(i);
        }
        System.out.println("Hasil kata yang di balik ; " + Leave );
        }
}