package org.acme.P74;

import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;
import org.acme.*;
import org.acme.Product;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate74165456B47122F9CE4A0AA846577BE9 implements org.drools.model.functions.Predicate1<org.acme.Product>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4F30B6DFB2D80739B8B9930ABCA4FA00";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.Product _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getType(), "Platinum");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("type==\"Platinum\"", "offer for Platinum", "H:\\ProcessServiceRestCallQuarkus\\src\\main\\resources\\org\\acme\\product-rule.drl");
    }
}
