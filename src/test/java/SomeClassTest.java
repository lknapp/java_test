import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SomeClassTest {
    @Test
    public void callsApp(){
        SomeClass someClass = new SomeClass();
        App app = mock(App.class);
        someClass.callApp(app);
        verify(app).getGreeting();

    }

}
