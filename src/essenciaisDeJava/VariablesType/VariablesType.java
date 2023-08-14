package essenciaisDeJava.VariablesType;

public class VariablesType {
        public static void main(String[] args) {
                // tipos inteiros no java
                byte varTypeByte = 9;
                short varTypeShort = 1000;
                int varTypeInt = 1000000000;
                long varTypeLong = 1000000000;

                System.out.println("Var byte: " + varTypeByte);
                System.out.println("Var short: " + varTypeShort);
                System.out.println("var int: " + varTypeInt);
                System.out.println("var long: " + varTypeLong + "\n");

                // tipos float
                float varTypeFloat = 2000.59f; // é necessário adicionar o "f" ao final do numero para indicar que o
                                               // tipo é float
                double varTypeDouble = 2000.59;

                System.out.println("var float: " + varTypeFloat);
                System.out.println("var float: " + varTypeDouble + "\n");

                // tipo boolean
                boolean varTypeBoolean = true;
                System.out.println("var boolean: " + varTypeBoolean + "\n");

                // tipo char
                char varTypeChar = 'A';
                System.out.println("Var char: " + varTypeChar + "\n");

                // tipo string
                String varTypeString = "hello world";
                System.out.println("var string: " + varTypeString + "\n");

                // tipo array int
                int[] varTypeArrayInt = { 1, 2, 3, 4, 5 };
                for (int i : varTypeArrayInt) {
                        System.out.println("var array int: " + i);
                }

                System.out.println("\n");

                // tipo array string
                String[] varTypeArrayString = { "hello", "world", "!" };
                StringBuilder messageArrayString = new StringBuilder();

                for (String i : varTypeArrayString) {
                        messageArrayString.append(i).append(" ");
                }

                System.out.println("var array string: " + messageArrayString);

        }
}
