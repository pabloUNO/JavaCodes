package test;


import java.sql.*;


public class TestMySqlJDBC {
    public static void main(String[] args) {
        String url = "JDBC:mysql://127.0.0.1:3306/test?useSSL=false&useTimezone=true&ServerTimezone=UTC&allowPublicKeyRetrieval=true"; 
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection conexion = DriverManager.getConnection(url,"root", "admin"); 
            Statement instruccion = conexion. createStatement(); 
            String sql = "SELECT * FROM persona"; 
            ResultSet resultado = instruccion.executeQuery(sql); 
            while(resultado.next()) {
                System.out.println("Id Persona="+resultado.getInt("id_persona")); 
                System.out.println("nombre="+resultado.getNString("nombre")); 
                System.out.println("apellido="+resultado.getNString("apellido")); 
                System.out.println("email="+resultado.getNString("email")); 
                System.out.println("telefono="+resultado.getNString("telefono"));
            }
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
}
