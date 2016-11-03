package classJava;

import Dao.EntidadeBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@SequenceGenerator(name = "Paciente_Sequenc", sequenceName = "Paciente_Sequenc", initialValue = 1, allocationSize = 1)
@NamedQueries(
        @NamedQuery(name="Paciente.pesquisaId",
                    query = "SELECT p FROM Paciente p "
                )
)
@Table(name = "Paciente")
public class Paciente implements EntidadeBase {
   @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Paciente_Sequenc")
    private int id;
     
    @Column()
    private String cartaoSus;
    
    @Column()
    private String apelido;
    
    @Column()
    private String nomePaciente;
    
    @Column()
    private String nacionalidade;
    
    @Column()
    private String nomeMae;
    
    @Column()
    private int idade;
    
    @Column()
    private String cpf;
    
    @Column()
    private String raca;
    
    @Column()
    private String dataNacimento;
    
    @Column()
    private String indigenaEtinia;
    
    @Column()
    private String nivelEscolaridade;
    
    @Column()
    private String logradouro;
    
    @Column()
    private int numero;
    
    @Column()
    private String complemento;
    
    @Column()
    private String bairro;
    
    @Column()
    private String UF;
    
    @Column()
    private String codigoMunicipio;
    
    @Column()
    private String municipio;
    
    @Column()
    private String cep;

    @Column()
    private String telefone;
    
    @Column()
    private String pontoReferencia;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getIndigenaEtinia() {
        return indigenaEtinia;
    }

    public void setIndigenaEtinia(String indigenaEtinia) {
        this.indigenaEtinia = indigenaEtinia;
    }

    public String getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public void setNivelEscolaridade(String nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }
    
    
}
