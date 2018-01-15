/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.Serializable;
import javax.ejb.Remote;

/**
 *
 * @author Apple
 */
@Remote
public interface MaiSessionBeanRemote {

    int add(int a, int b);

    public Product getP();

    public class Product implements Serializable{

        private String masach;
        private String tieude;

        public Product(String masach, String tieude) {
            this.masach = masach;
            this.tieude = tieude;
        }

        public Product() {
            this.masach = "Ma sach";
            this.tieude = "Tieu de";
        }

        public String getMasach() {
            return masach;
        }

        public void setMasach(String masach) {
            this.masach = masach;
        }

        public String getTieude() {
            return tieude;
        }

        public void setTieude(String tieude) {
            this.tieude = tieude;
        }

    }

}
