package com.example.news.di

import android.app.Application
import androidx.room.Room
import com.example.news.db.ArticleDatabase
import com.example.news.db.Converters
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Provides
    @Singleton
    fun provideDatabase(app: Application) =
        Room.databaseBuilder(app, ArticleDatabase::class.java, "article_database")
            .addTypeConverter(Converters())
            .build()

    @Provides
    fun provideArticleDao(db: ArticleDatabase) = db.getArticleDao()
}