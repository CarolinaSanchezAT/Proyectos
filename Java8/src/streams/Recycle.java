/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;


class Bottle { }
public class Recycle {
public static void main(String[] args) {
Bottle b1 = new Bottle();
Bottle b2 = b1;
b1 = new Bottle();
Bottle b3 = b2;
b2 = null;
b1 = b3;
// do stuff
}
 }
 
