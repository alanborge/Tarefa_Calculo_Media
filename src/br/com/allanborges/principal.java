package br.com.allanborges;

import java.util.Scanner;

/**
 * @author allan
 * calculo media
 */
public class principal {
    /**
     *
     * @param args principal
     */
    public static void main(String[] args) {
        NotaValoresSetados();
        LeiturasDasNotas();
    }
    /**
     * tras a leitura das notas
     */
    public static  void LeiturasDasNotas(){
        Scanner input = new Scanner(System.in);
        Calcula_Media calc = new Calcula_Media();
        System.out.println("---------------------------------------------------------");
        System.out.println("----------------Fazendo leitura dos dados----------------");
        System.out.println("informe a 1º nota");
        calc.getNota1();
        calc.setNota1(input.nextDouble());
        System.out.println("informe a 2º nota");
        calc.getNota2();
        calc.setNota2(input.nextDouble());
        System.out.println("informe a 3º nota");
        calc.getNota3();
        calc.setNota3(input.nextDouble());
        System.out.println("informe a 4ª nota");
        calc.getNota4();
        calc.setNota4(input.nextDouble());

        System.out.println("------------- Total da Media com Scanner ---------------");
        System.out.println((( calc.getNota1() + calc.getNota2() + calc.getNota3() + calc.getNota4() )/ 4));
    }

    /**
     * traz os valores setados
     */
    public static void NotaValoresSetados(){
        Calcula_Media calc = new Calcula_Media();
        calc.setNota1(6.5);
        calc.getNota1();
        calc.setNota2(8.4);
        calc.getNota2();
        calc.setNota3(5.7);
        calc.getNota3();
        calc.setNota4(7.5);
        calc.getNota4();
        System.out.println("-------------Totaal Media Valor Setado-------------------");
        double MediaTotal =(( calc.getNota1() + calc.getNota2() + calc.getNota3() + calc.getNota4() )/ 4);
        System.out.println(MediaTotal);
    }



}
