public class Main {
    public static void main(String[] args) {
        // cоздаем счет клиента и кладем 15 000 сом на счет
        BankAccount account = new BankAccount(15000);

        try {
            // пытаемся снять через бесконечный цикл по 6000 сом на каждой итерации
            while (true) {
                account.withDraw(6000);
                System.out.println("Снято 6000 сом. Остаток на счете: " + account.getAmount() + " сом");
            }
        } catch (LimitException e) {
            // при возникновении исключения LimitException выводим оставшуюся сумму и завершаем цикл
            System.out.println("Сумма на снятие больше, чем остаток на счете. Снято: " + e.getRemainingAmount() + " сом");
        }
    }
}