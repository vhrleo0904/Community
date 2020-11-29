package kr.co.itsco.community;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Post.class}, version = 1)
public abstract class PostDatabase extends RoomDatabase {

    private static PostDatabase INSTANCE;

    public abstract PostDAO postDAO();

    //디비객체생성 가져오기
    public static PostDatabase getAppDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, PostDatabase.class , "post-db").build();
        }
        return INSTANCE;
    }

    //디비객체제거
    public static void destroyInstance() {
        INSTANCE = null;
    }

}
