package org.acme.travels;

import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.drools.core.util.KieFunctions;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("users")
@io.quarkus.runtime.Startup()
public class UsersProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.UsersModel> {

    public UsersProcess(org.kie.kogito.app.Application app) {
        this(app, new org.kie.kogito.handlers.UserService_get_2_Handler(), new org.kie.kogito.handlers.AuditService_auditUser_3_Handler());
    }

    @javax.inject.Inject()
    public UsersProcess(org.kie.kogito.app.Application app, org.kie.kogito.handlers.UserService_get_2_Handler userService_get_2_Handler, org.kie.kogito.handlers.AuditService_auditUser_3_Handler auditService_auditUser_3_Handler) {
        super(app, java.util.Arrays.asList(userService_get_2_Handler, auditService_auditUser_3_Handler));
        activate();
    }

    public UsersProcess() {
    }

    @Override()
    public org.acme.travels.UsersProcessInstance createInstance(org.acme.travels.UsersModel value) {
        return new org.acme.travels.UsersProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.UsersProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.UsersModel value) {
        return new org.acme.travels.UsersProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    @Override()
    public org.acme.travels.UsersModel createModel() {
        return new org.acme.travels.UsersModel();
    }

    public org.acme.travels.UsersProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.UsersModel) value);
    }

    public org.acme.travels.UsersProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.UsersModel) value);
    }

    public org.acme.travels.UsersProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.UsersProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.UsersProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.UsersProcessInstance(this, this.createModel(), wpi);
    }

    public org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("users");
        factory.variable("traveller", new ObjectDataType("org.acme.travels.User"), "customTags", null);
        factory.variable("username", new ObjectDataType("java.lang.String"), "customTags", null);
        factory.name("users");
        factory.packageName("org.acme.travels");
        factory.dynamic(false);
        factory.version("1.0");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.StartNodeFactory startNode1 = factory.startNode(1);
        startNode1.name("StartProcess");
        startNode1.interrupting(false);
        startNode1.metaData("UniqueId", "_5A1A031B-CA99-4CB7-BC07-A730CE95D655");
        startNode1.metaData("elementname", "StartProcess");
        startNode1.metaData("x", 404);
        startNode1.metaData("width", 56);
        startNode1.metaData("y", 161);
        startNode1.metaData("height", 56);
        startNode1.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory workItemNode2 = factory.workItemNode(2);
        workItemNode2.name("Find user");
        workItemNode2.workName("org.acme.travels.services.UserService_get_2_Handler");
        workItemNode2.workParameter("Interface", "org.acme.travels.services.UserService");
        workItemNode2.workParameter("Operation", "get");
        workItemNode2.workParameter("interfaceImplementationRef", "org.acme.travels.services.UserService");
        workItemNode2.workParameter("operationImplementationRef", "get");
        workItemNode2.workParameter("implementation", "Java");
        workItemNode2.inMapping("Parameter", "username");
        workItemNode2.outMapping("Result", "traveller");
        workItemNode2.done();
        workItemNode2.metaData("UniqueId", "_08C87A94-E5F4-41B4-A38B-3305342E916B");
        workItemNode2.metaData("Implementation", "Java");
        workItemNode2.metaData("elementname", "Find user");
        workItemNode2.metaData("Type", "Service Task");
        workItemNode2.metaData("OperationRef", "_08C87A94-E5F4-41B4-A38B-3305342E916B_ServiceOperation");
        workItemNode2.metaData("x", 540);
        workItemNode2.metaData("width", 154);
        workItemNode2.metaData("y", 138);
        workItemNode2.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory workItemNode3 = factory.workItemNode(3);
        workItemNode3.name("Audit user");
        workItemNode3.workName("org.acme.travels.services.AuditService_auditUser_3_Handler");
        workItemNode3.workParameter("Interface", "org.acme.travels.services.AuditService");
        workItemNode3.workParameter("Operation", "auditUser");
        workItemNode3.workParameter("interfaceImplementationRef", "org.acme.travels.services.AuditService");
        workItemNode3.workParameter("operationImplementationRef", "auditUser");
        workItemNode3.workParameter("implementation", "Java");
        workItemNode3.inMapping("Parameter", "traveller");
        workItemNode3.done();
        workItemNode3.metaData("UniqueId", "_E5D17755-D671-43ED-BD7D-F6538933069C");
        workItemNode3.metaData("Implementation", "Java");
        workItemNode3.metaData("elementname", "Audit user");
        workItemNode3.metaData("Type", "Service Task");
        workItemNode3.metaData("OperationRef", "_E5D17755-D671-43ED-BD7D-F6538933069C_ServiceOperation");
        workItemNode3.metaData("x", 910);
        workItemNode3.metaData("width", 154);
        workItemNode3.metaData("y", 138);
        workItemNode3.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory endNode4 = factory.endNode(4);
        endNode4.name("End Event 2");
        endNode4.terminate(false);
        endNode4.metaData("UniqueId", "_95885F94-555D-485A-BB86-5E835B9C3389");
        endNode4.metaData("elementname", "End Event 2");
        endNode4.metaData("x", 1144);
        endNode4.metaData("width", 56);
        endNode4.metaData("y", 297);
        endNode4.metaData("height", 56);
        endNode4.done();
        org.jbpm.ruleflow.core.factory.SplitFactory splitNode5 = factory.splitNode(5);
        splitNode5.name("User found?");
        splitNode5.type(2);
        splitNode5.metaData("UniqueId", "_13BAF867-3CA8-4C6F-85C6-D3FD748D07D2");
        splitNode5.metaData("elementname", "User found?");
        splitNode5.metaData("x", 774);
        splitNode5.metaData("width", 56);
        splitNode5.metaData("y", 161);
        splitNode5.metaData("height", 56);
        splitNode5.constraint(3, "_4EFC11AE-52BB-4EEF-B241-CFAAE4B7AE93", "DROOLS_DEFAULT", "java", kcontext -> {
            org.acme.travels.User traveller = (org.acme.travels.User) kcontext.getVariable("traveller");
            java.lang.String username = (java.lang.String) kcontext.getVariable("username");
            return traveller != null;
        }, 0);
        splitNode5.constraint(4, "_BF17E37C-6984-4F27-9B6A-A9880E95B019", "DROOLS_DEFAULT", "java", kcontext -> {
            org.acme.travels.User traveller = (org.acme.travels.User) kcontext.getVariable("traveller");
            java.lang.String username = (java.lang.String) kcontext.getVariable("username");
            return traveller == null;
        }, 0);
        splitNode5.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory endNode6 = factory.endNode(6);
        endNode6.name("Done");
        endNode6.terminate(false);
        endNode6.metaData("UniqueId", "_FD4D7A19-558E-4347-8CFE-376792FEDA57");
        endNode6.metaData("elementname", "Done");
        endNode6.metaData("x", 1144);
        endNode6.metaData("width", 56);
        endNode6.metaData("y", 161);
        endNode6.metaData("height", 56);
        endNode6.done();
        factory.connection(1, 2, "_DBA10C00-6407-4EF5-9D85-01177AE8F39F");
        factory.connection(5, 3, "_4EFC11AE-52BB-4EEF-B241-CFAAE4B7AE93");
        factory.connection(5, 4, "_BF17E37C-6984-4F27-9B6A-A9880E95B019");
        factory.connection(2, 5, "_52A670E9-9448-4BDA-8589-FC646BC41FC7");
        factory.connection(3, 6, "_4EB288EA-3135-4B97-BB46-E77159F78832");
        factory.validate();
        return factory.getProcess();
    }
}
