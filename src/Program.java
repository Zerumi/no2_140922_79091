import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Program {
    public static void main(String[] args)
    {
        Battle b = new Battle();
        Pokemon p1 = new HoOh("Птица Феникс",100);
        Pokemon p2 = new Riolu("Абелева полугруппа", 100);
        Pokemon p3 = new Lucario("Злой второкурсник", 100);
        Pokemon p4 = new Swinub("Евангелион", 100);
        Pokemon p5 = new Piloswine("Ктостер лимонойд", 100);
        Pokemon p6 = new Mamoswine("Паймон", 100);

        b.addAlly(p1);
        b.addAlly(p5);
        b.addAlly(p6);

        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p4);

        b.go(); // мясцо
    }
}
