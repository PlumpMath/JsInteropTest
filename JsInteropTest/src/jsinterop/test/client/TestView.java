package jsinterop.test.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import elemental2.Global;
import elemental2.HTMLButtonElement;

public class TestView extends Composite {

	private static TestViewUiBinder uiBinder = GWT.create(TestViewUiBinder.class);
	interface TestViewUiBinder extends UiBinder<Widget, TestView> {}
	
	@UiField HTMLButtonElement testButton;

	public TestView() {
		initWidget(uiBinder.createAndBindUi(this));
		
		testButton.addEventListener("click", e-> {
			Global.window.alert("Button clicked");
		});
	}

}
