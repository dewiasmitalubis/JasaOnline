package com.myta.jasaonline.services

import com.myta.jasaonline.models.DefaultResponse
import com.myta.jasaonline.models.LoginResponse
import com.myta.jasaonline.models.User
import retrofit2.Call
import retrofit2.http.*


interface UserService {
    @GET("login")
    fun loginUser(
        @QueryMap filter: HashMap<String, String>
    ): Call<LoginResponse>

    @POST("users")
    fun registerUser(
        @Body newUser: User
    ): Call<DefaultResponse>

    @PUT("users")
    fun updateUser(
        @Body updatedUser: User
    ): Call<DefaultResponse>

    @DELETE("users/{id}")
    fun deleteUser(
        @Path("id") id: Int
    ): Call<DefaultResponse>

}