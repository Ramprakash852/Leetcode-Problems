class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int coloum = matrix[0].length-1;
        while(row<matrix.length && coloum>=0){
            if(target==matrix[row][coloum]) return true;
            else if(target < matrix[row][coloum]) coloum--;
            else row++;
        }  
        return false;
    }
}