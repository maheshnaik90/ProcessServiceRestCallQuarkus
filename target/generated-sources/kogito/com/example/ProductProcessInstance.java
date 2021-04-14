package com.example;

public class ProductProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<ProductModel> {

    public ProductProcessInstance(com.example.ProductProcess process, ProductModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public ProductProcessInstance(com.example.ProductProcess process, ProductModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public ProductProcessInstance(com.example.ProductProcess process, ProductModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public ProductProcessInstance(com.example.ProductProcess process, ProductModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(ProductModel variables) {
        return variables.toMap();
    }

    protected void unbind(ProductModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
