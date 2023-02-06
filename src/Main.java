public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1(){
        System.out.println("Задача 1");
        for (int i = 0; i < 10 ; i = i + 1){
            System.out.println(" Итерация цикла " + i);
        }
        System.out.println();
    }
    public static void task2(){
        System.out.println("Задача 2");
        for (int i = 10; i > 0 ; i= i - 1){
            System.out.println("Итерация цикла " + i);
        }
    }
}