class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top boundary
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            // Right boundary
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            // Bottom boundary
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) break;
                result.add(matrix[endRow][j]);
            }

            // Left boundary
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) break;
                result.add(matrix[i][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return result;
    }
}