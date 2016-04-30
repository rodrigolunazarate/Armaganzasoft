/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armaganzasoft.repositorys;

/**
 *
 * @author Rodrigo
 */
import armaganzasoft.models.Recet;
import armaganzasoft.interfaces.Materiales;
import armaganzasoft.interfaces.Maquinas;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecetaRepository extends BaseRepository {
    
     private PreparedStatement query;
    
    public RecetaRepository() {
        
    }
    
     public boolean addRece(Recet recet){
        
        try {
            
            query = con.prepareStatement("INSERT INTO receta (code,"
                    + "name,"
                    + "arena,"
                    + "agua,"
                    + "grava,"
                    + "cemento,"
                    + "aditivo) "
                                        + "VALUES(?,?,?,?,?,?,?);"
                                        );
            
            
            query.setString(1, recet.getCode());
            query.setString(2, recet.getName());
            query.setString(3, recet.getArena());            
            query.setString(4, recet.getAgua());
            query.setString(5, recet.getGrava());
            query.setString(6, recet.getCemento());            
            query.setString(7, recet.getAditivo());
  
            
            if( !query.execute() ){
                return true;
            }
            query.close();
            
        } catch (SQLException ex) {
            System.out.println("Error: "+ ex);
        }
            return false;
        }
    }    


