import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Potenza pot1 = new Potenza(input("inserisci la base della quale calcolare la potenza di 2", 5));
        pot1.pow();
        output("la potenza di due di "+pot1.getBase()+ " è "+pot1.getRisultato());
        pot1.setBase(input("inserisci la base della quale calcolare la potenza di 2", 2));
        pot1.pow();
        output("la potenza di due di "+pot1.getBase()+ " è "+pot1.getRisultato());
    }

    public static void output(String a)
    {
        System.out.print(a+"\n");
    }
    public static int input(String a, int b){
        output(a);
        int c = b;
        Scanner scan = new Scanner(System.in);
        b = scan.nextInt();
        return b;
    }
}