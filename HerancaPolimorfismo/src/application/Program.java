package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de funcionários");
        int qtdFuncionario = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= qtdFuncionario; i++) {
            System.out.println("Digite os dados do funcionario " + i);
            System.out.println("Outsourced (y/n)?");
            char tipoFuncionario = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Nome");
            String nome = sc.nextLine();
            System.out.println("Horas");
            int hoursFuncionario = sc.nextInt();
            System.out.println("Valor por hora");
            Double valorPorHoraFuncionario = sc.nextDouble();

            if(tipoFuncionario == 'y'){
                System.out.println("Additional charge");
                Double additionalChargeFuncionario = sc.nextDouble();
                employees.add(new OutsourcedEmployee(nome,hoursFuncionario,valorPorHoraFuncionario, additionalChargeFuncionario));
            }else {
                employees.add(new Employee(nome,hoursFuncionario,valorPorHoraFuncionario));
            }
        }

        System.out.println();
        System.out.println("Pagamentos");
        for (Employee employee: employees) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }

        sc.close();
    }
}
