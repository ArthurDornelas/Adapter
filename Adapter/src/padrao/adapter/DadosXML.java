package padrao.adapter;

public class DadosXML implements IDados{
    private String dadosXML;

    @Override
    public String getDados() {
        return this.dadosXML;
    }

    @Override
    public void setDados(String dadosXML) {
        this.dadosXML = dadosXML;
    }
}
