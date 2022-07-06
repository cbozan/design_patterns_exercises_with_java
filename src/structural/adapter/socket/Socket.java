/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.adapter.socket;

import structural.adapter.database.PostgreSQL;
import structural.adapter.entity.DBConnection;

/**
 *
 * @author https://github.com/cbozan
 */
public class Socket {
    public DBConnection getDBConnection(){
        return new DBConnection("192.168.1.1:8080");
    }
}
