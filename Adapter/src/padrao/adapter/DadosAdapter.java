package padrao.adapter;

public class DadosAdapter extends DadosJSON{
    private IDados dadosXML;

    public DadosAdapter(IDados dadosXML) {
        this.dadosXML = dadosXML;
    }

    public String recuperarDados() {
        if(this.getDadosJSON().equals("{")) {
            dadosXML.setDados("<");
        }
        else if(this.getDadosJSON().equals("}")) {
            dadosXML.setDados(">");
        }

        return dadosXML.getDados();
    }

    public void converterDados() {
        if(dadosXML.getDados().equals("<")) {
            this.setDadosJSON("{");
        }
        else if(dadosXML.getDados().equals(">")) {
            this.setDadosJSON("}");
        }
    }
}
