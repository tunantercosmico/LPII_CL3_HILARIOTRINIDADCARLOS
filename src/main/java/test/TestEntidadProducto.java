package test;

import java.util.List;

import dao.ClassProductoImp;
import model.TblProductocl3;

public class TestEntidadProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblProductocl3 producto = new TblProductocl3();
        ClassProductoImp crud = new ClassProductoImp();
        
        /*
        producto.setNombrecl3("leche");
        producto.setPrecioventacl3(3.50);
        producto.setPreciocompcl3(2.80);
        producto.setEstadocl3("vigente");
        producto.setDescripcl3("evaporada light");
        crud.RegistrarProducto(producto);
        */
        
        List<TblProductocl3> listarProducto = crud.ListarProducto();
        for(TblProductocl3 p:listarProducto){
            System.out.println("C�digo: "+p.getIdproductoscl3()+"\n"+
                                "Nombre: "+p.getNombrecl3()+"\n"+
                                "Precio de Venta: "+p.getPrecioventacl3()+"\n"+
                                "Precio de Compra: "+p.getPreciocompcl3()+"\n"+
                                "Estado: "+p.getEstadocl3()+"\n"+
                                "Descripci�n: "+p.getDescripcl3()+"\n");
        }
	}

}
