package org.acme.P58;

import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;
import org.acme.*;
import org.acme.Product;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor5893AD4810E5DEC343A3FBFE27B5A228 implements org.drools.model.functions.Function1<org.acme.Product, Double>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "D05CB8CCA3BCD3D8194E3CD26CF09582";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Double apply(org.acme.Product _this) {
        return _this.getProductPrice();
    }
}
