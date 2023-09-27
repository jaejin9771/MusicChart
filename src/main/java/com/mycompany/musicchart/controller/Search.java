/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicchart.controller;

import com.mycompany.musicchart.model.Chart;

/**
 *
 * @author 재진
 */
public class Search {
    
    public static Object[][] MusicSearch(Object[][] rowData,String str1, String str2,Chart rg) {
        
        int j = 0;
        if(str1.isEmpty() == false){
            if(str2.isEmpty() == false) {
                for(int i=0;i<rowData.length;i++){
                    if(rg.getListTitle().get(i).contains(str1)){
                       int colnum = 0;
                       rowData[j][colnum] = i+1;
                       rowData[j][++colnum] = rg.getListTitle().get(i);
                       rowData[j][++colnum] = rg.getListName().get(i);
                       j++;
                    }   
                }
            }
            else {
                for(int i=0;i<rowData.length;i++){
                    if(rg.getListTitle().get(i).contains(str1)){
                       int colnum = 0;
                       rowData[j][colnum] = i+1;
                       rowData[j][++colnum] = rg.getListTitle().get(i);
                       rowData[j][++colnum] = rg.getListName().get(i);
                       j++;
                    }   
                }
            }
        } 
        else if(str2.isEmpty()==false){
            if(str1.isEmpty()) {
                for(int i=0;i<rowData.length;i++){
                    if(rg.getListName().get(i).contains(str2)){
                       int colnum = 0;
                       rowData[j][colnum] = i+1;
                       rowData[j][++colnum] = rg.getListTitle().get(i);
                       rowData[j][++colnum] = rg.getListName().get(i);
                       j++;
                    }   
                }
            }          
        }
        return rowData;
    }
}
