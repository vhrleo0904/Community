package kr.co.itsco.community;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PostDAO {
    @Query("SELECT * FROM Post")
    List<Post> getAll();

    @Query("SELECT * FROM Post WHERE postid = :postid")
    Post select(int postid);

    @Update
    void update(Post post);

    @Insert
    void insert(Post post);

    @Delete
    void delete(Post post);
}
