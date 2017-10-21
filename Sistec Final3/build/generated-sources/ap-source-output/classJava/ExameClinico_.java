package classJava;

import classJava.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-30T08:52:37")
@StaticMetamodel(ExameClinico.class)
public class ExameClinico_ { 

    public static volatile SingularAttribute<ExameClinico, Paciente> paciente;
    public static volatile SingularAttribute<ExameClinico, String> dataColeta;
    public static volatile SingularAttribute<ExameClinico, Integer> id;
    public static volatile SingularAttribute<ExameClinico, String> responsavel;
    public static volatile SingularAttribute<ExameClinico, String> numeroExame;
    public static volatile SingularAttribute<ExameClinico, String> inspecaoColo;
    public static volatile SingularAttribute<ExameClinico, String> ssdst;

}