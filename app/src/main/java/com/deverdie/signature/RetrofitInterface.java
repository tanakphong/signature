package com.deverdie.signature;


import com.deverdie.signature.model.Response;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


public interface RetrofitInterface {
    @Multipart
    @POST("upload/upload_avatar.php")
    Call<Response> uploadImage(@Part MultipartBody.Part file);
}
