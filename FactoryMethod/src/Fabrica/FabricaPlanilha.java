package Fabrica;

import Documentos.Documento;
import Documentos.Planilha;

public class FabricaPlanilha extends FabricaDocumento{
    @Override
    public Documento criarDocumento() {
        return new Planilha();
    }
}
