package com.example;

import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.drools.core.util.KieFunctions;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("product")
@io.quarkus.runtime.Startup()
public class ProductProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.ProductModel> {

    @javax.inject.Inject()
    public ProductProcess(org.kie.kogito.app.Application app, org.kie.kogito.process.ProcessInstancesFactory factory) {
        super(app, java.util.Arrays.asList(), factory);
        activate();
    }

    public ProductProcess() {
    }

    @Override()
    public com.example.ProductProcessInstance createInstance(com.example.ProductModel value) {
        return new com.example.ProductProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.ProductProcessInstance createInstance(java.lang.String businessKey, com.example.ProductModel value) {
        return new com.example.ProductProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    @Override()
    public com.example.ProductModel createModel() {
        return new com.example.ProductModel();
    }

    public com.example.ProductProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.ProductModel) value);
    }

    public com.example.ProductProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.ProductModel) value);
    }

    public com.example.ProductProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ProductProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.ProductProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ProductProcessInstance(this, this.createModel(), wpi);
    }

    public org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("product");
        factory.variable("product", new ObjectDataType("org.acme.Product"), "customTags", null);
        factory.name("product");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory endNode1 = factory.endNode(1);
        endNode1.name("End");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_FEAAD55A-D7F2-48C6-ABD9-FFE51658C12A");
        endNode1.metaData("x", 663);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 181);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory ruleSetNode2 = factory.ruleSetNode(2);
        ruleSetNode2.name("Product Discount");
        ruleSetNode2.inMapping("product", "product");
        ruleSetNode2.outMapping("product", "product");
        ruleSetNode2.ruleFlowGroup("productdiscount", () -> {
            return org.drools.project.model.ProjectRuntime.INSTANCE.newKieSession("defaultStatelessKieSession", app.config().get(org.kie.kogito.rules.RuleConfig.class));
        });
        ruleSetNode2.metaData("UniqueId", "_1205EDDD-7813-4B7B-A46F-92D257771B2D");
        ruleSetNode2.metaData("elementname", "Product Discount");
        ruleSetNode2.metaData("x", 429);
        ruleSetNode2.metaData("width", 154);
        ruleSetNode2.metaData("y", 158);
        ruleSetNode2.metaData("height", 102);
        ruleSetNode2.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory startNode3 = factory.startNode(3);
        startNode3.name("Start");
        startNode3.interrupting(false);
        startNode3.metaData("UniqueId", "_44E11F66-DCB6-415E-B1D4-D19E910EB384");
        startNode3.metaData("x", 293);
        startNode3.metaData("width", 56);
        startNode3.metaData("y", 181);
        startNode3.metaData("height", 56);
        startNode3.done();
        factory.connection(2, 1, "_1FC5E28B-44A4-40BA-A1BF-2B37AB18B283");
        factory.connection(3, 2, "_E40EA05B-EDFC-4D97-80B4-0BB356102325");
        factory.validate();
        return factory.getProcess();
    }
}
