/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.adapter.database;

import structural.adapter.entity.DBConnection;

/**
 *
 * @author https://github.com/cbozan
 */
public class PostgreSQL extends DBConnection{
    
    public PostgreSQL(String connection) {
        super(connection);
    }
    
}
