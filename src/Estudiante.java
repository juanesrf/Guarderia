public class Estudiante {
    private String nombre;
    private int edad;
    private String sexo;
    private double documento;
    private String alergia;
    private double contacto;
    private String Acudiente;
    public Estudiante( String nombre, int edad, String sexo, double documento, String alergia, double contacto, String Acudiente) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.documento = documento;
        this.alergia = alergia;
        this.contacto = contacto;
        this.Acudiente = Acudiente;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getAlergia() {
        return alergia;
    }
    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }
    public double getContacto() {
        return contacto;
    }
    public void setContacto(int contacto) {
        this.contacto = contacto;
    }
    public String getAcudiente() {
        return Acudiente;
    }
    public void setAcudiente(String Acudiente) {
        this.Acudiente = Acudiente;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", documento=" + documento +
                ", alergia='" + alergia + '\'' +
                ", contacto=" + contacto +
                ", Acudiente='" + Acudiente + '\'' +
                '}';
    }
}
