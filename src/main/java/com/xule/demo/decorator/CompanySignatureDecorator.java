package com.xule.demo.decorator;

public class CompanySignatureDecorator implements SignatureService{

    private SignatureService signatureService;

    public CompanySignatureDecorator(SignatureService signatureService){
        this.signatureService=signatureService;
    }

    public String enchance(String signature){
        return signatureService.enchance(signature)+"company";
    }
}
