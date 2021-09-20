package com.example.apiintegration

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ApiInterface {

    @GET("posts")

    fun getData(): Call<List<MyDataItem>>

    @POST("posts")

    suspend fun postDataToServer(@Body requestBody: RequestBody): retrofit2.Response<ResponseBody>

    @PUT("posts/{id}")
    suspend fun updateDataToServer(
        @Path("id") id: Int,
        @Body requestBody: RequestBody
    ): retrofit2.Response<ResponseBody>//important line coz of changes

    @DELETE("posts/{id}")
    suspend fun deleteDataFromServe(@Path("id") id: Int): Response<ResponseBody>

}