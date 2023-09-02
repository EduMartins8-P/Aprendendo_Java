package reaprendendo;
import java.util.Scanner;

public class TestarContato {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Contato contato = new Contato();
		Endereco end = new Endereco();
		Telefone telefone = new Telefone();
		Telefone telefone2 = new Telefone();
		
		contato.setNome("luiz");
		
		end.setCep("999999");
		end.setCidade("belford roxo");
		end.setComplemento("casa 3");
		end.setEstado("rio de janeiro");
		end.setNomeRua("diamante");
		end.setNumero("24");
		
		telefone.setDdd("21");
		telefone.setNumero("99999-9999");
		telefone.setTipo("celular");
		
		telefone2.setDdd("24");
		telefone2.setNumero("88888-8888");
		telefone2.setTipo("celular tb");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		contato.setEndereco(end);
		
		System.out.println(contato.getNome());
		
		if(contato.getEndereco() != null && contato != null) {
			System.out.println(contato.getEndereco().getCep()  + "\n" + contato.getEndereco().getCidade() + "\n" + contato.getEndereco().getComplemento() + "\n" + contato.getEndereco().getEstado() + "\n" + contato.getEndereco().getNomeRua() + "\n" + contato.getEndereco().getNumero());
		}
		
		if(contato.getTelefones() != null && contato != null) {
			for(int cont = 0; cont < telefones.length; cont++) {
				Telefone t = telefones[cont];
				System.out.println(t.getDdd() + " " + t.getNumero() + "\n" + t.getTipo());
			}
		}

	}

}
