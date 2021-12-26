/**
 * Classe que inicializa o sistema.
 * @author (Rogério) 
 * @version (1.0)
 */

public class Principal
{
   public static void main(String args[])
   {
       Funcionario func = null;
       
       String nom = Tela.retornaTxt("Nome:");
       String ema = Tela.retornaTxt("Email:");
       
       String tip = Tela.retornaTxt("H para Horista ou I para Integral");
       if(tip.equals("H"))
       {
           int qtd = Tela.retornaInt("Quantidade de horas:");
           double val = Tela.retornaDbl("Valor por Hora:");
           func = new FuncHorista(nom, ema, qtd, val);
       }
       if(tip.equals("I"))
       {
           double sal = Tela.retornaDbl("Salário base:");
           func = new FuncIntegral(nom, ema, sal);
       }
       
       //A idéia é usar os métodos de forma mais "genérica".
       double sal = func.calcularSalario();
       nom = func.getNome();
       Tela.mostraTxt(nom + " Seu salário será R$"+ sal);
   }
}
