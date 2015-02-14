/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import clients.UserClient;
import entities.User;

/**
 *
 * @author montynewman
 */
public class Utilities {
    public static User getUserByID(String id){
        User result = null;
        
        UserClient userClient = new UserClient();
        result = userClient.find(User.class, id);
        
        return result;
    }
}
