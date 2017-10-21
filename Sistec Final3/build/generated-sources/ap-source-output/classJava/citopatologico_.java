package classJava;

import classJava.Laboratorio;
import classJava.Paciente;
import classJava.UnidadeSaude;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-30T08:52:37")
@StaticMetamodel(citopatologico.class)
public class citopatologico_ { 

    public static volatile SingularAttribute<citopatologico, String> CelulasAtipicas;
    public static volatile SingularAttribute<citopatologico, String> ObsG;
    public static volatile SingularAttribute<citopatologico, String> SPCitotecnico;
    public static volatile SingularAttribute<citopatologico, Laboratorio> laboratorio;
    public static volatile SingularAttribute<citopatologico, String> origemIndefinida;
    public static volatile SingularAttribute<citopatologico, String> atipiasCelulasEscamosas;
    public static volatile SingularAttribute<citopatologico, UnidadeSaude> UnidadeSaude;
    public static volatile SingularAttribute<citopatologico, String> microbiologia;
    public static volatile SingularAttribute<citopatologico, String> avaliacaoPreAnalitica;
    public static volatile SingularAttribute<citopatologico, String> dataResultado;
    public static volatile SingularAttribute<citopatologico, Paciente> paciente;
    public static volatile SingularAttribute<citopatologico, String> adquabilidadeMaterial;
    public static volatile SingularAttribute<citopatologico, Integer> id;
    public static volatile SingularAttribute<citopatologico, String> atipiasCelulasGlandulares;
    public static volatile SingularAttribute<citopatologico, String> responsavel;
    public static volatile SingularAttribute<citopatologico, String> diagnosticoDescritivo;

}