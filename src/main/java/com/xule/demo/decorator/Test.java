package com.xule.demo.decorator;

public class Test {


    //说明: 利用组合方式实现装饰者模式，如有扩展的方式，只需新增相应的装饰者类即可。
    public static void main(String args[]){

        SignatureService signatureService=new BaseSignatureService();

        SignatureService companySignatureDecorator=new CompanySignatureDecorator(signatureService);
        SignatureService phoneSignatureDecorator=new PhoneSignatureServiceDecorator(signatureService);

        String rs1=companySignatureDecorator.enchance("Lex");
        String rs2=phoneSignatureDecorator.enchance("Lex");

        System.out.println("company signature enhancement="+rs1);
        System.out.println("phone signature enhancement="+rs2);
    }
}
