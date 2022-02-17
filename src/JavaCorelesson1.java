public class JavaCorelesson1 {
    public static void main(String[] args) {

// примитівні типи даних

        boolean b = true;
        char letterA = 'A';
        byte b1 = -50;
        short s = 15235;
        short s1 = -5235;
        int i1 = 15;
        long l1 = 100000L;
        float f = 54.4f;
        double d = 4526.5;

        // Примитиви


        System.out.println("Character MAX_VALUE =" + Character.MAX_VALUE);
        System.out.println("Character MIN_VALUE =" + Character.MIN_VALUE);
        System.out.println("Byte MAX_VALUE =" + Byte.MAX_VALUE);
        System.out.println("Byte MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("Short MAX_VALUE =" + Short.MAX_VALUE);
        System.out.println("Short MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("Integer MAX_VALUE =" + Integer.MAX_VALUE);
        System.out.println("Integer MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("Long MAX_VALUE =" + Long.MAX_VALUE);
        System.out.println("Float MAX_VALUE =" + Float.MAX_VALUE);
        System.out.println("Float MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println(" Double MAX_VALUE =" + Double.MAX_VALUE);
        System.out.println(" Double MIN_VALUE=" + Double.MIN_VALUE);

//Масив


        int mas[] = {5, 6, 15, 48, 12, 95, 63, 11, 9, 1};

        int maxNumber = 0;
        int minNumber = 100;

        for (int i = 0; i < mas.length; i++) {
            if (maxNumber <= mas[i]) {
                maxNumber = mas[i];

            }
            if (minNumber >= mas[i]) {
                minNumber = mas[i];
            }

        }
        System.out.println("Максимальний елемент " + maxNumber);
        System.out.println("Минимальный элемент: " + minNumber);


    }
    }











