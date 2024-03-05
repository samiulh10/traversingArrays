import java.util.Arrays;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Algorithms a = new Algorithms();
        System.out.println("String target count");

        System.out.println(a.stringCount(new String[][] {{"Hello", "world", "!"},{"It's", "me", "Genevieve"}}, "e"));
        System.out.println(a.stringCount(new String[][] {{"sakib", "poopla", "!"},{"It's", "wow", "sam"}}, "s"));
        System.out.println(a.stringCount(new String[][] {{"yay", "very", "!"},{"It's", "well", "bowler"}}, "v"));

        System.out.println();

        System.out.println("Returns whether the int is contained in the 2D array");

        System.out.println(a.targetInArray((new int[][]{{1, 2}, {3, 4}}), 5));
        System.out.println(a.targetInArray((new int[][]{{5, 2}, {3, 4}}), 5));
        System.out.println(a.targetInArray((new int[][]{{7, 2}, {3, 9}}), 5));

        System.out.println();

        System.out.println("Returns an array of length two which contains the row and column indices of the first occurence of the int if it is found in the 2D array and [-1, -1] otherwise.");

        System.out.println(Arrays.toString(a.firstOccurence((new int[][]{{1, 2}, {3, 4}}), 3)));
        System.out.println(Arrays.toString(a.firstOccurence((new int[][]{{5, 2}, {3, 4}}), 5)));
        System.out.println(Arrays.toString(a.firstOccurence((new int[][]{{3, 7}, {3, 9}}), 3)));

        System.out.println();

        System.out.println("Returns an array containing the diagonal elements starting from the upper left.");

        System.out.println(Arrays.toString(a.diagonalArray(new int[][]{{1, 2,}, {3, 4}})));
        System.out.println(Arrays.toString(a.diagonalArray(new int[][]{{8, 2, 5}, {3, 4, 5}, {1, 2, 3}})));
        System.out.println(Arrays.toString(a.diagonalArray(new int[][]{{1, 2,}, {3, 6}})));

        System.out.println();

        System.out.println("Returns a string containing the concatenated strings (with spaces) in the column indicated by the int");

        System.out.println(a.concatenatedTarget(new String[][]{{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}}, 1));
        System.out.println(a.concatenatedTarget(new String[][]{{"poop,", "world", "!"}, {"It's", "yay", "idk"}}, 2));
        System.out.println(a.concatenatedTarget(new String[][]{{"Hi,", "cheeks", "!"}, {"It's", "compsci", "Margaret"}}, 1));

        System.out.println();

        System.out.println("Returns the maximum of the 2D array");

        System.out.println(a.maximum(new int[][] {{3, 2, 1}, {4, 5, 6}}));
        System.out.println(a.maximum(new int[][] {{3, 2, 1}, {4, 5, 9}}));
        System.out.println(a.maximum(new int[][] {{3, 1010101, 1}, {4, 5, 6}}));

        System.out.println();

        System.out.println("Returns the minumum of the 2D array");

        System.out.println(a.minimum(new int[][] {{3, 2, 1}, {4, 5, 6}}));
        System.out.println(a.minimum(new int[][] {{3, -10, 1}, {4, 5, 6}}));
        System.out.println(a.minimum(new int[][] {{3, 2, 1}, {4, 0, 6}}));

        System.out.println();

        System.out.println("Returns the shortest string in the 2D array");

        System.out.println(a.shortestString(new String[][] {{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}}));
        System.out.println(a.shortestString(new String[][] {{"Hello,", "world", ""}, {"It's", "me", "Margaret"}}));
        System.out.println(a.shortestString(new String[][] {{"Hello,", "world", "such a funny guy wow"}, {"It's", "me", "Margaret"}}));

        System.out.println();

        System.out.println("Returns the longest string in the 2D array");

        System.out.println(a.longestString(new String[][] {{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}}));
        System.out.println(a.longestString(new String[][] {{"Brooklyn Technical High School,", "world", "!"}, {"It's", "me", "Margaret"}}));
        System.out.println(a.longestString(new String[][] {{"Hello,", "Holmer is so funny", "!"}, {"It's", "me", "Bronx Science"}}));

        System.out.println();

        System.out.println("Returns the largest absolute difference between two corresponding elements of the 2D arrays");

        System.out.println(a.largestAbsoluteDifference(new int[][] {{2, 3, 4}, {-1, -2, -3}},new int[][] {{1, 2, 3}, {4, 5, 6}}));
        System.out.println(a.largestAbsoluteDifference(new int[][] {{421, 5, 4}, {-1, -2, -3}},new int[][] {{1, 2, 3}, {4, 256, 6}}));
        System.out.println(a.largestAbsoluteDifference(new int[][] {{2, 653, 1}, {-1, -2, -3}},new int[][] {{1, 2, 3}, {12345, 5, 6}}));

        System.out.println();

        System.out.println("Returns the mean average of the 2D array");

        System.out.println(a.meanAverage(new double[][] {{1.6, 3.2, 5.4}, {6.3, 4.1, 2.5}}));
        System.out.println(a.meanAverage(new double[][] {{51231.6, 32135.2, 5.52134}, {6.3, 4523.1, 2.5215}}));
        System.out.println(a.meanAverage(new double[][] {{4123, 3.2, 5412}, {6.52133, 45123, 2.35215}}));

        System.out.println();

        System.out.println("Returns whether the array contains two equivalent values");

        System.out.println(a.equivalentValues(new int[][] {{1, 2}, {3, 2}}));
        System.out.println(a.equivalentValues(new int[][] {{1, 2}, {3, 4}}));
        System.out.println(a.equivalentValues(new int[][] {{1, 2}, {1, 2}}));

        System.out.println();

        System.out.println("Returns the word that would appear last alphabetically.");

        System.out.println(a.lastAlphabetically(new String[][] {{"bravo", "charlie"}, {"zebra", "alpha"}}));
        System.out.println(a.lastAlphabetically(new String[][] {{"telephohne", "charlie"}, {"wow", "lewlwa"}}));
        System.out.println(a.lastAlphabetically(new String[][] {{"hagoo", "charlie"}, {"bat", "alpha"}}));

































    }
}
