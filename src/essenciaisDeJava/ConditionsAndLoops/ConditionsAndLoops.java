package essenciaisDeJava.ConditionsAndLoops;

public class ConditionsAndLoops {
    public static void main(String[] args) {
        System.out.println("\n");
        boolean condition = true;

        // condicional 'if'
        if (condition) {
            System.out.println("vai ser exibido se a variável 'condition' for 'true'");
        }

        // condicional 'if' e 'else'
        boolean shouldBeFalse = false;
        if (shouldBeFalse) {
            System.out.println("vai ser exibido se a variável 'shouldBeFalse' for 'true'");
        } else {
            System.out.println("vai ser exibido se a variável 'shouldBeFalse' for 'false'");
        }

        /**********************************************************************************/

        int[] numbers = { 1, 2, 3, 4, 5 };

        // loop for
        System.out.println("\nLOOP FOR: \n");

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        // loop foreach
        System.out.println("\nLOOP FOREACH: \n");

        for (int index : numbers) {
            int indexFormat = index - 1;

            System.out.println(numbers[indexFormat]);
        }

        // loop while
        System.out.println("\nLOOP WHILE: \n");

        boolean continueLoop = true;
        int index = 0;

        while (continueLoop) {
            System.out.println(numbers[index]);
            index += 1;

            if (index == numbers.length) {
                continueLoop = false;
            }
        }
    }
}
