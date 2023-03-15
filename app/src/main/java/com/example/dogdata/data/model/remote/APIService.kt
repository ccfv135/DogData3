package com.example.dogdata

import com.example.dogdata.data.model.DogsResponse
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface APIService {
    @GET
    suspend fun getDogsByBreeds(@Url url:String): Response<DogsResponse>

    @GET("/example/example2/{id}/loquesea")
    fun getCharacterByName2(@Path("id") id: String): Call<DogsResponse>


    @GET("/example/example2/v2/loquesea")
    fun getCharacterByName3(
        @Query("pet") pet: String,
        @Query("name") name: String
    ): Call<DogsResponse>

    @POST
    fun getEVERYTHING(@Body exampleArisDto: ExampleArisDto): Call<*>


    @Multipart
    @POST
    fun getEVERYTHING2(
        @Part image: MultipartBody.Part,
        @Part("example") myExample: String
    ): Call<*>
}
data class ExampleArisDto(val name: String, val age: Int)

