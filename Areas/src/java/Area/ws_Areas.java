
package Area;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "ws_Areas")
public class ws_Areas {

    
    @WebMethod(operationName = "AreaCuadrado")
    public int AreaCuadrado(@WebParam(name = "l") int l) {
        int area = l * l;
        return area;
    }

    
    @WebMethod(operationName = "AreaCirculo")
    public double AreaCirculo(@WebParam(name = "r") int r) {
        double area = 3.1416 * r * r;
        return area;
    }

   
    @WebMethod(operationName = "AreaTriangulo")
    public int AreaTriangulo(@WebParam(name = "b") int b, @WebParam(name = "h") int h) {
        int area = b * h / 2;
        return area;
    }

    
    @WebMethod(operationName = "AreaRombo")
    public int AreaRombo(@WebParam(name = "diamen") int diamen, @WebParam(name = "diamay") int diamay) {
       int area = diamen * diamay / 2;
        return area;
    }
    
    @WebMethod(operationName = "AreaPentagono")
    public int AreaPentagono(@WebParam(name = "lado") int lado, @WebParam(name = "perimetro") int perimetro, @WebParam(name = "apotema") int apotema) {
        int area = lado * 5 * perimetro * apotema / 2;
        return area;
    }
}
