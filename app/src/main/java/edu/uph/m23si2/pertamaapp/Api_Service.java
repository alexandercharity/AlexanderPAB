package edu.uph.m23si2.pertamaapp.api;

import java.util.List;

import edu.uph.m23si2.pertamaapp.model.City;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("regencies/{province_id}.json")
    Call<List<City>> getCities(@Path("province_id") String provinceId);
}
