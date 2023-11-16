package AtivFormativa;

public class Principal {

	public static void main(String[] args) {
		Usuario usuario = new Usuario(1,"Pedro", 200714, "autorizado", "not_pedr1");
		System.out.println("\nUsuario");
		System.out.println("Id:" +usuario.getId());
		System.out.println("Nome: "+usuario.getNome());
		System.out.println("Password: "+usuario.getPassword());
		System.out.println("Permissao: "+usuario.getPermissao());
		System.out.println("Usuario: "+usuario.getUsuario());
		
		
		
	}

}
