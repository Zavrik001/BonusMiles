public class Main {
    public static void main(String[] args) {

        int ticket = 27864; //Стоимость билета
        int costPerMile = 24; //Количество рублей, для бонусной мили

        int bonusMiles = ticket / costPerMile ; // Расчёт количества миль

        System.out.println("Начислено миль:" + bonusMiles);
    }
}