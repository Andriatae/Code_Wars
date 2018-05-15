package codingtest.tui.com.codewarschallenge.DependencyInjection;

import javax.inject.Singleton;

import codingtest.tui.com.codewarschallenge.MainActivity;
import codingtest.tui.com.codewarschallenge.MainActivityFragment;
import dagger.Component;

@Singleton
@Component(modules = {AppInjector.class})
public interface DependencyComponent {

    void inject(MainActivityFragment mainActivityFragment);
}
