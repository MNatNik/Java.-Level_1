public class Lesson2 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        minMax();
    }
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        public static void invertArray() {
            System.out.println("Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;");
            int [] arr = { 1, 0, 1, 0, 0, 1 };
                for (int i = 0; i < arr.length; i++) {
                     if (arr [i] ==0) {
                         arr [i]=1;
                     } else {
                         arr [i]=0;
                     }
                    System.out.print(arr [i]+ " ");
                }
        }
    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         public static void fillArray() {
            System.out.println("\nЗадание 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21");
              int[] arr = new int[8];
                 int j = 0;
                 for (int i = 0; i < arr.length; i++) {
                     arr [i] = j;
                     j = j + 3;
                     System.out.print(arr [i]+ " ");
                }

        }
     //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        public static void changeArray() {
            System.out.println("\nЗадание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2");
             int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
                 for (int i = 0; i < arr.length; i++) {
                     if (arr [i] < 6) {
                         arr [i] *= 2;
                     }
                     System.out.print(arr [i]+ " ");
                 }
        }
      //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        public static void fillDiagonal() {
            System.out.println("\nЗадание 4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;");
            int[][] arr = new int[4][4];
            int counter = 1;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if(i == j) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = counter;
                    }
                    System.out.print("\t" + arr[i][j]);
                    counter++;
                }
                System.out.println();
            }
        }
       //5.	Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        public static void minMax() {
            System.out.println("\nЗадание 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)");
            int[] arr = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int min = arr[0];
            int max = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }
            System.out.println("Максимальный элемент массива = " + max);
            System.out.println("Минимальный элемент массива = " + min);
        }




















}
