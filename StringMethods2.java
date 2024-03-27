public class StringMethods2 {
    public static void main(String[] args) {
        // Using the length method
        String name = "John Doe";
        int nameLength = name.length();
        System.out.println("The length of the name " + name + " is: " + nameLength);

        // Using the equals method
        String name1 = "John Doe";
        String name2 = "Jane Doe";
        boolean areEqual = name1.equals(name2);
        System.out.println("are " + name1 + " and " + name2 + " equal? " + areEqual);

        // Using the compareTo method
        String name3 = "Jane Doe";
        int comparison = name1.compareTo(name3);
        System.out.println("The compareTo value of " + name1 + " and " + name3 + " is: " + comparison);

        // Using the substring method
        String fullName = "John Doe";
        String firstName = fullName.substring(0, 4);
        System.out.println("The first name of the person " + fullName + " is: " + firstName);

        // Using the concat method
        String firstName1 = "John";
        String lastName = "Doe";
        String fullName1 = firstName1.concat(" ").concat(lastName);
        System.out.println("The full name of the person " + firstName1 + " and " + lastName + " is: " + fullName1);

        // Using the charAt method
        String name4 = "John Doe";
        char initial = name4.charAt(0);
        System.out.println("The first letter of the name " + name4 + " is: " + initial);

        // Using the toUpperCase method
        String name5 = "jane doe";
        String nameInUppercase = name5.toUpperCase();
        System.out.println("The name " + name5 + " in upper case is: " + nameInUppercase);

        // Using the toLowerCase method
        String name6 = "Jane Doe";
        String nameInLowercase = name6.toLowerCase();
        System.out.println("The name " + name6 + " in lower case is: " + nameInLowercase);

        // Using the startsWith method
        String name7 = "John Doe";
        boolean startsWithJ = name7.startsWith("J");
        System.out.println("Does the name " + name7 + " start with J? " + startsWithJ);

        // Using the endsWith method
        String name8 = "John Doe";
        boolean endsWithE = name8.endsWith("e");
        System.out.println("Does the name " + name8 + " end with e? " + endsWithE);

        // Using the indexOf method
        String name9 = "John Doe";
        int indexOfD = name9.indexOf("D");
        System.out.println("The first occurrence of D in the name " + name9 + " is at position: " + indexOfD);

        // Using the lastIndexOf method
        String name10 = "John Doe Doe";
        int lastIndexOfD = name10.lastIndexOf("D");
        System.out.println("The last occurrence of D in the name " + name10 + " is at position: " + lastIndexOfD);

        // Using the replace method
        String name11 = "John Doe Doe";
        String replacedName = name11.replace("Doe", "Smith");
        System.out.println("The name " + name11 + " with Doe replaced by Smith is: " + replacedName);

        // Using the replaceFirst method
        String name12 = "John Doe Doe";
        String replacedFirstName = name12.replaceFirst("John", "Jane");
        System.out.println("The name " + name12 + " with the first occurrence of John replaced by Jane is: " + replacedFirstName);

        // Using the trim method
        String name13 = "