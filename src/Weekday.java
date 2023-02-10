public class Weekday {
    public static void main(String[] args) {
        defineWeekDay();
    }
    
    public static void defineWeekDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифу от 1 до 7 :");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("понедельник");
        } else if (number == 2) {
            System.out.println("Вторник");
        } else if (number == 3) {
            System.out.println("Среда");
        } else if (number == 4) {
            System.out.println("Четверг");
        } else if (number == 5) {
            System.out.println("Пятница");
        } else if (number == 6 || number == 7) {
            System.out.println("Выходные");
        } else {
            System.out.println("Не подходящее число!");
            defineWeekDay();
        }
    }
}
