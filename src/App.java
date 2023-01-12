import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Holidays holidays = new Holidays();
        String holidayDate;

        System.out.println("Digite a data do feriado desejado ou 'todos' para ver o total de feriados do ano:");
        holidayDate = read.next();
        
        if (holidayDate.equals("todos")) {
            holidays.getAllHolidays();
        } else {
            System.out.println(holidays.getHoliday(holidayDate));
        }

    } 
}
