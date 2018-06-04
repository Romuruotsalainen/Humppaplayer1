package fi.markussoderman.www.humppaplayer;

import android.media.Image;

public class Band {
    String mName;
    String mSong;
    int mImage;

    public Band(String name, String song, int image) {
        mName = name;
        mSong = song;
        mImage = image;
    }

    public String getName(){
        return mName;
    }

    public String getSong(){
        return mSong;
    }

    public int getImage() { return mImage; }

    public String getIdentifier(){
        return mName;
    }
}
