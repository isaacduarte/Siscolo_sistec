package classJava;

import classJava.Paciente;
import classJava.UnidadeSaude;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-30T08:52:37")
@StaticMetamodel(BuscaAtiva.class)
public class BuscaAtiva_ { 

    public static volatile SingularAttribute<BuscaAtiva, String> Obs;
    public static volatile SingularAttribute<BuscaAtiva, String> Colposcopia;
    public static volatile SingularAttribute<BuscaAtiva, String> Referencia;
    public static volatile SingularAttribute<BuscaAtiva, String> Tratamento;
    public static volatile SingularAttribute<BuscaAtiva, UnidadeSaude> UnidadeSaude;
    public static volatile SingularAttribute<BuscaAtiva, Paciente> Paciente;
    public static volatile SingularAttribute<BuscaAtiva, String> RExameCitopatologico;
    public static volatile SingularAttribute<BuscaAtiva, String> situacaoSegmento;
    public static volatile SingularAttribute<BuscaAtiva, String> dataExame;
    public static volatile SingularAttribute<BuscaAtiva, String> laudoBiopsia;
    public static volatile SingularAttribute<BuscaAtiva, Integer> id;
    public static volatile SingularAttribute<BuscaAtiva, String> Biopsia;
    public static volatile SingularAttribute<BuscaAtiva, String> informacaoObtida;

}