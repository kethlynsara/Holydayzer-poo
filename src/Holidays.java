public class Holidays {
    private Holiday[] array = new Holiday[]{
        new Holiday("Confraternização mundial", "01/01/2023"),
        new Holiday("Carnaval", "21/02/2023"),
        new Holiday("Páscoa", "17/04/2023"),
        new Holiday("Tiradentes", "21/04/2023"),
        new Holiday("Dia do trabalho", "01/05/2023"),
        new Holiday("Corpus Christi", "08/06/2023"),
        new Holiday("Independência do Brasil", "07/09/2023"),
        new Holiday("Nossa Senhora Aparecida", "12/10/2023"),
        new Holiday("Finados", "02/11/2023"),
        new Holiday("Proclamação da República", "15/11/2023"),
        new Holiday("Natal", "25/12/2023")
    };

    public String getHoliday(String date) {
        for (int i = 0; i < array.length; i++) {
            if (date.equals(array[i].date)) {
                return array[i].name;
            }
        }
        return "Não existe feriado nessa data!";
    }

    public void getAllHolidays() {
        for (Holiday holiday : array) {
            System.out.println(holiday.name + ": " + holiday.date);
        }
    }
}
