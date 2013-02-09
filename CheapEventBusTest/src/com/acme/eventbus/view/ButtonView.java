package com.acme.eventbus.view;

import com.acme.eventbus.client.ClearEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.Button;

public class ButtonView extends Button {
	
	public ButtonView(final EventBus bus) {
		setText("clear");
		addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				bus.fireEvent(new ClearEvent());
			}
		});
	}

}
