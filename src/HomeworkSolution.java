import Homework.LatinSquare;

public class HomeworkSolution {
    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException("Exactly one argument should be passed!");
            }

            int squareLen = Integer.parseInt(args[0]);
            if (squareLen <= 0) {
                throw new IllegalArgumentException("The argument should be a strictly positive integer!");
            }

            long beginTime = System.nanoTime();

            LatinSquare latinSquare = new LatinSquare(squareLen);
            latinSquare.displayRows();
            latinSquare.displayColumns();

            long endTime = System.nanoTime();
            System.out.printf("Running time is: %d\n", endTime - beginTime);

        } catch (NumberFormatException exception) {
            System.out.println("The argument should be of type integer!");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}