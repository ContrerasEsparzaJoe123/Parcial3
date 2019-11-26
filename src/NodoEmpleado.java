public class NodoEmpleado {
    private Empleado  empleado;
    private NodoEmpleado siguiente;
    private ArbolBinarioBusqueda izq;
    private ArbolBinarioBusqueda der;



    public NodoEmpleado(Empleado empleado){
        this.empleado = empleado;
        this.der=der;
        this.izq=izq;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public NodoEmpleado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEmpleado siguiente) {
        this.siguiente = siguiente;
    }
    public String toString(){
        return empleado.toString();
    }
    public ArbolBinarioBusqueda getIzq() {
        return izq;
    }

    public void setIzq(ArbolBinarioBusqueda izq) {
        this.izq = izq;
    }

    public ArbolBinarioBusqueda getDer() {
        return der;
    }

    public void setDer(ArbolBinarioBusqueda der) {
        this.der = der;
    }
}

