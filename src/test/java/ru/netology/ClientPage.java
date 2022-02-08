package ru.netology;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ClientPage {
    final SelenideElement buttonPay = $(byText("Купить"));
    final SelenideElement buttonCredit = $(byText("Купить в кредит"));

//    public void pay(String number, String mounth, String year, String holder, String cvc)
//    {
//        final SelenideElement numberCard = $$(".input__inner").findBy(text("Номер карты")).$(".input__control").setValue(number);
//        final SelenideElement cardMounth = $$(".input__inner").findBy(text("Месяц")).$(".input__control").setValue(mounth);
//        final SelenideElement cardYear = $$(".input__inner").findBy(text("Год")).$(".input__control").setValue(year);
//        final SelenideElement cardHolder = $$(".input__inner").findBy(text("Владелец")).$(".input__control").setValue(holder);
//        final SelenideElement cardCvc = $$(".input__inner").findBy(text("CVC/CVV")).$(".input__control").setValue(cvc);
//    }

}