import java.util.Scanner;
public class DoraGarden {
    public static void main(String args[])
    {
       Scanner scanner=new Scanner(System.in);
       int trees[][];
       int temp=1;
       int rows=scanner.nextInt();
       int columns=scanner.nextInt();
       trees=new int[rows][columns];
       for(int i=0;i<rows;i++) {
           for (int j = 0; j < columns; j++) {
               trees[i][j] = temp;
               temp++;

           }
       }
//        for(int i=0; i<rows; i++)
//        {
//            for(int j=0; j<columns; j++)
//            {
//                System.out.print(trees[i][j]+"\t");
//            }
//            System.out.println();
//        }
        int flag =0;
        int tree_number=scanner.nextInt();
       if(tree_number>0 && tree_number <=(rows*columns)) {
           //checking in first row
           for (int x : trees[0]) {
               if (x == tree_number)
                   flag=1;
                   //System.out.println("Mango Tree");
           }
           //checking in first and last columns
           for (int i = 1; i < rows; i++) {
               if ((trees[i][0] == tree_number) || (trees[i][columns-1] == tree_number))
                   //System.out.println("Mango Tree");
                   flag =1;
           }
       }
           if(flag==1)
               System.out.println("Mango Tree");
           else if(tree_number <= 0 || tree_number > (rows*columns))
            System.out.println("No tree");
           else
               System.out.println("Not a Mango Tree");
    }
}
