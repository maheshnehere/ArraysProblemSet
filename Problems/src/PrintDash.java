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


    }
}
