package codingtest.tui.com.codewarschallenge.API;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CodeWarsAPIImplementation  {

    public static final String BASE_URL = "https://www.codewars.com/api/v1/";
    private static Retrofit retrofit = null;
    private static OkHttpClient okHttpClient;

    public static CodeWarsAPI getCodeWarsApiClient() {

        okHttpClient = new OkHttpClient.Builder().build();

        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .build();
        }
        return retrofit.create(CodeWarsAPI.class);
    }

}
