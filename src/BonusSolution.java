import Bonus.CyclicGraphSolver;
import Bonus.RegularGraphSolver;

public class BonusSolution {
    public static void main(String[] args) {
        try {
            if (args.length != 1 && args.length != 2) {
                throw new IllegalArgumentException("One or two arguments should be passed!");
            }

            int nodeNr = Integer.parseInt(args[0]);
            if (nodeNr <= 0) {
                throw new IllegalArgumentException("The first argument should be a strictly positive integer!");
            }

            if (args.length == 1) {
                // only one argument passed => solve the first part
                CyclicGraphSolver.run(nodeNr);
            } else {
                // two arguments passed => solve the second part
                int kIndex = Integer.parseInt(args[1]);
                if (kIndex < 0) {
                    throw new IllegalArgumentException("The second argument should be a non-negative integer!");
                }
                RegularGraphSolver.run(nodeNr, kIndex);
            }
        } catch (NumberFormatException err) {
            System.out.println("Incorrect type of the argument. Integer expected.");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
