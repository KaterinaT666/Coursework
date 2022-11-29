import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
	private static final Employee[] EMPLOYEES = new Employee[10];
	public static void main(String[] args) {
		EMPLOYEES [0]= new Employee(" Семенов Геннадий Семенович", 1, 78000);
		EMPLOYEES [1]= new Employee(" Степанова Галина Олеговна", 2, 78000);
		EMPLOYEES [2]= new Employee(" Тимофеев Артём Игнатьевич", 5, 45000);
		EMPLOYEES [3]= new Employee(" Миронов Андрей Сергеевич ", 3, 54000);
		EMPLOYEES [4]= new Employee(" Тимохина Елена Юрьевна ", 4, 67000);
		EMPLOYEES [5]= new Employee(" Игнатенко Анастасия Михайловна", 5, 65000);
		EMPLOYEES [6]= new Employee(" Самойлов Игнат Андреевич", 1, 47000);
		EMPLOYEES [7]= new Employee(" Леонова Анна Геннадьевна ", 3, 51000);
		EMPLOYEES [8]= new Employee(" Васильева Татьяна Петровна", 4, 71000);
		EMPLOYEES [9]= new Employee(" Михальчук Виталий Алексеевич ", 2, 75000);

		printFullInfo();

	}
	private static void printFullInfo(){

		int sumSalary = 0;
		int i = 0;
		int ave = 0;
		int [] masSalary = new int[EMPLOYEES.length];

		for (Employee employee : EMPLOYEES){
			if (employee!= null) {
				sumSalary = sumSalary + employee.getSalary();
				masSalary[i] = employee.getSalary();
				i++;
				System.out.println(employee);
			}
		}
		ave = sumSalary / EMPLOYEES.length;

		System.out.println();
		System.out.println("Общие затраты на ЗП в мес: " + sumSalary);
		System.out.println("Минимальная ЗП: " + Arrays.stream(masSalary).min().getAsInt());
		System.out.println("Максимальная ЗП: " + Arrays.stream(masSalary).max().getAsInt());
		System.out.println("Средняя ЗП: " + ave);
		System.out.println();


		System.out.println("ФИО сотрудников:");
		i=0;
		for (Employee employee : EMPLOYEES){
			if (employee!= null) {
				i++;
				System.out.println(i + ". " + employee.getFullName());
			}
		}
	}


}