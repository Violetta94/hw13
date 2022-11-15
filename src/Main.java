public class Main {
    public static void main(String[] args) {

        Human maksim = new Human( "Максим", "Минск", 1988, "бренд-менеджером");
        Human anna = new Human("Аня", "Москва", 1993, "методистом образовательных программ");
        Human kate = new Human("Катя", "Калининград", 1992, "продакт-менеджером");
        Human artem = new Human("Артём", "Москва", 1995, "директором по развитию бизнеса");
        maksim.privet();
        anna.privet();
        kate.privet();
        artem.privet();


        Car lada = new Car( "Lada","Granta",1.7f , "yellow", 2015, "Russia");
        Car audi = new Car("Audi","A8 50 L TDI quattro", 3.0f, "black", 2020, "Germany" );
        Car bmw = new Car("BMW", "Z8", 3.0f,"black", 2021, "Germany");
        Car kia = new Car("Kia","Sportage 4-го поколения",2.4f,"red",2018, "South Korea");
        Car hyundai = new Car("Hyundai","Avante",1.6f,"orange",2016, "South Korea");
        lada.prez();
        audi.prez();
        bmw.prez();
        kia.prez();
        hyundai.prez();

    }
}