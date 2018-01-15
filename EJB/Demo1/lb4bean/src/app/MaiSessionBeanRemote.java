/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.ejb.Remote;

/**
 *
 * @author Apple
 */
@Remote
public interface MaiSessionBeanRemote {

    int add(int a, int b);
    
}
