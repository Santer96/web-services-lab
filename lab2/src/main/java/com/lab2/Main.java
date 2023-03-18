package com.lab2;

import com.lab2.components.DateSelector;
import com.lab2.components.NameInputField;
import com.lab2.components.OtherPersonReceiverCheckbox;
import com.lab2.components.PhoneInputField;
import com.lab2.components.PickupWithoutDeliveryCheckbox;
import com.lab2.components.TimeSelector;
import com.lab2.mediator.OrderFormMediator;

public class Main {

    public static void main(String[] args) {
        PickupWithoutDeliveryCheckbox pickupWithoutDeliveryCheckbox = new PickupWithoutDeliveryCheckbox();
        OtherPersonReceiverCheckbox otherPersonReceiverCheckbox = new OtherPersonReceiverCheckbox();
        NameInputField nameInputField = new NameInputField();
        PhoneInputField phoneInputField = new PhoneInputField();
        DateSelector dateSelector = new DateSelector();
        TimeSelector timeSelector = new TimeSelector();

        new OrderFormMediator(pickupWithoutDeliveryCheckbox, otherPersonReceiverCheckbox,
                nameInputField, phoneInputField, dateSelector, timeSelector);

        pickupWithoutDeliveryCheckbox.checkBox(true);
//        'Pickup without delivery' checkbox checked: true
//        'Other person receiver' checkbox is active: false
//        Name input field is active: false
//        Phone input field is active: false
//        Date selector is active: false
//        Time selector is active: false

        pickupWithoutDeliveryCheckbox.checkBox(false);
//        'Pickup without delivery' checkbox checked: false
//        'Other person receiver' checkbox is active: true
//        Name input field is active: true
//        Phone input field is active: true
//        Date selector is active: true
//        Time selector is active: true

        otherPersonReceiverCheckbox.checkBox(true);
        nameInputField.enterName("John");
        phoneInputField.enterPhone("1234567");
        otherPersonReceiverCheckbox.checkBox(false);
//        'Other person receiver' checkbox checked: true
//        Name input field is active: true
//        Phone input field is active: true
//        Name entered: John
//        Phone entered: 1234567
//        'Other person receiver' checkbox checked: false
//        Name input field is active: false
//        Phone input field is active: false

        dateSelector.selectDate("03/18/2023");
        timeSelector.selectTime("2 PM");
//        Date selected: 03/18/2023
//        Displaying available time slots for date - 03/18/2023
//        Time selected: 2 PM
    }
}
