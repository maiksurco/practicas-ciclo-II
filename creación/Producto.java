package creación;

public class Producto {
    String producto;
    String costo;


    public Producto() {
    }
    public Producto(String producto) {
        this.producto=producto;
    }
    public Producto(String producto, String costo) {
        this.producto=producto;
        this.costo=costo;
    }

    public void laugh() {
        System.out.println( producto + " jejeje!");

	
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	public void imprimirlista(Producto proc) {
	}
    }
