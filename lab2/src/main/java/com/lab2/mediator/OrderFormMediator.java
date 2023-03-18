package com.lab2.mediator;

import com.lab2.components.DateSelector;
import com.lab2.components.NameInputField;
import com.lab2.components.OtherPersonReceiverCheckbox;
import com.lab2.components.PhoneInputField;
import com.lab2.components.PickupWithoutDeliveryCheckbox;
import com.lab2.components.TimeSelector;

public class OrderFormMediator implements Mediator {

    private final PickupWithoutDeliveryCheckbox pickupWithoutDeliveryCheckbox;
    private final OtherPersonReceiverCheckbox otherPersonReceiverCheckbox;
    private final NameInputField nameInputField;
    private final PhoneInputField phoneInputField;
    private final DateSelector dateSelector;
    private final TimeSelector timeSelector;

    public OrderFormMediator(PickupWithoutDeliveryCheckbox pickupWithoutDeliveryCheckbox,
                             OtherPersonReceiverCheckbox otherPersonReceiverCheckbox, NameInputField nameInputField,
                             PhoneInputField phoneInputField, DateSelector dateSelector, TimeSelector timeSelector) {

        //initialize
        this.pickupWithoutDeliveryCheckbox = pickupWithoutDeliveryCheckbox;
        this.otherPersonReceiverCheckbox = otherPersonReceiverCheckbox;
        this.nameInputField = nameInputField;
        this.phoneInputField = phoneInputField;
        this.dateSelector = dateSelector;
        this.timeSelector = timeSelector;
        //set mediators
        this.pickupWithoutDeliveryCheckbox.setMediator(this);
        this.otherPersonReceiverCheckbox.setMediator(this);
        this.nameInputField.setMediator(this);
        this.phoneInputField.setMediator(this);
        this.dateSelector.setMediator(this);
        this.timeSelector.setMediator(this);
    }

    public void notify(String action, String... parameters) {
        // If 'pickup in the shop' checked - then disable all other components
        if (action.equals("pickup")) {
            if (parameters[0].equals("true")) {
                otherPersonReceiverCheckbox.setActive(false);
                nameInputField.setActive(false);
                phoneInputField.setActive(false);
                dateSelector.setActive(false);
                timeSelector.setActive(false);
            } else {
                otherPersonReceiverCheckbox.setActive(true);
                nameInputField.setActive(true);
                phoneInputField.setActive(true);
                dateSelector.setActive(true);
                timeSelector.setActive(true);
            }
        }
        // If 'other person receiver' checked - then enable name and phone fields
        if (action.equals("otherReceiver")) {
            if (parameters[0].equals("true")) {
                nameInputField.setActive(true);
                phoneInputField.setActive(true);
            } else {
                nameInputField.setActive(false);
                phoneInputField.setActive(false);
            }
        }
        // When date is selected - show available timeslot for date
        if (action.equals("date")) {
            timeSelector.showAvailableTimeForDate(parameters[0]);
        }
    }
}
