package com.acme.eventbus.view;

import com.eventbus.client.event.ClearEvent;
import com.eventbus.client.event.ClearEventHandler;
import com.google.gwt.user.client.ui.TextBox;
import com.google.web.bindery.event.shared.EventBus;

public class TextBoxView extends TextBox {
	
	public TextBoxView(EventBus bus) {
		bus.addHandler(ClearEvent.TYPE, new ClearEventHandler() {
			
			@Override
			public void clear(ClearEvent event) {
				setText("");
			}
		});
	}

}
