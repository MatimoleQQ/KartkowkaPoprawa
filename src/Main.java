import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static HashSet losowanie(HashSet<Integer> kolekcja)
    {

        Scanner klawiatura = new Scanner(System.in);
        int n = klawiatura.nextInt();
        while(kolekcja.size() < n)
        {
            kolekcja.add( (int)((Math.random()*100)-49) );
            System.out.println(kolekcja.size());
        }

        System.out.println(kolekcja);
        return kolekcja;
    }
    // Napisz funkcje  ktora wylosuje kolekje n elementową z zakresu <-50;50<
    // Wypisz z kolekcji zadania 1, liczby dodatnie, liczby ktore maja conajmniej 3 rozne czynniki (60 = 2*2*3*5)
    //Utworz kolekcje zawirajaca liczby bez powtorzen z zad 1
    public static void main(String[] args)
    {

        // Zadanie 1
        HashSet<Integer> kolekcja =new HashSet<>();
        losowanie(kolekcja);
        // Zadanie 2
        HashSet<Integer> Dodatnie = new HashSet<>();
        for(Integer x : kolekcja) {
            int j;
            int liczba = x;
            int ilosc = 0;

            if (x > 0) {
                for (j = 2; j <= (x / 2); j++)
                {
                    if (ilosc < 3)
                    {

                        boolean pierwsza = true;
                        for (int i = 2; i < j; i++)
                        {
                            if (j % i == 0)
                                pierwsza = false;
                            if (pierwsza) {
                                if ((liczba % i) == 0 && x > 0)
                                {
                                    liczba = liczba / j;
                                    ilosc++;


                                }
                            }

                        }
                    }
                    else
                    {
                        Dodatnie.add(x);
                    }
                }
            }
        }

//





        System.out.println(Dodatnie);


        //Zadanie 3
                HashSet<Integer> BezPowtorzen = new HashSet<>();
                for(Integer x:kolekcja)
                {
                    if((x%2)==0)
                    {
                        BezPowtorzen.add(x);
                    }
                }
        System.out.println(BezPowtorzen);





    }
}