package edu.uph.m23si2.pertamaapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import edu.uph.m23si2.pertamaapp.api.ApiClient;
import edu.uph.m23si2.pertamaapp.api.ApiService;
import edu.uph.m23si2.pertamaapp.model.City;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    private Spinner spinnerProvinsi, spinnerKota;
    private ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        spinnerProvinsi = findViewById(R.id.spinnerProvinsi);
        spinnerKota = findViewById(R.id.spinnerKota);

        apiService = ApiClient.getClient().create(ApiService.class);

        String[] provinsi = {"31 - DKI Jakarta", "32 - Jawa Barat", "33 - Jawa Tengah"};
        String[] provinsiId = {"31", "32", "33"};

        ArrayAdapter<String> provinsiAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, provinsi);
        provinsiAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerProvinsi.setAdapter(provinsiAdapter);

        spinnerProvinsi.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
                String selectedProvinceId = provinsiId[position];
                loadCities(selectedProvinceId);
            }

            @Override
            public void onNothingSelected(android.widget.AdapterView<?> parent) { }
        });
    }

    private void loadCities(String provinceId) {
        apiService.getCities(provinceId).enqueue(new Callback<List<City>>() {
            @Override
            public void onResponse(Call<List<City>> call, Response<List<City>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<String> cityNames = new ArrayList<>();
                    for (City c : response.body()) {
                        cityNames.add(c.getName());
                    }
                    ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(RegisterActivity.this,
                            android.R.layout.simple_spinner_item, cityNames);
                    cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerKota.setAdapter(cityAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<City>> call, Throwable t) {
                Toast.makeText(RegisterActivity.this, "Gagal load kota", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
