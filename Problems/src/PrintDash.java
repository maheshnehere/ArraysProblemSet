import java.util.Arrays;

public class PrintDash {
    public static void main(String[] args) {
        int [][] ch = new int [10][10];

        for (int i = 0;i<10;i++)
        {
            for (int j = 0; j <10 ; j++) {

                System.out.printf("%2d",ch[i][j]);
            }
            System.out.println();
        }

        // find average of elements in array

        int [] num = {1,3,4,3,6,7,3};
        int sum =0;
        int count =0;

        for (int i = 0; i < num.length; i++) {
            count++;
            sum+=num[i];

        }

        int average = sum/count;

        System.out.println(" Average of num is: "+average);


        int [] num1 = {2,1,3,4,5,6,7};

        boolean findnum =false;

        for (int i = 0; i < num.length; i++) {
            if (num1[i]==8){

                findnum=true;
            }

        }

        if (findnum){
            System.out.println("Number is present:"+findnum);
        }
        else {
            System.out.println("Number is present: "+findnum);
        }


        int[] num2 = {1,2,3,4,5,6};

        int findindex=0;

        for (int i = 0; i < num2.length; i++) {
           if (num2[i]==2){
               findindex++;
           }
        }
        System.out.println("Index of num is: "+findindex);


        int [] num3 = {1,2,3,4,5,6,7};

        int result = 0;
        int index = 0;

        for (int i= 0;i< num3.length;i++)
        {
             result = num3[i];
            System.out.print(result);

             index = i;
            System.out.print(index);
        }



    }
}
