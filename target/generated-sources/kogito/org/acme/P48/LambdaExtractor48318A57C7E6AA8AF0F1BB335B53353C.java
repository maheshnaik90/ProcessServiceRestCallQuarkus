package org.acme.P48;

import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;
import org.acme.*;
import org.acme.Product;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor48318A57C7E6AA8AF0F1BB335B53353C implements org.drools.model.functions.Function1<org.acme.Product, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "6EC6965C8297FB2BF4E9ECA26168B0E8";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(org.acme.Product _this) {
        return _this.getType();
    }
}
