import java.util.Scanner;

public class TesteiPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        iPhone iphone = new iPhone("iPhone 2G");
        
        System.out.println("📱 BEM-VINDO AO iPhone 2007!");
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
        
        // Menu interativo
        while (true) {
            System.out.println("\n═══════════════════════════════════");
            System.out.println("           📱 iPhone 2007");
            System.out.println("═══════════════════════════════════");
            System.out.println("1. 🎵 Reprodutor Musical");
            System.out.println("2. 📞 Aparelho Telefônico");
            System.out.println("3. 🌐 Navegador Internet");
            System.out.println("4. 🧪 Testar Tudo Automaticamente");
            System.out.println("0. ❌ Sair");
            System.out.print("\nEscolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    testarReprodutorMusical(iphone, scanner);
                    break;
                case 2:
                    testarAparelhoTelefonico(iphone, scanner);
                    break;
                case 3:
                    testarNavegadorInternet(iphone, scanner);
                    break;
                case 4:
                    testarTudo(iphone);
                    break;
                case 0:
                    System.out.println("\n👋 Obrigado por testar o iPhone 2007!");
                    return;
                default:
                    System.out.println("\n❌ Opção inválida!");
            }
        }
    }
    
    private static void testarReprodutorMusical(iPhone iphone, Scanner scanner) {
        System.out.println("\n🎵 === REPRODUTOR MUSICAL ===");
        System.out.print("Digite o nome da música: ");
        String musica = scanner.nextLine();
        
        iphone.selecionarMusica(musica);
        iphone.tocar();
        iphone.pausar();
    }
    
    private static void testarAparelhoTelefonico(iPhone iphone, Scanner scanner) {
        System.out.println("\n📞 === APARELHO TELEFÔNICO ===");
        System.out.print("Digite o número para ligar: ");
        String numero = scanner.nextLine();
        
        iphone.ligar(numero);
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
    
    private static void testarNavegadorInternet(iPhone iphone, Scanner scanner) {
        System.out.println("\n🌐 === NAVEGADOR INTERNET ===");
        System.out.print("Digite a URL para acessar: ");
        String url = scanner.nextLine();
        
        iphone.exibirPagina(url);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
    
    private static void testarTudo(iPhone iphone) {
        System.out.println("\n🧪 === TESTE AUTOMÁTICO COMPLETO ===");
        
        // Reprodutor Musical
        System.out.println("\n🎵 Testando Reprodutor Musical...");
        iphone.selecionarMusica("The Beatles - Here Comes The Sun");
        iphone.tocar();
        iphone.pausar();
        
        // Aparelho Telefônico
        System.out.println("\n📞 Testando Aparelho Telefônico...");
        iphone.ligar("(11) 99999-8888");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        // Navegador Internet
        System.out.println("\n🌐 Testando Navegador Internet...");
        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
        System.out.println("\n✅ TODOS OS TESTES CONCLUÍDOS COM SUCESSO!");
    }
}