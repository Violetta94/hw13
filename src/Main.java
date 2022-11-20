public class Main {
    public static void main(String[] args) {

        Human maksim = new Human( "Максим", "Минск", 1988, "бренд-менеджером");
        Human anna = new Human("Аня", "Москва", 1993, "методистом образовательных программ");
        Human kate = new Human("Катя", "Калининград", 1992, "продакт-менеджером");
        Human artem = new Human("Артём", "Москва", 1995, "директором по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 2001, "нигде не работает");
        maksim.privet();
        anna.privet();
        kate.privet();
        artem.privet();
        vladimir.privet();

        transport.Car lada = new transport.Car( "Lada","Granta",1.7f , "yellow", 2015, "Russia");
        transport.Car audi = new transport.Car("Audi","A8 50 L TDI quattro", 3.0f, "black", 2020, "Germany" );
        transport.Car bmw = new transport.Car("BMW", "Z8", 3.0f,"black", 2021, "Germany");
        transport.Car kia = new transport.Car("Kia","Sportage 4-го поколения",2.4f,"red",2018, "South Korea");
        transport.Car hyundai = new transport.Car("Hyundai","Avante",1.6f,"orange",2016, "South Korea");
        lada.prez();
        audi.prez();
        bmw.prez();
        kia.prez();
        hyundai.prez();


        Flowers rose = new Flowers("Роза обыкновенная", null, "Голландия",35.59,0);
        Flowers hrizantema = new Flowers ("Хризантема", "", "", 15, 5);
        Flowers pion = new Flowers("Пион", "","Англия", 69.9, 1);
        Flowers gipsofila = new Flowers("Гипсофила", "", "Турция", 19.5,10);
        pion.flowers();


    }
}