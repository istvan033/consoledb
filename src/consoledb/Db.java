package consoledb;

import java.sql.*;

public class Db {
    private String database;
    private String user;
    private String password;
    private Connection kapcsolat;

    public Db(String database, String user, String password) {
        this.database = database;
        this.user = user;
        this.password = password;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("A Connector nem található!");
        }
        
        try{
            this.kapcsolat = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + database, this.user, this.password);
        } catch (SQLException ex) {
            System.out.println("Hiba az adatbázis kapcsolatban!");
        }
    }
    
    public void addGyumi(){
            try{
                Statement statement = this.kapcsolat.createStatement();
            } catch (SQLException ex) {
                System.out.println("Hiba a Statement létrehozásánál");
            }
            String sql = "insert ino gyumi values(null,'körte',10);";
            statement
            System.out.println(sql);
        }
    
    
}
