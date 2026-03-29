public class StringManipulation {
    public static void main(String[] args){
        String fullName1 = "Mwaba Kotati";
        String fullName2 = "Chanda Kotati ";
        String lastName1 = "Kotati";
        String lastName2 = "kotati";
        String firstName1 = "Mwaba";
        String firstName2 = "Chanda";
        //equals:
        System.out.println(lastName1.equals(lastName2));
        System.out.println(lastName1.equalsIgnoreCase(lastName2));
        //starts with & ends with
        System.out.println(fullName1.startsWith("mwa"));
        System.out.println(fullName2.endsWith("ati"));
        //trim
        System.out.println(fullName2.trim().endsWith("ati"));
        //split
        String[] nameParts = fullName1.split("\\s");
        System.out.println(nameParts);
        //upper and lower cases
        System.out.println(lastName2.toUpperCase());
        System.out.println(lastName1.toLowerCase());
        //replace
        System.out.println(firstName1.replace('a', 'e'));
        System.out.println(fullName2.replaceAll("\\s", "+"));
        //contains
        System.out.println(firstName2.contains("Ch"));
        //length
        System.out.println(firstName2.length());
        //charAt()
        System.out.println(firstName1.charAt(3));
        //substring()
        System.out.println(fullName1.substring(3, 7));
        //==
        System.out.println(fullName1 == fullName2);
    }
}
/*
A string is an object that represents a sequence of characters.
The String class in Java is provided as a part of the standard Java library  and offers various methods to perform
operations on strings
1. equals()
checks if two strings are exactly the same (case-sensitive)
str1.equals(str2)
2. equalsIgnoreCase()
checks if two strings are equal, ignoring the case difference
str1.equalsIgnoreCase(str2)
3. startsWith()
checks if a string begins with a specific prefix (case-sensitive)
str.startsWith(prefix)
4. endsWith()
checks if a string ends with a specific suffix (case-sensitive)
str.endsWith(suffix)
5. trim()
remove leading and trailing whitespaces
str.trim()
6. split()
breaks a string into parts based on a delimeter (separator) and returns an array of strings
str.split(delimeter)
7. toUpperCase()
converts all characters in a string to upper case
str.toUpperCase()
8. toLowerCase()
converts all characters in a string to lower case
str.toLowerCase
9. contains()
checks if a string contains a specific sequence of characters (case-sensitive, returns boolean, checks anywhere in the
string)
str.contains(sequence)
10. replace()
replaces all occurrences of a specific character or substring with another
str.replace(oldValue, newValue)
11. replaceAll()
replaces parts of  a string using a regular expression
str.replaceAll(regex, replacement)
12. compareTo()
compares two strings alphabetically (case-sensitive)
returns an integer:
result  meaning
0       Strings are equal
<0      str1 comes before str2
>0      str1 comes after str2
str1.compareTo(str2)
13. length()
returns the number of characters in a string
14. charAt()
returns the character at a specific index in the string
str.charAt(index)
15. subString()
returns a part of a string between specified indices
a) from start index to the end of the string
str.substring(startIndex)
b) from start index to end index
str.substring(startIndex, endIndex)
start index is inclusive and end index is exclusive
== compares the memory location of variables
*/