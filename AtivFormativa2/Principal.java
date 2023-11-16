package AtivFormativa2;

public class Principal {

	public static void main(String[] args) {
		Fisica fisica = new Fisica ("Pedro", "11116565561", "54548502");
		System.out.println("\nPessoa");
		System.out.println("Nome: "+fisica.getNome());
		System.out.println("Cpf: "+fisica.getCpf());
		System.out.println("Rg: "+fisica.getRg());

	}

}
