Write a java program using try-catch block to handle java.lang.ArrayIndexOutOfBoundsExceptionpublic class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = new int[5];
        try {
            for (int i = 0; i < numbers.length; i++) {
                result[i + 1] = numbers[i] * 2;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("Result[" + i + "] = " + result[i]);
        }
    }
}