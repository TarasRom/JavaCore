package lab11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CrazyStudent {
    String value() default "unknown";
    int rating() default 0;
    Institute institute() default Institute.ECONOMICS_AND_MANAGEMENT;
}
