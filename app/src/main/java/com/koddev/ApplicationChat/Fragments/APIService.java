package com.koddev.ApplicationChat.Fragments;

import com.koddev.ApplicationChat.Notifications.MyResponse;
import com.koddev.ApplicationChat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAEgxm8jY:APA91bEdEQVF337lqcD9C1tIj1EUHs9LGb_qxeyBe-gR49AOVdIsplSf7eDCF_njfqOhQ9I3IWhe_vgRPepChvIb3Y00QQXM7jmCEUB9ryzdegC2ChGBuhoMa6wEcgU7m8VXDUoV4V95"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
