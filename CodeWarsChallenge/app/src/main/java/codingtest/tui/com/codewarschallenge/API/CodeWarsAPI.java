package codingtest.tui.com.codewarschallenge.API;


import codingtest.tui.com.codewarschallenge.Model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CodeWarsAPI {

    @GET("users/{id_or_username}")
    Call<User> findUser(@Path("id_or_username") String idOrUsername);
}
