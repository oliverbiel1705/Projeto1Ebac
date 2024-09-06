package src.main.java.anotacao;

import java.lang.annotation.*;

/**
 * @author gabriel
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
}