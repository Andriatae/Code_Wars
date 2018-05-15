package codingtest.tui.com.codewarschallenge.Model;

import android.util.Log;

import codingtest.tui.com.codewarschallenge.API.CodeWarsAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CodeWarsUserCallback implements Callback<User> {

    ApplicationModelContract applicationModelContract;

    public CodeWarsUserCallback(ApplicationModelContract applicationModelContract) {
        this.applicationModelContract = applicationModelContract;
    }

    @Override
    public void onResponse(Call<User> call, Response<User> response) {
        if( response.isSuccessful() ) {
            User user = response.body();
            applicationModelContract.setUserResponse(user);
        }
    }

    @Override
    public void onFailure(Call<User> call, Throwable t) {
        Log.e("Call error:", t.getMessage());
    }

    public void findUser(CodeWarsAPI codeWarsAPI, String user) {
        Call<User> newUser = codeWarsAPI.findUser(user);
        newUser.enqueue(this);
    }

}
