import javax.imageio.event.IIOReadProgressListener;

public class PapelService {
    public void inicio(Usuario usuario){
        int opcao;

        do {
            IO.println("\n--- Menu Papel ---");
            IO.println("1 - Adicionar");
            IO.println("2 - Editar");
            IO.println("3 - Remover");
            IO.println("4 - Listar");
            IO.println("0 - Sair ");

            opcao = Integer.parseInt(IO.readln("Digite uma opcao: "));

            switch (opcao) {
                case 1:
                    adicionar(usuario);
                    break;
                case 2:
                    editar(usuario);
                    break;
                case 3:
                    remover(usuario);
                    break;
                case 4:
                    listar(usuario);
                    break;
                case 0:
                    IO.println("Voltando para o menu anterior...");
                    break;
                default:
                    IO.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
    public void adicionar(Usuario usuario){
        String descricao = IO.readln("Descrição: ");
        String nome = IO.readln("Digite o papel: ");
        String tag = IO.readln("Digite a tag do papel: ");
        Papel papel = new Papel(descricao, nome, tag);
        usuario.getPapeis().add(papel);

    }
    public void listar(Usuario usuario){
        for (int i = 0; i < usuario.getPapeis().size(); i++) {
            System.out.println("Indice do Papel: " + i);
            System.out.println(usuario.getPapeis().get(i).toString());
        }
    }
    public void editar(Usuario usuario){
        listar(usuario);
        int indice = Integer.parseInt(IO.readln("Digite o indice: "));
        usuario.getPapeis().get(indice).setDescricao("Digite nova descrição: ");
        usuario.getPapeis().get(indice).setNome("Digite novo nome: ");
        usuario.getPapeis().get(indice).setTag("Digite nova Tag: ");

    }
    public void remover(Usuario usuario){
        listar(usuario);
        int indice = Integer.parseInt(IO.readln("Digite o indice para remover."));
        usuario.getPapeis().remove(indice);
        System.out.println("Usuario removido");
    }

}



