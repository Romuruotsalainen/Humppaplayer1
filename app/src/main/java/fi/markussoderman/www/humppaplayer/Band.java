package fi.markussoderman.www.humppaplayer;

public class Band {
    String mName;
    String mSong;

    public Band(String name, String song) {
        mName = name;
        mSong = song;
    }

    public String getName(){
        return mName;
    }

    public String getSong(){
        return mSong;
    }

    public String getIdentifier(){
        return mName;
    }
}
