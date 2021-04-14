package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.Product;
import static org.acme.Rules49F42D626E9988546A3691D6941DC956.*;

public class Rules49F42D626E9988546A3691D6941DC956RuleMethods0 {

    /**
     * Rule name: offer for Diamond
     */
    public static org.drools.model.Rule rule_offer_32for_32Diamond() {
        final org.drools.model.Variable<org.acme.Product> var_productObject = D.declarationOf(org.acme.Product.class,
                                                                                              DomainClassesMetadata49F42D626E9988546A3691D6941DC956.org_acme_Product_Metadata_INSTANCE,
                                                                                              "productObject");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "offer for Diamond").attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                                           "productdiscount")
                                                                .build(D.pattern(var_productObject).expr("74683E07B4C6A4DEA061993D71A0B18B",
                                                                                                         org.acme.PA4.LambdaPredicateA4C6C7A2EE10372573B7851A2DF77D0A.INSTANCE,
                                                                                                         D.alphaIndexedBy(java.lang.String.class,
                                                                                                                          org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                          DomainClassesMetadata49F42D626E9988546A3691D6941DC956.org_acme_Product_Metadata_INSTANCE.getPropertyIndex("type"),
                                                                                                                          org.acme.P48.LambdaExtractor48318A57C7E6AA8AF0F1BB335B53353C.INSTANCE,
                                                                                                                          "Diamond"),
                                                                                                         D.reactOn("type")).expr("D454CD68468387F450E2C7C6BCF51936",
                                                                                                                                 org.acme.P86.LambdaPredicate86E057333861F089BC3CAA62E28C7D26.INSTANCE,
                                                                                                                                 D.alphaIndexedBy(double.class,
                                                                                                                                                  org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                                  DomainClassesMetadata49F42D626E9988546A3691D6941DC956.org_acme_Product_Metadata_INSTANCE.getPropertyIndex("productPrice"),
                                                                                                                                                  org.acme.P58.LambdaExtractor5893AD4810E5DEC343A3FBFE27B5A228.INSTANCE,
                                                                                                                                                  50000d),
                                                                                                                                 D.reactOn("productPrice")),
                                                                       D.on(var_productObject).execute(org.acme.P50.LambdaConsequence506FD98400D55A81F07E9108F37A8555.INSTANCE));
        return rule;
    }

    /**
     * Rule name: offer for Platinum
     */
    public static org.drools.model.Rule rule_offer_32for_32Platinum() {
        final org.drools.model.Variable<org.acme.Product> var_productObject = D.declarationOf(org.acme.Product.class,
                                                                                              DomainClassesMetadata49F42D626E9988546A3691D6941DC956.org_acme_Product_Metadata_INSTANCE,
                                                                                              "productObject");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "offer for Platinum").attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                                            "productdiscount")
                                                                 .build(D.pattern(var_productObject).expr("6C9B351E181FB37DD9ECF7B5FFDD6EFF",
                                                                                                          org.acme.P74.LambdaPredicate74165456B47122F9CE4A0AA846577BE9.INSTANCE,
                                                                                                          D.alphaIndexedBy(java.lang.String.class,
                                                                                                                           org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                           DomainClassesMetadata49F42D626E9988546A3691D6941DC956.org_acme_Product_Metadata_INSTANCE.getPropertyIndex("type"),
                                                                                                                           org.acme.P48.LambdaExtractor48318A57C7E6AA8AF0F1BB335B53353C.INSTANCE,
                                                                                                                           "Platinum"),
                                                                                                          D.reactOn("type")).expr("D454CD68468387F450E2C7C6BCF51936",
                                                                                                                                  org.acme.P62.LambdaPredicate628A7EDB28B0AB096CC2CAD80D028A85.INSTANCE,
                                                                                                                                  D.alphaIndexedBy(double.class,
                                                                                                                                                   org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                                   DomainClassesMetadata49F42D626E9988546A3691D6941DC956.org_acme_Product_Metadata_INSTANCE.getPropertyIndex("productPrice"),
                                                                                                                                                   org.acme.P58.LambdaExtractor5893AD4810E5DEC343A3FBFE27B5A228.INSTANCE,
                                                                                                                                                   50000d),
                                                                                                                                  D.reactOn("productPrice")),
                                                                        D.on(var_productObject).execute(org.acme.PD9.LambdaConsequenceD9AEBB1F642391360D6C211A48918B0F.INSTANCE));
        return rule;
    }
}
