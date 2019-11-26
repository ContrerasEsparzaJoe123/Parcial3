public class ArbolBinarioBusqueda {
    private NodoEmpleado raiz;

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

    public void preOrden(){
        if (!this.isEmpty()){

            System.out.println(this.raiz.getEmpleado()+"->");
            this.raiz.getIzq().preOrden();
            this.raiz.getDer().preOrden();
        }
    }
    public void posOrden(){
        if (!this.isEmpty()){
            this.raiz.getIzq().posOrden();
            this.raiz.getDer().posOrden();
            System.out.println(this.raiz.getEmpleado()+"->");
        }
    }
    public void inOrden(){
        if (!this.isEmpty()){
            this.raiz.getIzq().inOrden();
            System.out.println(this.raiz.getEmpleado()+"->");
            this.raiz.getDer().inOrden();

        }
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

