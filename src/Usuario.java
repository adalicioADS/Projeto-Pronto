import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String username;
    private String password;
    private ArrayList<Papel> papeis = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nome, String username, String password, ArrayList<Papel> papeis) {
        this.nome = nome;
        this.username = username;
        this.password = password;
        this.papeis = papeis;
    }

    public Usuario(String username, String password, String nome) {
        this.username = username;
        this.password = password;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Papel> getPapeis() {
        return papeis;
    }

    public void setPapeis(ArrayList<Papel> papeis) {
        this.papeis = papeis;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", papeis=" + papeis +
                '}';
    }
}
