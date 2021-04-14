package org.acme.P50;

import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;
import org.acme.*;
import org.acme.Product;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence506FD98400D55A81F07E9108F37A8555 implements org.drools.model.functions.Block1<org.acme.Product>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "7950E07E4B704AD263E6292CA732F211";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.acme.Product productObject) throws java.lang.Exception {
        {
            System.out.println("Diamond rule invoked");
            productObject.setDiscount(productObject.getProductPrice() * 0.15);
        }
    }
}
