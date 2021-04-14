package org.acme.P62;

import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;
import org.acme.*;
import org.acme.Product;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate628A7EDB28B0AB096CC2CAD80D028A85 implements org.drools.model.functions.Predicate1<org.acme.Product>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "CEA275E1D9A20B3A85C86BB6A80D6969";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.Product _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getProductPrice(), 50000d);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("type==\"Platinum\"", "offer for Platinum", "H:\\ProcessServiceRestCallQuarkus\\src\\main\\resources\\org\\acme\\product-rule.drl");
    }
}
