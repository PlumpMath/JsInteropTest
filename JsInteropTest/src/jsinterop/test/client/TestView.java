package jsinterop.test.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import elemental2.Event;
import elemental2.EventListener;
import elemental2.Global;
import elemental2.HTMLButtonElement;
import elemental2.HTMLParagraphElement;

public class TestView extends Composite {

	private static TestViewUiBinder uiBinder = GWT.create(TestViewUiBinder.class);
	interface TestViewUiBinder extends UiBinder<Widget, TestView> {}
	
	@UiField HTMLButtonElement testButton, testButton2;
	@UiField HTMLParagraphElement button3Text;

	public TestView() {
		initWidget(uiBinder.createAndBindUi(this));
		
		testButton.addEventListener("click", e-> {
			Global.window.alert("Button clicked");
		});
		
		testButton2.addEventListener("click", new EventListener() {
			
			@Override
			public void handleEvent(Event evt) {
				Global.window.alert("Button 2 clicked");
			}
		});
		
		HTMLButtonElement testButton3 = (HTMLButtonElement) Global.document.createElement("button");
		testButton3.textContent = "Click to test";
		button3Text.parentNode.appendChild(testButton3);
		testButton3.addEventListener("click", e-> {
			Global.window.alert("Button 3 clicked");
		});
	}

}
