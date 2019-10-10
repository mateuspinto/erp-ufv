/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufv.caf.erp;

import java.awt.PopupMenu;

/**
 *
 * @author Leandro Lázaro
 */
public class ComboItemProduct extends PopupMenu {

     private String key;
    private int value;

    public ComboItemProduct(String key, int value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public int getValue()
    {
        return value;
    }
}
