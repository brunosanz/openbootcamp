public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setNombre("Bruno");
        cliente.setEdad(34);
        cliente.setTelefono("7471223344");
        cliente.setCredito(1024);

        System.out.println("Hola " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Tu crédito es de :" + cliente.getCredito());

        trabajador.setNombre("Bruno");
        trabajador.setEdad(34);
        trabajador.setTelefono("7471223344");
        trabajador.setSalario(2048);

        System.out.println("Trabajador: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Tu salario es de :" + trabajador.getSalario());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{

    private double credito = 0;

    public void setCredito(double credito){
        this.credito = credito;
    }

    public double getCredito(){
        return this.credito;
    }

}

class Trabajador extends Persona{
    private double salario = 0;

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
}