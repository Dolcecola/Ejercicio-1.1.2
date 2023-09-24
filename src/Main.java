import java.util.Scanner;

public class Main{
    static boolean esPrimo(int numero)
    {
        int m=2;
        boolean v = true;
        while(v && (m<numero))
        {
            if((numero % m) == 0)
                v = false;

            else
                m = m+1;
        }
        return v;
    }

    public static void main(String[] args)
    {
        int p=0;

        System.out.println("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        try
        {
            p = Integer.parseInt(entrada.next());

            if(esPrimo(p))
            {
                System.out.println("El numero es primo");
            }

            else
                System.out.println("El numero no es primo");
        }

        catch(IllegalArgumentException e)
        {
            System.out.println("ERROR");
        }
    }
}