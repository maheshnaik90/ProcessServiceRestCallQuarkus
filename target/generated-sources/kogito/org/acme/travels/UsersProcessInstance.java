package org.acme.travels;

public class UsersProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<UsersModel> {

    public UsersProcessInstance(org.acme.travels.UsersProcess process, UsersModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public UsersProcessInstance(org.acme.travels.UsersProcess process, UsersModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public UsersProcessInstance(org.acme.travels.UsersProcess process, UsersModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public UsersProcessInstance(org.acme.travels.UsersProcess process, UsersModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(UsersModel variables) {
        return variables.toMap();
    }

    protected void unbind(UsersModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
