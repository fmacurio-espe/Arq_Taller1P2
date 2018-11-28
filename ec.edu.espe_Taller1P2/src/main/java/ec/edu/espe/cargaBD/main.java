/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cargaBD;

/**
 *
 * @author AC
 */
public class main {    

    public static void main(String[] args) throws Exception {

        txtAMongo let=new txtAMongo();
        PostgresMongo mymongo = new PostgresMongo();
        MongoARedis mr = new MongoARedis();

        long start = System.currentTimeMillis();
        
        let.conectar();
        mymongo.conectarMysqlMongo();
        mr.EscribirDatos();
        long end = System.currentTimeMillis();
        System.out.println("Final Time:" + (end - start));
    }

}
