package javaposse.jobdsl.dsl.helpers.toplevel

import javaposse.jobdsl.dsl.AbstractContext
import javaposse.jobdsl.dsl.JobManagement
import javaposse.jobdsl.dsl.RequiresPlugin

class LockableResourcesContext extends AbstractContext {
    String resourcesVariable
    Integer resourceNumber
    String labelName

    LockableResourcesContext(JobManagement jobManagement) {
        super(jobManagement)
    }

    /**
     * Name for the Jenkins variable to store the reserved resources in.
     */
    void resourcesVariable(String resourcesVariable) {
        this.resourcesVariable = resourcesVariable
    }

    /**
     * Number of resources to request. By default all resources are requested.
     */
    void resourceNumber(int resourceNumber) {
        this.resourceNumber = resourceNumber
    }

    /**
     * Label assigned to group of lockable resources
     *
     * @since 1.43
     */
    @RequiresPlugin(id = 'lockable-resources', minimumVersion = '1.7')
    void labelName(String labelName) {
        this.labelName = labelName
    }
}
