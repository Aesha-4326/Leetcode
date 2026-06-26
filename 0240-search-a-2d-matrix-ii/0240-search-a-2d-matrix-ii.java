class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length-1;
        int j = 0; 
        int m = matrix[0].length;
        while(j<m && i>=0){
            if(matrix[i][j] == target){
                return true;
            } else if(matrix[i][j] > target){
                i--;
            } else{
                j++;
            }
        }
    return false;
    }
}