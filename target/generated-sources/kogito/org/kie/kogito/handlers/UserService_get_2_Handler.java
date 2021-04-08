package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class UserService_get_2_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.travels.services.UserService service;

    public UserService_get_2_Handler() {
        this(new org.acme.travels.services.UserService());
    }

    @javax.inject.Inject()
    public UserService_get_2_Handler(org.acme.travels.services.UserService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.get((String) workItem.getParameter("Parameter"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("Result", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.travels.services.UserService_get_2_Handler";
    }
}
