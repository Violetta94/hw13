public class Human {

   private int yearOfBirth;
   String name;
   private String town;
    String jobTitle;

    public Human(String name , String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    void privet() {
        System.out.println("Привет! Меня зовут " + getName()  + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + getJobTitle() + " Будем знакомы!");
    }

    public int getYearOfBirth() {
        if (yearOfBirth<=0) {
            yearOfBirth = Math.abs(yearOfBirth);
        }
        return yearOfBirth;
    }

    public String getName() {
        if (name == null || name == "") {
            name = "Информация не указана";
        }
        return name;
    }

    public String getTown() {
        if (town == null || town == "") {
            town = "Информация не указана";
        }
        return town;
    }

    public String getJobTitle() {
        if (jobTitle == null || jobTitle == "") {
            jobTitle = "Информация не указана";
        }
        return jobTitle;
    }
}
