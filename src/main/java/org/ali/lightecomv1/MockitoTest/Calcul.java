package org.ali.lightecomv1.MockitoTest;

public class Calcul {

    private ServiceTestExample serviceTestExample;

    public void setServiceTestExample(ServiceTestExample serviceTestExample) {
        this.serviceTestExample = serviceTestExample;
    }

    public int getTTC(int id) throws IllegalArgumentException{
        if(id==0) throw new IllegalArgumentException();
        return serviceTestExample.getPrix(id) + serviceTestExample.getPrix(id)*serviceTestExample.getTauxTva(id)/100;
    }
    public String getResult(int id){
        return "Result";
    }
}
