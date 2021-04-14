package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.Product;

public class Rules49F42D626E9988546A3691D6941DC956 implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = java.time.format.DateTimeFormatter.ofPattern(org.drools.core.util.DateUtils.getDateFormatMask(),
                                                                                                                              java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "org.acme";
    }

    public static java.util.Date string_2_date(String s) {
        return java.util.GregorianCalendar.from(string_2_localDate(s).atStartOfDay(java.time.ZoneId.systemDefault()))
                                          .getTime();
    }

    public static java.time.LocalDate string_2_localDate(String s) {
        return java.time.LocalDate.parse(s,
                                         DATE_TIME_FORMATTER);
    }

    public static java.time.LocalDateTime string_2_localDateTime(String s) {
        return string_2_localDate(s).atStartOfDay();
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Collections.emptyList();
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    java.util.List<org.drools.model.Global> globals = java.util.Collections.emptyList();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@285bd822
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rules49F42D626E9988546A3691D6941DC956RuleMethods0.rule_offer_32for_32Diamond(),
                                       Rules49F42D626E9988546A3691D6941DC956RuleMethods0.rule_offer_32for_32Platinum());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return java.util.Collections.emptyList();
    }
}
