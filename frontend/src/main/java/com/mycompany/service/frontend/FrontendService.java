package com.mycompany.service.frontend;


import com.mycompany.service.backend.*;

public class FrontendService implements IFrontendService {

    private IBackendService1 backendService1;
    private IBackendService2 backendService2;

    public FrontendService(IBackendService1 backendService1, IBackendService2 backendService2) {
        this.backendService1 = backendService1;
        this.backendService2 = backendService2;
    }

    @Override
    public String getAgent() {
        return backendService1.computeSecretString()+backendService2.computeSecretNumber();
    }
}