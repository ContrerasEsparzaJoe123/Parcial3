import javax.swing.*;

public class ArbolBinarioBusqueda extends JFrame {
    private NodoEmpleado raiz;

    private Main main;



    public ArbolBinarioBusqueda(){
        this.raiz = null;
    }

    public boolean isEmpty(){
        return (this.raiz==null);
    }

    public boolean insertar(Empleado empleado){
        boolean respuesta = false;

        if (this.isEmpty()){
            NodoEmpleado nuevo =new NodoEmpleado(empleado);
            nuevo.setEmpleado(empleado);
            nuevo.setIzq(new ArbolBinarioBusqueda());
            nuevo.setDer(new ArbolBinarioBusqueda());
            this.raiz= nuevo;
            respuesta = true;
            System.out.println("Empleado agregado");
        }else {
            if (empleado.getId()<this.raiz.getEmpleado().getId()){
                this.raiz.getIzq().insertar(empleado);
            }
            if (empleado.getId()>this.raiz.getEmpleado().getId()){
                this.raiz.getDer().insertar(empleado);
            }
        }

        return respuesta;
    }

    public String preOrden(){
        String rr = "";
        String data = "";
        if(!this.isEmpty()) {
            data = "> \n"+this.raiz.toString()+data+this.raiz.getIzq().preOrden()+this.raiz.getDer().preOrden();
            rr = rr + data;
        }return rr;
     /*   StringBuilder res1 = new StringBuilder();

      if (!this.isEmpty()){
            res1.append(this.raiz.getEmpleado()+"->");
            System.out.println(this.raiz.getEmpleado()+"->");
            this.raiz.getIzq().preOrden();
            this.raiz.getDer().preOrden();
        }
        return res1;*/
    }
    public String posOrden(){
        String rr = "";
        String data = "";
        if(!this.isEmpty()) {
            data = this.raiz.getIzq().posOrden()+this.raiz.getDer().posOrden()+"> \n"+this.raiz.toString()+data;
            rr = rr + data;
        }return rr;
       /* if (!this.isEmpty()){
            this.raiz.getIzq().posOrden();
            this.raiz.getDer().posOrden();
            System.out.println(this.raiz.getEmpleado()+"->");
        }*/
    }
    public String inOrden(){
        String rr = "";
        String data = "";
        if(!this.isEmpty()) {

            data = this.raiz.getIzq().inOrden()+"> \n"+this.raiz.toString()+data+this.raiz.getDer().inOrden();
            rr = rr + data;
        }return rr;
        /*if (!this.isEmpty()){
            this.raiz.getIzq().inOrden();
            System.out.println(this.raiz.getEmpleado()+"->");
            this.raiz.getDer().inOrden();
*/
        }

    public boolean existe(int num){
        boolean respuesta = false;

        if (!this.isEmpty()){
            if (this.raiz.getEmpleado().getId() == num){
                respuesta= true;
            }else {
                if (num < this.raiz.getEmpleado().getId()){
                    respuesta=this.raiz.getIzq().existe(num);

                }
                else {
                    respuesta=this.raiz.getDer().existe(num);
                }}
        }
        return respuesta;
    }
}

