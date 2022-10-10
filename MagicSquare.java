import java.util.Scanner;
import java.util.*;
public class MagicSquare
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int dimension; 
        System.out.println("Please enter an odd number for the dimension of the magic square that you want to construct: ");
        dimension =sc.nextInt();
        while(dimension%2 == 0)
        {
            System.out.println("Please enter an odd dimension for magic square: ");
            dimension =sc.nextInt();
        }
        magic(dimension);
    }
    
    public static void magic(int dimension)
    {
        int [][]array=new int[dimension][dimension];
        int k =1;
        int i=0;
        int j=array[0].length/2;
        int sum=0;
        while(array[array.length-1][array[0].length/2]==0)
            {
                if(i<0 && j<array[0].length)
                {
                    array[array.length-1][j]=k;
                    i=array.length-2;
                    k++;
                    j++;
                }
                else if(i>=0 && j==array[0].length)
                {
                    array[i][0]=k;
                    j=1;
                    k++;
                    i--;
                }
                else if((i>=0 && i<array.length && j<array[0].length && array[i][j]!=0)||(i<0 && j==array[0].length))
                {
                    array[i+2][j-1]=k;
                    k++;
                    i++;
                }
                else 
                {
                    array[i][j]=k;
                    k++;
                    i--;
                    j++;
                }
            }
            
        for(int count=0; count<array.length; count++)
        {
            sum+= array[0][count];
        }
        System.out.println (dimension+ "X" +dimension + "    Sum: "+sum);
        
        for(int r=0; r<array.length; r++)
        {
            for(int c=0; c<array[r].length; c++)
            {
                System.out.print (array[r][c] + "  ");
            }
            System.out.println();
        }
    }
}
