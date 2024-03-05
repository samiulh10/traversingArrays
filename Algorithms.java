import java.util.Arrays;
import java.util.ArrayList;
public class Algorithms {
    public int stringCount(String[][] strings, String s) {
        int count = 0;
        for (String[] row: strings) {
            for (String word: row) {
                if (word.contains(s)) {
                    count++;
                }

            }
        }
        return count;
    }

    public boolean targetInArray(int[][] ints, int i) {
        for (int[] nums: ints) {
            for (int num: nums) {
                if (num == i) return true;
            }
        }
        return false;
    }

    public int[] firstOccurence(int[][] ints, int i) {
        for (int j = 0; j < ints.length; j++) {
            for (int k = 0; k < ints[j].length; k++) {
                if (ints[j][k] == i) return new int[] {j, k};
            }
        }
        return new int[] {-1, -1};
    }

    public int[] diagonalArray(int[][] ints) {
        int rowSize = ints[0].length;
        int[] diagonalArray = new int[rowSize];

        for (int i = 0; i < rowSize; i++) {
            diagonalArray[i] = ints[i][i];
        }
        return diagonalArray;
    }

    public String concatenatedTarget(String[][] strings, int target) {
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            result += strings[i][target];
            result += " ";
        }
        return result;
    }

    public int maximum(int[][] ints) {
        int maximum = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] > maximum) maximum = ints[i][j];
            }
        }
        return maximum;
    }

    public int minimum(int[][] ints) {
        int minimum = ints[0][0];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] < minimum) minimum = ints[i][j];
            }
        }
        return minimum;
    }

    public String shortestString(String[][] strings) {
        String shortestString = strings[0][0];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                if (strings[i][j].length() < shortestString.length()) shortestString = strings[i][j];
            }
        }
        return shortestString;
    }

    public String longestString(String[][] strings) {
        String longestString = strings[0][0];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                if (strings[i][j].length() > longestString.length()) longestString = strings[i][j];
            }
        }
        return longestString;
    }

    public int largestAbsoluteDifference(int[][] ints1, int[][] ints2) {
        int largest = 0;
        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints1[i].length; j++) {
                if (Math.abs((ints1[i][j]) - ints2[i][j]) > largest) largest = Math.abs((ints1[i][j]) - ints2[i][j]);
            }
        }
        return largest;
    }

    public double meanAverage(double[][] ints) {
        double fullCount = 0;
        int numCount = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                fullCount += ints[i][j];
                numCount++;
            }
        }
        return fullCount / numCount;
    }

    public boolean equivalentValues(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int m = i; m < array.length; m++) {
                    int k;
                    if (m == i) {
                        k = j + 1;
                    } else {
                        k = 0;
                    }
                    for (int n = k; n < array[m].length; n++) {
                        if (array[i][j] == array[m][n]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String lastAlphabetically(String[][] words) {
        String first = words[0][0];
        for (String[] row : words) {
            for (String word : row) {
                if (word.compareTo(first) > 0) {
                    first = word;
                }
            }
        }
        return first;
    }
}
