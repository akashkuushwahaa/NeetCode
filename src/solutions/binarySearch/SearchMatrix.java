package solutions.binarySearch;

public class SearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {

            if (matrix[r][c] == target)
                return true;

            if (matrix[r][c] < target)
                r++;
            else
                c--;
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1,2,4,8},
            {10,11,12,13},
            {14,20,30,40}
        };

        int target = 10;

        System.out.println(searchMatrix(matrix, target));
    }
}
