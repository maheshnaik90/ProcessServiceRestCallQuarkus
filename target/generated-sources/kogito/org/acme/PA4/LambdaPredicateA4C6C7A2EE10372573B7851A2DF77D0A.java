package org.acme.PA4;

import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;
import org.acme.*;
import org.acme.Product;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateA4C6C7A2EE10372573B7851A2DF77D0A implements org.drools.model.functions.Predicate1<org.acme.Product>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "576318CE5C730D18E401B6978D6361BF";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.Product _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getType(), "Diamond");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("type==\"Diamond\"", "offer for Diamond", "H:\\ProcessServiceRestCallQuarkus\\src\\main\\resources\\org\\acme\\product-rule.drl");
    }
}
