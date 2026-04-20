import Documentos.Documento;
import Fabrica.FabricaDocumento;
import Fabrica.FabricaPDF;
import Fabrica.FabricaPlanilha;
import Fabrica.FabricaWord;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class main {
    public static void main(String[] args) {
        FabricaDocumento factory;
        Documento documento;

        System.out.println("== TESTE: Planilha ==");
        factory = new FabricaPlanilha();
        documento = factory.criarDocumento();
        documento.gerar();

        System.out.println("\n== TESTE: PDF ==");
        factory = new FabricaPDF();
        documento = factory.criarDocumento();
        documento.gerar();

        System.out.println("\n== TESTE: Word ==");
        factory = new FabricaWord();
        documento = factory.criarDocumento();
        documento.gerar();


    }
}
