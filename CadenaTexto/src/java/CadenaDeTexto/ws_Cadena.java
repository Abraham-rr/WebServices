/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadenaDeTexto;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "ws_Cadena")
public class ws_Cadena {

     @WebMethod(operationName = "cadena")
    public String InvertirCadena(@WebParam(name = "cadena") String cadena) {
        String msg = "";
        String txt1 = "";
        int vocalA = 0;
        int vocalE = 0;
        int vocalI = 0;
        int vocalO= 0;
        int vocalU = 0;
        int cont;
     for(cont = 0; cont < cadena.length(); cont++)
        {     
            char actual = cadena.charAt(cont);
            txt1 = actual+txt1;
            
            switch (actual) {
                case 'a':
                    vocalA++;
                    break;
                case 'e':
                    vocalE++;
                    break;
                case 'i':
                    vocalI++;
                    break;
                case 'o':
                    vocalO++;
                    break;
                case 'u':
                    vocalU++;
                    break;
                default:
                    break;
            }
        }   
    String palabraInvertida = "";
    for (int x = cadena.length() - 1; x >= 0; x--)
        palabraInvertida = palabraInvertida + cadena.charAt(x);
    
    msg =  palabraInvertida + ", a[" + vocalA + "], e[" + vocalE + "], i[" +  vocalI + "], o[" + vocalO + "], u[" + vocalU + "]";
    
    return msg;
    }
}
