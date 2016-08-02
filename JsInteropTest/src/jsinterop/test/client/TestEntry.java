package jsinterop.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class TestEntry implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(new TestView());
	}

}
