package com.acme.eventbus.view;

import com.acme.eventbus.client.ClearEvent;
import com.acme.eventbus.client.ClearEventHandler;
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
