
package Calculadora_ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "ws_Calculadora")
public class ws_Calculadora {


    @WebMethod(operationName = "suma")
    public int suma(@WebParam(name = "parameter") int parameter, @WebParam(name = "parameter1") int parameter1) {
         
        int rest = parameter + parameter1; 
        return rest;
    }

    
    @WebMethod(operationName = "resta")
    public int resta(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int rest = num1 - num2;
        
        return rest;
    }

    
    @WebMethod(operationName = "multiplicacion")
    public int multiplicacion(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
       int rest = num1 * num2;
       
        return rest;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Division")
    public int Division(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int rest = num1 / num2; 
        
        return rest;
    }

    
    @WebMethod(operationName = "Potencia")
    public int Potencia(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
       int res = 1;
       
       for(int i = 1; i<= num2; i++){
        res = res * num1;
    }
        return res;
    }

    
    @WebMethod(operationName = "RaizCuadra")
    public double RaizCuadra(@WebParam(name = "num1") double num1) {
        double rest  = Math.sqrt(num1);
        return rest;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "LogNatural")
    public double LogNatural(@WebParam(name = "num1") double num1, @WebParam(name = "base") int base) {
        double rest = (Math.log10(num1) / Math.log10(base));
        return rest;
    }

   
   
}
