public class Array {
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};

        //traversal

        for(int x: arr)
        {
            System.out.println(x);
        }

        // max
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            
            if(max < arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);

        //2d array

        int[][] matrix={{1,2},{2,3},{3,6}};

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        

    }
}
