package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class AuditService_auditUser_3_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.travels.services.AuditService service;

    public AuditService_auditUser_3_Handler() {
        this(new org.acme.travels.services.AuditService());
    }

    @javax.inject.Inject()
    public AuditService_auditUser_3_Handler(org.acme.travels.services.AuditService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        service.auditUser((org.acme.travels.User) workItem.getParameter("Parameter"));
        workItemManager.completeWorkItem(workItem.getStringId(), null);
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.travels.services.AuditService_auditUser_3_Handler";
    }
}
