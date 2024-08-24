package com.xule.demo.decorator;

public class PhoneSignatureServiceDecorator implements SignatureService{

    private SignatureService signatureService;

    public PhoneSignatureServiceDecorator(SignatureService signatureService){
        this.signatureService=signatureService;
    }

    public String enchance(String signature){
        return signatureService.enchance(signature)+"phone";
    }
}
