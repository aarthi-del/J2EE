package pp;

public class Demo {
    public static boolean isSudokuCompliant(int[][] matrix) {
        for (int row = 0; row < 9; row++) {
            if (!isUnique(matrix[row])) {
                return false;
            }
        }

        for (int col = 0; col < 9; col++) {
            int[] columnData = new int[9];
            for (int row = 0; row < 9; row++) {
                columnData[row] = matrix[row][col];
            }
            if (!isUnique(columnData)) {
                return false;
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int[] smallMatrixData = new int[9];
                int index = 0;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        smallMatrixData[index++] = matrix[x][y];
                    }
                }
                if (!isUnique(smallMatrixData)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isUnique(int[] data) {
        boolean[] visited = new boolean[10];
        for (int num : data) {
            if (num < 1 || num > 9 || visited[num]) {
                return false;
            }
            visited[num] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] sampleMatrix = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        boolean result = isSudokuCompliant(sampleMatrix);
        System.out.println(result); 
    }
}

