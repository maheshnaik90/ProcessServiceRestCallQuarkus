package org.acme.PD9;

import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;
import org.acme.*;
import org.acme.Product;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceD9AEBB1F642391360D6C211A48918B0F implements org.drools.model.functions.Block1<org.acme.Product>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "F75F4A75AFFD1D40096F22FCF93686F8";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.acme.Product productObject) throws java.lang.Exception {
        {
            System.out.println("Platinum rule invoked");
            productObject.setDiscount(productObject.getProductPrice() * 0.25);
        }
    }
}
