package Fabrica;

import Documentos.Documento;
import Documentos.Word;

public class FabricaWord extends FabricaDocumento{
    public Documento criarDocumento(){
        return new Word();
    }
}
