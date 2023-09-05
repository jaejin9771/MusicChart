package com.mycompany.musicchart;

import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Chart {
    ArrayList<String> listTitle;
    ArrayList<String> listName;
    
    public Chart() { }
    
    public Chart(String URL1, String URL2, String URL3) {
        // URL1 = 음악차트 주소
        // URL2 = 제목 가져오기 위한 문장
        // URL3 = 가수 가져오기 위한 문장
        String charturl = URL1;
        String titleurl = URL2;
        String singerurl = URL3;
        
        Document doc = null;
        
        try {
            doc = Jsoup.connect(charturl).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        listTitle = new ArrayList<>();
        listName = new ArrayList<>();
        
        Elements rank_list = doc.select(titleurl);
        Elements rank_list_name = doc.select(singerurl);
        
        for(Element a : rank_list) {
            listTitle.add(a.text());
        }
        for(Element b : rank_list_name) {
            listName.add(b.text());
        }
    }

    public ArrayList<String> getListTitle() {
        return listTitle;
    }

    public void setListTitle(ArrayList<String> listTitle) {
        this.listTitle = listTitle;
    }

    public ArrayList<String> getListName() {
        return listName;
    }

    public void setListName(ArrayList<String> listName) {
        this.listName = listName;
    }
}
