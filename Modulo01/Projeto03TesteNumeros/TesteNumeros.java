public class TesteNumeros
{
    public static void main(String args[])
    {
        //No Java temos as classes com métodos, para fazermos conversões e etc.
        String snro = "1234";
        
        //int para números inteiros.
        int inro = Integer.parseInt(snro);
        System.out.println(inro);
        
        //float para números com casas decimais.
        float fnro = Float.parseFloat(snro);
        System.out.println(fnro);
        
        //double para números com casas decimais.
        double dnro = Double.parseDouble(snro);
        System.out.println(dnro);
        
        //Dá para fazer o contrário também.
        int ival = 5678;
        String sval = Integer.toString(ival);
        System.out.println(sval);
        
        System.out.println("=============================");
        
        //E temos a classe "Math" com métodos aritméticos.
        System.out.println( Math.pow(2,3) );//Potência
        System.out.println( Math.sqrt(25) );//Raíz quadrada
        System.out.println( Math.sin(90) );//Seno
        System.out.println( Math.E );//Constante
        System.out.println( Math.PI );//Constante
        
    }
}
