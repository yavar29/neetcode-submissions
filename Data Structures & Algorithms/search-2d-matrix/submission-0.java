class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;

        while(right-left>1){
            int mid = (left+right)/2;
            if(isBefore(mid, matrix, target)){
                left = mid;
            }
            else{
                right = mid;
            }
        }

        if (matrix[left / matrix[0].length][left % matrix[0].length] == target) {
            return true;
        }
        if (matrix[right / matrix[0].length][right % matrix[0].length] == target) {
            return true;
        }
        return false;


    }

    public boolean isBefore(int i, int[][] matrix, int target){
        int row= i / matrix[0].length;
        int column= i % matrix[0].length;
        if(matrix[row][column]<target) return true;
        return false;
    }
}