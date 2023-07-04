public class Main {
// уровень сложности: 1. Создайте строку через new - I study Basic Java!
//    Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//    Распечатать пред-последний символ строки. Используем метод String.charAt().
//    Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
// Вырезать строку Java c помощью метода String.substring().
//    Заменить все символы “а” на “о”.//
//    Преобразуйте строку к верхнему регистру.
//    Преобразуйте строку к нижнему регистру.

////1
//            public static void main(String[] args) {
//                String str = new String("I study Basic Java!");
//                printString(str);
//            }
//            //2
//            public static void printString(String input) {
//                System.out.println(input);
//            }
//            //3
//    public static void printSecondToLastCharacter(String input) {
//        int length = input.length();
//        if (length >= 2) {
//            char secondToLastChar = input.charAt(length - 2);
//            System.out.println("Second to last character: " + secondToLastChar);
//        } else {
//            System.out.println("String is too short to have a second to last character.");
//        }
//
//    }
//    //4
//    public static boolean containsSubstring(String input, String substring) {
//        return input.contains(substring);
//    }
//    public static void main(String[] args) {
//        String str = "I study Basic Java!";
//        String substring = extractSubstring(str);
//        System.out.println("Substring: " + substring);
//    }

    //5
//    public static String extractSubstring(String input) {
//        int startIndex = input.indexOf("Java");
//        int endIndex = startIndex + "Java".length();
//
//        if (startIndex != -1) {
//            return input.substring(startIndex, endIndex);
//        } else {
//            return "";  // Подстрока "Java" не найдена
//        }
//
//    }
//        }

    //6
//    public static void main(String[] args) {
//        String str = "I study Basic Java!";
//        String replacedString = replaceCharacters(str, 'a', 'o');
//        System.out.println("Replaced string: " + replacedString);
//    }
//
//    public static String replaceCharacters(String input, char oldChar, char newChar) {
//        return input.replace(oldChar, newChar);
//    }
//}

    //7
//    public static void main(String[] args) {
//        String str = "I study Basic Java!";
//        String uppercaseString = convertToUppercase(str);
//        System.out.println("Uppercase string: " + uppercaseString);
//    }
//
//    public static String convertToUppercase(String input) {
//        return input.toUpperCase();
//    }
//}

   //8
       public static void main(String[] args) {
           String str = "I study Basic Java!";
           String lowercaseString = convertToLowerCase(str);
           System.out.println("Lowercase string: " + lowercaseString);
       }

       public static String convertToLowerCase(String input) {
           return input.toLowerCase();
       }
   }



