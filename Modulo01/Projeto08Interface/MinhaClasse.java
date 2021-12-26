/**
 * implements serve para herdar elementos de diversas interfaces.
 * extends serve para herdar elementos de apenas uma única classe.
 * Por esta classe conter implements, é obrigatória a declaração dos métodos da
 * interface correspondente.
 */

public class MinhaClasse implements MinhaInterface
{
    public int metodoQuePrecisaSerImplementado(int nro)
    {
        return 123;
    }
}
