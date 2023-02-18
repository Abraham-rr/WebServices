
package natrualRomano;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "ws_NaturalARomano")
public class ws_NaturalARomano {

    
    @WebMethod(operationName = "natural") //nuetro operacion name lo llamaremos nat
    public String natrualRom(@WebParam(name = "natural") String txt) {
            
        boolean bol=false;
        String msg;
        String un="";
        String de="";
        String cent="";
        int u=0,d=0,c=0;
             
        if(txt.substring(0,1).matches("[a-z]*")){
            bol = false;
        }else{
            bol = true;
        }
        
        if(bol==true){
                int ntl = 0;
                try{
                    ntl = Integer.parseInt(txt);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }

                c = (ntl % 1000) / 100;
                d = ((ntl % 1000) % 100) / 10;
                u = (((ntl % 1000) % 100) % 10);

                if((ntl<1) || (ntl>100))  
                {
                    msg = "Valor fuera de Rango";
                }
                else{

                    switch (c) {
                    case 1:
                    cent += "C";
                    break;
                    }

                    switch (d) {
                    case 1:
                    de += "X";
                    break;
                    case 2:
                    de += "XX";
                    break;
                    case 3:
                    de += "XXX";
                    break;
                    case 4:
                    de += "XL";
                    break;
                    case 5:
                    de += "L";
                    break;
                    case 6:
                    de += "LX";
                    break;
                    case 7:
                    de += "LXX";
                    break;
                    case 8:
                    de += "LXXX";
                    break;
                    case 9:
                    de += "XC";
                    break;
                    }

                    switch (u) {
                    case 1:
                    un += "I";
                    break;
                    case 2:
                    un += "II";
                    break;
                    case 3:
                    un += "III";
                    break;
                    case 4:
                    un += "IV";
                    break;
                    case 5:
                    un += "V";
                    break;
                    case 6:
                    un += "VI";
                    break;
                    case 7:
                    un += "VII";
                    break;
                    case 8:
                    un += "VIII";
                    break;
                    case 9:
                    un += "IX";
                    break;
                    }

                 msg="Tu numero "+ntl+" En Romano es " + cent + de + un;

            }
        }else{
            msg="Valor no valido";
        }
        return msg;
    }
}
