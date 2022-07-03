import java.util.Scanner;

public class Help {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        byte a;

        System.out.println("Выберите необходимый оператор из справки (1-7)");
        System.out.println("Справка:");
        System.out.println("1.if");
        System.out.println("2.switch");
        System.out.println("3.for");
        System.out.println("4.while");
        System.out.println("5.do-while");
        System.out.println("6.break");
        System.out.println("7.continue");
        a = input.nextByte();


        if (a == 1) {
            System.out.println("Oпepaтop if:\n");
            System.out.println("if(ycлoвиe) оператор;");
            System.out.println("else оператор;");
        }
        if (a == 2) {
            System.out.println("Oпepaтop switch:\n");
            System.out.println("switch(выpaжeниe) {");
            System.out.println(" case константа:");
            System.out.println(" последовательность операторов");
            System.out.println(" break;");
        }
        if (a == 3) {
            System.out.println("Oпepaтop for:\n");
            System.out.println("for(инициaлизaция; условие; итерация)");
            System.out.println(" оператор;");
        }
        if (a == 4) {
            System.out.println("Oпepaтop while:\n");
            System.out.println("while(ycлoвиe) оператор;");
        }
        if (a == 5) {
            System.out.println("Oпepaтop do-while:\n");
            System.out.println("do {");
            System.out.println(" оператор;");
            System.out.println("} while (условие)");
        }
        if (a == 6) {
            System.out.println("Oпepaтop break:\n");
            System.out.println("break; или break метка;");
        }
        if (a == 7) {
            System.out.println("Oпepaтop continue:\n");
            System.out.println("continue; или continue метка;");
        }

        else  {
            System.out.println();
            System.out.println("Выберите необходимый оператор из справки (1-7)");
            System.out.println("Справка:");
            System.out.println("1.if");
            System.out.println("2.switch");
            System.out.println("3.for");
            System.out.println("4.while");
            System.out.println("5.do-while");
            System.out.println("6.break");
            System.out.println("7.continue");
            a = input.nextByte();}

        for (; ; ) {
            System.out.println();
            System.out.println("Выберите необходимый оператор из справки (1-7)");
            System.out.println("Справка:");
            System.out.println("1.if");
            System.out.println("2.switch");
            System.out.println("3.for");
            System.out.println("4.while");
            System.out.println("5.do-while");
            System.out.println("6.break");
            System.out.println("7.continue");
            a = input.nextByte();

            if (a == 0) break;

        }
      }
    }


