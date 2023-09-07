/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicchart.controller;

import com.mycompany.musicchart.model.Chart;

/**
 *
 * @author baejaejin
 */
public class ChartMaker {
    public static Object[][] ChartMake(Object[][] rowData,Chart m){
        for(int i = 0; i < rowData.length; i++) {
            int colnum = 0;
            rowData[i][colnum] = i + 1;
            rowData[i][++colnum] = m.getListTitle().get(i);
            rowData[i][++colnum] = m.getListName().get(i);
        }
        return rowData;
    }
}
