package com.example.news.repository

import com.example.news.api.RetrofitInstance
import com.example.news.db.ArticleDatabase
import javax.inject.Inject

class NewsRepository @Inject constructor(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

}