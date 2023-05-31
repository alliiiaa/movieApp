package com.melisasan2017556451.filmuygulamasi.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.melisasan2017556451.filmuygulamasi.models.Movies;

//abstract databasae class for storing favorite movies

//The class annotated with a @Database annotation that includes an entities array that lists all of the data entities associated with the database.
    @Database(entities = {Favorite.class},version = 5,exportSchema = false)
// abstract method of WatchedDao return type
    public abstract class MoviesDb extends RoomDatabase{
        public abstract MovieDao movieDao();
    }

