package com.mycompany.musicchart;

public class MusicInfo {
    private int number;
    private String songname;
    private String singername;

    public MusicInfo(int number, String songname, String singername) {
        this.number = number;
        this.songname = songname;
        this.singername = singername;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getSingername() {
        return singername;
    }

    public void setSingername(String singername) {
        this.singername = singername;
    }
    
    
}
