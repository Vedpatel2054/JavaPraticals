public class StringBufferMethods {
    public static void main(String[] args) {
        // Using the length method
        StringBuffer sb = new StringBuffer("Hello World");
        int length = sb.length();
        System.out.println("The length of the string " + sb.toString() + " is: " + length);

        // Using the capacity method
        int capacity = sb.capacity();
        System.out.println("The capacity of the string " + sb.toString() + " is: " + capacity);

        // Using the append method
        String hello = "Hello";
        String world = "World";
        sb.append(" ").append(hello).append(" ").append(world);
        System.out.println("The string " + sb.toString() + " after appending Hello World is: " + sb.toString());

        // Using the insert method
        String newString = "!!!";
        int position = 5;
        sb.insert(position, newString);
        System.out.println("The string " + sb.toString() + " after inserting " + newString + " at position " + position + " is: " + sb.toString());

        // Using the replace method
        String oldString = "World";
        String newString1 = "Java";
        int start = 5;
        int end = 10;
        sb.replace(start, end, newString1);
        System.out.println("The string " + sb.toString() + " after replacing " + oldString + " with " + newString1 + " from position " + start + " to " + end + " is: " + sb.toString());

        // Using the delete method
        int start1 = 0;
        int end1 = 5;
        sb.delete(start1, end1);
        System.out.println("The string " + sb.toString() + " after deleting from position " + start1 + " to " + end1 + " is: " + sb.toString());

        // Using the reverse method
        sb.reverse();
        System.out.println("The string " + sb.toString() + " after reversing is: " + sb.toString());

        // Using the setCharAt method
        int position1 = 5;
        char newChar = 'J';
        sb.setCharAt(position1, newChar);
        System.out.println("The string " + sb.toString() + " after setting the character at position " + position1 + " to " + newChar + " is: " + sb.toString());

        // Using the ensureCapacity method
        int newCapacity = 15;
        sb.ensureCapacity(newCapacity);
        System.out.println("The capacity of the string " + sb.toString() + " after ensureCapacity is: " + sb.capacity());

        // Using the substring method
        int start2 = 5;
        int end2 = 10;
        String substring = sb.substring(start2, end2);
        System.out.println("The substring of " + sb.toString() + " from position " + start2 + " to " + end2 + " is: " + substring);

    }
}