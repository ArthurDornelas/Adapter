package padrao.adapter;

public class Resposta {
    IDados dados;
    DadosAdapter conversor;

    public Resposta() {
        dados = new DadosXML();
        conversor = new DadosAdapter(dados);
    }

    public void setDados(String dadosXML) {
        dados.setDados(dadosXML);
        conversor.converterDados();
    }

    public String getDados() {
        return conversor.recuperarDados();
    }

    public String getDadosJSON() {
        return conversor.getDadosJSON();
    }

}
