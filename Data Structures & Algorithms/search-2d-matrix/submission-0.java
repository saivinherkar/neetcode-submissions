class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lt = 0;
        int rt = m*n-1;

        while(lt<=rt){
            int mid = lt + (rt-lt)/2;
            int r = mid/n;
            int c = mid%n;

            if(matrix[r][c] == target) return true;
            else if (matrix[r][c]>target){
                rt = mid-1;
            } else{
                lt = mid+1;
            }
        }
        return false;                                       
    }
}
