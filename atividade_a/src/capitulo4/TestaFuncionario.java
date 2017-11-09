package capitulo4;
import capitulo4.models.Funcionario;
import capitulo4.models.DataField;

class TestaFuncionario {
 public static void main(String[] args) {
     Funcionario functionario1 = new Funcionario();
     functionario1.setNome("Darshan");

     //Show me the money!
     functionario1.setSalario(2500);

     functionario1.setDepartamento("Web");

     functionario1.recebeAumento(50);

     //Data de entrada
     DataField entrada = new DataField(1, 7, 2018);
     functionario1.setData_entrada(entrada);

     //Show show show
     functionario1.mostra();
 }
 }
