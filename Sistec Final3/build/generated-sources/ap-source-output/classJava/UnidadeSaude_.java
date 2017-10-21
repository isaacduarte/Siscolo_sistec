package classJava;

import classJava.BuscaAtiva;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-30T08:52:37")
@StaticMetamodel(UnidadeSaude.class)
public class UnidadeSaude_ { 

    public static volatile SingularAttribute<UnidadeSaude, String> NProtocolo;
    public static volatile SingularAttribute<UnidadeSaude, String> Municipio;
    public static volatile SingularAttribute<UnidadeSaude, String> UF;
    public static volatile SingularAttribute<UnidadeSaude, String> Prontuario;
    public static volatile ListAttribute<UnidadeSaude, BuscaAtiva> BuscaAtiva;
    public static volatile SingularAttribute<UnidadeSaude, String> CNESUS;
    public static volatile SingularAttribute<UnidadeSaude, Integer> id;
    public static volatile SingularAttribute<UnidadeSaude, String> UnidadeSaude;

}