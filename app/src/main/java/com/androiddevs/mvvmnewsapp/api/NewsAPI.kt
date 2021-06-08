package com.androiddevs.mvvmnewsapp.api

import com.androiddevs.mvvmnewsapp.models.NewsResponse
import com.androiddevs.mvvmnewsapp.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBeakingNews(
        @Query(value =  "country")
        countryCode: String = "us",
        @Query(value = "page")
        pageNumber: Int = 1,
        @Query(value = "apiKey")
        apiKey: String = Constants.API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query(value =  "q")
        searchQuery: String ,
        @Query(value = "page")
        pageNumber: Int = 1,
        @Query(value = "apiKey")
        apiKey: String = Constants.API_KEY
    ): Response<NewsResponse>
}