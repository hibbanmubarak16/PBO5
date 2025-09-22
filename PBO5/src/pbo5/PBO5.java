/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo5;

/**
 *
 * @author hibban mubarak
 */

class OutOfStockException extends RuntimeException {
    public OutOfStockException(String m) {
        super(m);
    }
}

// Using the Custom Exception
public class PBO5 {
    public static void ambilItem(int stock, int quantity) {
        if (quantity > stock) {
            throw new OutOfStockException("Stok tidak cukup! Stok saat ini: " + stock);
        }
        System.out.println("Berhasil ambil " + quantity + " item. Sisa stok: " + (stock - quantity));
    }

    public static void main(String[] args) {
        try {
            ambilItem(10, 15); 
        } catch (OutOfStockException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
