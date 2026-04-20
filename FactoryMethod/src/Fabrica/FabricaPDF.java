package Fabrica;

import Documentos.Documento;
import Documentos.PDF;

public class FabricaPDF extends FabricaDocumento{
    public Documento criarDocumento(){
        return new PDF();
    }
}

