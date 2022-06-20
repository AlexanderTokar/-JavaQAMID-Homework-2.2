public class Main {
    public static void main(String[] args) {
        int clientAccount = 100; // Сумма на счете клиента
        int amount = 1100; // Сумма пополнения
        int bonus = amount / 100; // Формула расчета бонуса
        if (amount <= 1000) {
            bonus = 0;
        }
        System.out.println("Ваш бонус: " + bonus + " рубля(ей)"); // Вывод количества бонусов
        int totalScore = clientAccount + bonus + amount; // Сумма на счете клиента с учетом бонуса
        System.out.println("Ваш счет: " + totalScore + " рубля(ей)"); // Вывод значения итоговой суммы на счете клиента
    }

}
