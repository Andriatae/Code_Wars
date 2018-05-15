package codingtest.tui.com.codewarschallenge.DependencyInjection;

import javax.inject.Singleton;

import codingtest.tui.com.codewarschallenge.MainActivityContract;
import codingtest.tui.com.codewarschallenge.MainActivityFragment;
import codingtest.tui.com.codewarschallenge.MainActivityPresenter;
import codingtest.tui.com.codewarschallenge.Model.ApplicationModel;
import codingtest.tui.com.codewarschallenge.Model.ApplicationModelContract;
import dagger.Module;
import dagger.Provides;

@Module
public class AppInjector {

    @Provides
    @Singleton
    MainActivityContract.Presenter provideMainActivityContractPresenter(ApplicationModelContract applicationModelContract) {
        return new MainActivityPresenter(applicationModelContract);
    }

    @Provides
    @Singleton
    ApplicationModelContract provideApplicationModelContract() {
        return new ApplicationModel();
    }

}