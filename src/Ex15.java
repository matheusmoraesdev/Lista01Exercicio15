import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) throws Exception {
        double salario_hora,horas,salario_bruto,salario_liquido;
        double inss = 8.0 / 100.0,ir = 11.0 / 100.0,sindicato = 5.0 / 100.0;
        
    Scanner reader = new Scanner(System.in);
        System.out.print("Quantos você ganhar por hora? R$ ");
            salario_hora = reader.nextDouble();
        System.out.print("Quantas horas trabalha por mês? ");
            horas = reader.nextDouble();
            reader.close();
    
        /*A.*/salario_bruto = salario_hora * horas;
        System.out.println("A. Seu salário bruto é de R$ " + salario_bruto + " por mês!");
        /*B.*/inss = (inss * salario_bruto);
        System.out.println("B. Você pagou R$ " + inss + " ao INSS!");
        /*C.*/sindicato = (sindicato * salario_bruto);
        System.out.println("C. Você pagou R$ " + sindicato + " ao Sindicato!");
        /*D.*/ir = (ir * salario_bruto);
              salario_liquido = salario_bruto - (sindicato + inss + ir);
        System.out.println("D. Seu salário liquido é de R$ " + salario_liquido + " por mês!");
        /*E.*/ System.out.println("E.   + Salário Bruto : R$ " + salario_bruto);
               System.out.println("     - IR (11%) : R$ " + (salario_bruto - ir));
               System.out.println("     - INSS (8%) : R$ " + (salario_bruto - inss));
               System.out.println("     - Sindicato ( 5%) : R$ " + (salario_bruto - sindicato));
               System.out.println("     = Salário Liquido : R$ " + salario_liquido);
    }
}
