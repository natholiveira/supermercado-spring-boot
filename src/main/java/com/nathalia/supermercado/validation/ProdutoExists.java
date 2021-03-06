package com.nathalia.supermercado.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ProdutoExistsValidator.class)
@Documented
public @interface ProdutoExists {

    String message() default "{constraints.produtoexists}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}