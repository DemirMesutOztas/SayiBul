import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        Arrays.sort(list);

        for(int i=list.length-1; i>=0;i--)
        {
            //System.out.println(num + " > " + list[i]);
            if(num>list[i])
            {

                System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[i]);
                break;
            }

        }

        for(int i=0; i<list.length;i++)
        {
            if(num<list[i])
            {
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[i]);
                break;
            }



        }


    }
}
