
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // ATRIBUTOS (características do iPhone)
    private String modelo;
    private String musicaAtual;
    private String paginaAtual;
    private boolean reproduzindo;
    private boolean ligacaoAtiva;
    
    // CONSTRUTOR (como "nascer" um iPhone)
    public iPhone(String modelo) {
        this.modelo = modelo;
        this.reproduzindo = false;
        this.ligacaoAtiva = false;
    }
    
    // === IMPLEMENTAÇÃO DO REPRODUTOR MUSICAL ===
    @Override
    public void tocar() {
        if (musicaAtual != null) {
            reproduzindo = true;
            System.out.println("🎵 Tocando música: " + musicaAtual);
        } else {
            System.out.println("⚠️ Nenhuma música selecionada!");
        }
    }
    
    @Override
    public void pausar() {
        if (reproduzindo) {
            reproduzindo = false;
            System.out.println("⏸️ Música pausada");
        } else {
            System.out.println("⚠️ Nenhuma música tocando!");
        }
    }
    
    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("🎼 Música selecionada: " + musica);
    }
    
    // === IMPLEMENTAÇÃO DO APARELHO TELEFÔNICO ===
    @Override
    public void ligar(String numero) {
        ligacaoAtiva = true;
        System.out.println("📞 Ligando para: " + numero);
        System.out.println("📱 Chamada em andamento...");
    }
    
    @Override
    public void atender() {
        ligacaoAtiva = true;
        System.out.println("📱 Atendendo ligação...");
        System.out.println("👋 Alô!");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("📧 Correio de voz iniciado");
        System.out.println("🎙️ Deixe sua mensagem após o sinal...");
    }
    
    // === IMPLEMENTAÇÃO DO NAVEGADOR INTERNET ===
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("🌐 Exibindo página: " + url);
        System.out.println("📄 Página carregada com sucesso!");
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("📑 Nova aba adicionada");
        System.out.println("➕ Pronta para navegar!");
    }
    
    @Override
    public void atualizarPagina() {
        if (paginaAtual != null) {
            System.out.println("🔄 Atualizando página: " + paginaAtual);
        } else {
            System.out.println("⚠️ Nenhuma página para atualizar!");
        }
    }
    
    // MÉTODOS AUXILIARES (Encapsulamento)
    public String getModelo() {
        return modelo;
    }
    
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    
    public boolean isLigacaoAtiva() {
        return ligacaoAtiva;
    }
}